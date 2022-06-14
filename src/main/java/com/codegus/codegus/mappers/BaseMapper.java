package com.codegus.codegus.mappers;

public interface BaseMapper<E, ITEM, DTO, RQ> {

    E requestToEntity(RQ request);

    DTO entityToDto(E entity);

    ITEM entityToItem(E entity);

}
