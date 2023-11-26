// Class Pembelian yang merupakan subclass dari Barang dan mengimplementasikan HitungTotalBayar
class Pembelian extends Barang implements HitungTotalBayar {
    private String noFaktur;
    private String namaPelanggan;

    public Pembelian(String noFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBarang;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Total Bayar: " + hitungTotalBayar());
    }
}
