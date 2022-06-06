package com.codegus.codegus.repositories.apply.phone;

import com.codegus.codegus.models.phones.AssistancePhone;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssistancePhoneRepository extends BaseRepository<AssistancePhone, UUID> {



}
