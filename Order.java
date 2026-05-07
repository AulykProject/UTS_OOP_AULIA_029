public class Order {
    Barang barang;
    int jumlah;

    Order(Barang barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
    }

    int hitungTotal() {
        return barang.harga * jumlah;
    }
}