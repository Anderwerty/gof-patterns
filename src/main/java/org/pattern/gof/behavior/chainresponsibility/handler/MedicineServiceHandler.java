package org.pattern.gof.behavior.chainresponsibility.handler;

import org.pattern.gof.behavior.chainresponsibility.domain.Criterion;
import org.pattern.gof.behavior.chainresponsibility.domain.Request;
import org.pattern.gof.behavior.chainresponsibility.domain.Response;

public class MedicineServiceHandler implements ServiceHandler{
    @Override
    public void handle(Request request, Response response) {
        boolean isMedicine = checkIfShouldBeInvoked(request, Criterion.FIRE_DEPARTMENT);
        if (isMedicine) {
            response.addMessage("The ambulance is coming");
        }
    }
}
