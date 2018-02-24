package tr.com.jowl.solid.servicelocator;

import tr.com.jowl.solid.util.ServiceType;

public interface Service {
    ServiceType  getServiceType();
    void execute();
}
