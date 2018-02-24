package tr.com.jowl.solid.servicelocator;

import tr.com.jowl.solid.util.ServiceType;

public class EJBService implements Service {

    @Override
    public ServiceType getServiceType() {
        return ServiceType.EJB;
    }

    @Override
    public void execute() {
        System.out.println("Executing EJB Service");
    }
}
