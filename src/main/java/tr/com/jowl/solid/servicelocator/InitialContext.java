package tr.com.jowl.solid.servicelocator;

import tr.com.jowl.solid.util.ServiceType;

public class InitialContext {
    public Object lookup(ServiceType serviceType) {
        if (serviceType.equals(ServiceType.EJB)) {
            System.out.println("Looking up and creating a new EJB Service object");
            return new EJBService();
        } else if (serviceType.equals(ServiceType.JMS)) {
            System.out.println("Looking up and creating a new Jms Service object");
            return new JMSService();
        }
        return null;
    }
}
