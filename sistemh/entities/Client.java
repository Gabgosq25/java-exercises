package entities;

public class Client extends Person {
    private String email;
    private String phone;

    public Client(String name, String cpf, String email, String phone) {
        super(name, cpf);
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
