package adapter;

public class EmployeeLdap {
    String cn;
    String name;
    String surname;
    String mail;
    public EmployeeLdap(String cn, String name, String surname, String mail){
        this.cn = cn;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }
    public String getCn() {
        return cn;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getMail() {
        return mail;
    }

}
