package tr.com.jowl.solid.servicelocator;

import tr.com.jowl.solid.util.ServiceType;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService(ServiceType.EJB);
        service.execute();
        service = ServiceLocator.getService(ServiceType.JMS);
        service.execute();
        service = ServiceLocator.getService(ServiceType.EJB);
        service.execute();
        service = ServiceLocator.getService(ServiceType.JMS);
        service.execute();
    }
}
