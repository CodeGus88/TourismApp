package com.codegus.codegus.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<E, ID, ITEM, DTO, RQ> {

    List<ITEM> findAll();

    Page<ITEM> findAll(Pageable pageable);

    DTO findById(ID id);

    DTO save(RQ request);

    DTO update(ID id, RQ request);

    boolean delete(ID id);

    boolean existsById(ID id);

}
