package com.app.myrhh.services;

import com.app.myrhh.repositories.AgentRepository;
import org.springframework.stereotype.Service;


@Service
public class AgentService {

    private final AgentRepository agentRepository;

    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }


}
