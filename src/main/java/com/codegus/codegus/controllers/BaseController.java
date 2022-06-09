package com.codegus.codegus.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController<E, ID, ITEM, DTO, RQ> {

    ResponseEntity<List<ITEM>> findAll();

    ResponseEntity<Page<ITEM>> findAll(Pageable pageable);

    ResponseEntity<DTO> findById(ID id);

    ResponseEntity<DTO> save(RQ request);

    ResponseEntity<DTO> update(ID id, RQ request);

    ResponseEntity<Boolean> delete(ID id);

}
