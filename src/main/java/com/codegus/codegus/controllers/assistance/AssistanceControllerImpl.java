package com.codegus.codegus.controllers.assistance;

import com.codegus.codegus.controllers.BaseController;
import com.codegus.codegus.controllers.BaseControllerImpl;
import com.codegus.codegus.mappers.AssistanceMapper;
import com.codegus.codegus.models.assistance.Assistance;
import com.codegus.codegus.models.assistance.dto.AssistanceDto;
import com.codegus.codegus.models.assistance.dto.AssistanceItem;
import com.codegus.codegus.models.assistance.dto.AssistanceRequest;
import com.codegus.codegus.repositories.apply.AssistanceRepository;
import com.codegus.codegus.services.assistance.AssistanceServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RequestMapping("api/assistants")
@RestController
public class AssistanceControllerImpl
        extends BaseControllerImpl<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest, AssistanceRepository, AssistanceMapper, AssistanceServiceImpl>
        implements BaseController<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest>{

    // Implementar métodos propios de AssistanceController

}
