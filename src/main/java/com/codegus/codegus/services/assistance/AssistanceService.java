package com.codegus.codegus.services.assistance;

import com.codegus.codegus.models.apply.Assistance;
import com.codegus.codegus.dtos.assistance.AssistanceDto;
import com.codegus.codegus.dtos.assistance.AssistanceItem;
import com.codegus.codegus.dtos.assistance.AssistanceRequest;
import com.codegus.codegus.services.BaseService;

import java.util.UUID;

public interface AssistanceService extends BaseService<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest> {

    // Métodos propios de AssistanceService

}
