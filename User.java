public class User {
    String nama;
    String login;

    User(String nama, String login) {
        this.nama = nama;
        this.login = login;
    }

    void tampilUser() {
        System.out.println("Nama  : " + nama);
        System.out.println("Login : " + login);
    }
}