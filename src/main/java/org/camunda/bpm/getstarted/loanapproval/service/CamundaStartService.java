package org.camunda.bpm.getstarted.loanapproval.service;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.getstarted.loanapproval.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamundaStartService {

    @Autowired
    RuntimeService runtimeService;


    public void startProcessByMessage(Person person){

        runtimeService.createMessageCorrelation("msg-s-1")
                .setVariable("springname", person.getName())
                .setVariable("gender", person.getGender())
                .correlate();
    }


}
