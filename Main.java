
import java.util.Scanner;
// Class Main sebagai driver Class
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.next();

            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.next();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.next();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Barang: ");
            int jumlahBarang = scanner.nextInt();     

            // Membuat objek Pembelian (polymorphism)
            Pembelian pembelian = new Pembelian(noFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBarang);
           
            // Menampilkan informasi pembelian
            System.out.println("\n--- Detail Transaksi ---");
            pembelian.tampilInfo();
        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan sesuai format yang benar.");
        } finally {
            scanner.close();
        }
    }
} 