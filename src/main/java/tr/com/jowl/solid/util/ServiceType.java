package tr.com.jowl.solid.util;

public enum ServiceType {

    EJB("EJB"), JMS("JMS");

    private final String type;

    ServiceType(String type) {
        this.type = type;
    }
}
