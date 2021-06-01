package adapter;

public class EmployeeLdapAdapter implements Employee {

    private EmployeeLdap instance;

    public EmployeeLdapAdapter(EmployeeLdap e) {
        this.instance = e;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getName();
    }

    @Override
    public String toString() {
        return "ID=" + instance.getCn() + " NAME=" + instance.getName() + " LAST NAME=" + instance.getSurname() + " MAIL=" + instance.getMail();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
