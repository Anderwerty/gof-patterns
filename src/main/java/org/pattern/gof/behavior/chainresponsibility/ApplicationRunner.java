package org.pattern.gof.behavior.chainresponsibility;

import org.pattern.gof.behavior.chainresponsibility.domain.Criterion;
import org.pattern.gof.behavior.chainresponsibility.domain.Request;
import org.pattern.gof.behavior.chainresponsibility.domain.Response;
import org.pattern.gof.behavior.chainresponsibility.handler.*;

import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        List<ServiceHandler> handlers = Arrays.asList(new PoliceServiceHandler(), new MedicineServiceHandler(),new FireServiceHandler());
        HandlerRegistrar handlerRegistrar = new HandlerRegistrar(handlers);
        Request request = new Request("Kiev,...",Arrays.asList(Criterion.FIRE_DEPARTMENT, Criterion.AMBULANCE));
        Response response = handlerRegistrar.handleRequests(request);

        System.out.println(response);
    }
}
