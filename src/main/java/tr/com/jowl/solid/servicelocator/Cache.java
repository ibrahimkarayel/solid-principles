package tr.com.jowl.solid.servicelocator;

import tr.com.jowl.solid.util.ServiceType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(ServiceType serviceType) {
        return services.stream().filter(service -> service.getServiceType().equals(serviceType)).findFirst().orElse(null);
    }

    public void addService(Service newService) {
        Predicate<Service> servicePredicate= service -> service.getServiceType().equals(newService.getServiceType());
        boolean exists = services.stream().anyMatch(servicePredicate);
        if (!exists) {
            services.add(newService);
        }
    }
}
