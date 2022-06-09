package com.codegus.codegus.services;

import com.codegus.codegus.enumsandstatics.Messages;
import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BaseServiceImpl<E extends BaseModel<ID>, ID, ITEM, DTO, RQ, REP extends BaseRepository<E, ID>, MAP extends BaseMapper<E, ITEM, DTO, RQ>>
        implements BaseService<E, ID, ITEM, DTO, RQ> {

    @Autowired
    private REP repository;

    @Autowired
    private MAP mapper;

    @Override
    @Transactional(readOnly = true)
    public List<ITEM> findAll() {
        List<ITEM> list = repository.findAll()
                .stream().map(entity -> mapper.entityToItem(entity))
                .collect(Collectors.toList());
        Comparator<? super ITEM> comparator = (p0, p1) -> p0.toString().compareTo(p1.toString());
        list.sort(comparator);
        return list;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ITEM> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(entity -> mapper.entityToItem(entity));
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
