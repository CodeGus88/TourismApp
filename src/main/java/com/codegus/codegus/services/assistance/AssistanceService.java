package com.codegus.codegus.services.assistance;

import com.codegus.codegus.models.assistance.Assistance;
import com.codegus.codegus.models.assistance.dto.AssistanceDto;
import com.codegus.codegus.models.assistance.dto.AssistanceItem;
import com.codegus.codegus.models.assistance.dto.AssistanceRequest;
import com.codegus.codegus.services.BaseService;

import java.util.UUID;

public interface AssistanceService extends BaseService<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest> {

    // Métodos propios de AssistanceService

}
