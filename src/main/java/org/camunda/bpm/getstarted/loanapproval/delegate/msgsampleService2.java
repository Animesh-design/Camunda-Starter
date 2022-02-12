package org.camunda.bpm.getstarted.loanapproval.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.Expression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class msgsampleService2 implements ExecutionListener {

    Logger LOGGER = LoggerFactory.getLogger(msgsampleService2.class);
    Expression inj1;
    Expression inj2;

    String inj1Val;
    String wish;

    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {

        inj1Val = (String) inj1.getValue(delegateExecution);
        wish = (String) inj2.getValue(delegateExecution);

        LOGGER.info("Execute execution listner inj1 value: " +inj1Val);
        LOGGER.info("Execute execution listner wish value: " +wish);
    }
}
