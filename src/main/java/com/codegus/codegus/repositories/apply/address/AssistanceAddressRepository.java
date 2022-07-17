package com.codegus.codegus.repositories.apply.address;

import com.codegus.codegus.models.apply.address.AssistanceAddress;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AssistanceAddressRepository extends BaseRepository<AssistanceAddress, UUID> {

    List<AssistanceAddress> findByAssistanceId(UUID assistanceId);

}
