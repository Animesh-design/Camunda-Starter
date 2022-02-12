package org.camunda.bpm.getstarted.loanapproval.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class msgsampleService1 implements JavaDelegate {

    Logger LOGGER = LoggerFactory.getLogger(msgsampleService1.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        LOGGER.info("Executed message sample service 1");
        delegateExecution.setVariable("servicevar", "servicevalue");
    }
}
