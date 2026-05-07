public class Payment {
    int bayar;

    Payment(int bayar) {
        this.bayar = bayar;
    }

    void prosesPembayaran(int total) {
        System.out.println("Total  : " + total);
        System.out.println("Bayar  : " + bayar);

        if (bayar >= total) {
            System.out.println("Kembalian : " + (bayar - total));
        } else {
            System.out.println("Uang kurang!");
        }
    }
}