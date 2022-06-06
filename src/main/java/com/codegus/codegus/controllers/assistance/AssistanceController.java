package com.codegus.codegus.controllers.assistance;

import com.codegus.codegus.controllers.BaseController;
import com.codegus.codegus.models.assistance.Assistance;
import com.codegus.codegus.models.assistance.dto.AssistanceDto;
import com.codegus.codegus.models.assistance.dto.AssistanceItem;
import com.codegus.codegus.models.assistance.dto.AssistanceRequest;

import java.util.UUID;

public interface AssistanceController extends BaseController<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest> {

    // incluir métodos abstractos propios de AssistanceController

}
