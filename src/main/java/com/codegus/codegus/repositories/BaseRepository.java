package com.codegus.codegus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<E, ID>  extends JpaRepository<E, ID> {
    
}
