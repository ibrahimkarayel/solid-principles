package tr.com.jowl.solid.servicelocator;

import tr.com.jowl.solid.util.ServiceType;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    private ServiceLocator() {
    }

    public static Service getService(ServiceType serviceType) {
        Service service = cache.getService(serviceType);
        if (service != null) {
            return service;
        }
        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(serviceType);
        cache.addService(service1);
        return service1;
    }
}
