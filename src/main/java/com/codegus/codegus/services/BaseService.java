package com.codegus.codegus.services;


import java.util.List;

public interface BaseService<E, ID, ITEM, DTO, RQ> {

    List<ITEM> findAll();

    DTO findById(ID id);

    DTO save(RQ request);

    DTO update(ID id, RQ request);

    boolean delete(ID id);

    boolean existsById(ID id);

}
