package bank;

class Account{
    String name;
    protected String email;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a1= new Account();
        a1.name="Boral Affan Qutbuddin";
        a1.email="affanboral786@gmail.com";
        a1.setPassword("12345678");
        System.out.println(a1.name);
        System.out.println(a1.email);
        System.out.println(a1.getPassword());
    }

}
