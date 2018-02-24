package tr.com.jowl.solid.servicelocator;

import tr.com.jowl.solid.util.ServiceType;

public class JMSService implements Service {
    @Override
    public ServiceType getServiceType() {
        return ServiceType.JMS;
    }

    @Override
    public void execute() {
        System.out.println("Executing JMS Service");
    }
}
