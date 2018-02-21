package tr.com.jowl.solid.dataclient;

public class OperationApp {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.write(new Doc("Add Hired users"));
        manager.read(new Doc("Read Hired users"));
        manager.update(new Doc("Update Hired users"));
        manager.delete(new Doc("Delete Hired users"));

        UserDataOperation userDataOperation = new User();
        userDataOperation.write(new Doc("Write Hired users"));
        userDataOperation.read(new Doc("Read Hired users"));
    }
}
