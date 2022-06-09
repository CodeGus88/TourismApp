package com.codegus.codegus.controllers;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.repositories.BaseRepository;
import com.codegus.codegus.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class BaseControllerImpl
        <E extends BaseModel<ID>, ID, ITEM, DTO, RQ, REP extends BaseRepository<E, ID>, MAP extends BaseMapper<E, ITEM, DTO, RQ>, SER extends BaseServiceImpl<E, ID, ITEM, DTO, RQ, REP, MAP> >
        implements BaseController<E, ID, ITEM, DTO, RQ>{

    @Autowired
    private SER service;

    @GetMapping
    @Override
    public ResponseEntity<List<ITEM>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/paged")
    @Override
    public ResponseEntity<Page<ITEM>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<DTO> findById(@PathVariable ID id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @Override
    public ResponseEntity<DTO> save(@RequestBody RQ request) {
        return ResponseEntity.ok().body(service.save(request));
    }

    @PutMapping("{id}")
    @Override
    public ResponseEntity<DTO> update(@PathVariable ID id, @RequestBody RQ request) {
        return ResponseEntity.ok().body(service.update(id, request));
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable ID id) {
        return ResponseEntity.ok().body(service.delete(id));
    }

}
