public class App extends User {

    App(String nama, String login) {
        super(nama, login);
    }

    void akses() {
        System.out.println("Aplikasi berjalan...");
    }

    public static void main(String[] args) {


        App user = new App("aul", "admin01");

        user.tampilUser(); 
        user.akses();      

        System.out.println();

        Barang barang = new Barang("Laptop", 5000000);
        Order order = new Order(barang, 2);
        Payment payment = new Payment(10000000);

        System.out.println("Total: " + order.hitungTotal());
        payment.prosesPembayaran(order.hitungTotal());
    }
}
//NAMA : MUHAMMAD AULIA ULOH
//NIM : 2515101029
//KELAS : C
