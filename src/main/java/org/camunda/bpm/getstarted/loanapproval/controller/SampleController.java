package org.camunda.bpm.getstarted.loanapproval.controller;

import org.camunda.bpm.getstarted.loanapproval.WebappExampleProcessApplication;
import org.camunda.bpm.getstarted.loanapproval.model.Person;
import org.camunda.bpm.getstarted.loanapproval.service.CamundaStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    CamundaStartService camundaStartService;

    @GetMapping("/test")
    public String test(){
        return "Got into Camunda Code";
    }

    @PostMapping("/msgstart")
    public void persistPerson(@RequestBody Person obj){

        camundaStartService.startProcessByMessage(obj);
    }
}
