package com.codegus.codegus.controllers.assistance;

import com.codegus.codegus.controllers.BaseController;
import com.codegus.codegus.models.apply.Assistance;
import com.codegus.codegus.dtos.assistance.AssistanceDto;
import com.codegus.codegus.dtos.assistance.AssistanceItem;
import com.codegus.codegus.dtos.assistance.AssistanceRequest;
import java.util.UUID;

public interface AssistanceController extends BaseController<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest> {

    // incluir métodos abstractos propios de AssistanceController

}
