package com.codegus.codegus.mappers;

import java.util.List;

public interface BaseMapper<E, ITEM, DTO, RQ> {

    E requestToEntity(RQ request);

    DTO entityToDto(E entity);

    List<ITEM> entityListToItemList(List<E> entityList);

}
