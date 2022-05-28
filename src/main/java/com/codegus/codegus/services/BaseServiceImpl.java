package com.codegus.codegus.services;

import com.codegus.codegus.Tools;
import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<E extends BaseModel<ID>, ID, ITEM, DTO, RQ, REP extends BaseRepository<E, ID>, MAP extends BaseMapper<E, ITEM, DTO, RQ>>
        implements BaseService<E, ID, ITEM, DTO, RQ> {

    @Autowired
    private REP repository;

    @Autowired
    private MAP mapper;

    @Override
    public List<ITEM> findAll() {
        return mapper.entityListToItemList(repository.findAll());
    }

    @Override
    public DTO findById(ID id) {
        return mapper.entityToDto(repository.findById(id).get());
    }

    @Override
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
            throw new RuntimeException(Tools.NOT_FOUND.replace("${id}", id.toString()));
        }
    }

    @Override
    public boolean delete(ID id) {
        if(existsById(id)){
            repository.deleteById(id);
            return true;
        }else{
            throw new RuntimeException(Tools.NOT_FOUND.replace("${id}", id.toString()));
        }
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }
}
