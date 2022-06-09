package com.codegus.codegus.repositories.apply;

import com.codegus.codegus.models.apply.Assistance;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssistanceRepository extends BaseRepository<Assistance, UUID> {

}
