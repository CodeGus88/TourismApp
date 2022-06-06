package com.codegus.codegus.services;

import com.codegus.codegus.enumsandstatics.Messages;
import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BaseServiceImpl<E extends BaseModel<ID>, ID, ITEM, DTO, RQ, REP extends BaseRepository<E, ID>, MAP extends BaseMapper<E, ITEM, DTO, RQ>>
        implements BaseService<E, ID, ITEM, DTO, RQ> {

    @Autowired
    private REP repository;

    @Autowired
    private MAP mapper;

    @Override
    @Transactional(readOnly = true)
    public List<ITEM> findAll() {
        return mapper.entityListToItemList(repository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public DTO findById(ID id) {
        return mapper.entityToDto(repository.findById(id).get());
    }

    @Override
    @Transactional
    public DTO save(RQ request) {
        return mapper.entityToDto(
            repository.save(
                mapper.requestToEntity(
                        request
                )
            )
        );
    }

    @Override
    @Transactional
    public DTO update(ID id, RQ request) {
        E model;
        if(existsById(id)){
            model = mapper.requestToEntity(request);
            model.setId(id);
            return mapper.entityToDto(
                    repository.save(
                            model
                    )
            );
        }else {
            throw new RuntimeException(Messages.NOT_FOUND.replace("${id}", id.toString()));
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) {
        if(existsById(id)){
            repository.deleteById(id);
            return true;
        }else{
            throw new RuntimeException(Messages.NOT_FOUND.replace("${id}", id.toString()));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }
}
