package com.codegus.codegus.controllers.assistance;

import com.codegus.codegus.controllers.BaseController;
import com.codegus.codegus.controllers.BaseControllerImpl;
import com.codegus.codegus.mappers.AssistanceMapper;
import com.codegus.codegus.models.apply.Assistance;
import com.codegus.codegus.dtos.assistance.AssistanceDto;
import com.codegus.codegus.dtos.assistance.AssistanceItem;
import com.codegus.codegus.dtos.assistance.AssistanceRequest;
import com.codegus.codegus.repositories.apply.AssistanceRepository;
import com.codegus.codegus.services.assistance.AssistanceServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController
@RequestMapping("api/assistants")
public class AssistanceControllerImpl
        extends BaseControllerImpl<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest, AssistanceRepository, AssistanceMapper, AssistanceServiceImpl>
        implements BaseController<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest>{

    // Implementar métodos propios de AssistanceController

}
