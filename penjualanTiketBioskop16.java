import java.util.Scanner;

public class penjualanTiketBioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0;
        double totalPendapatan = 0;
        int jumlahTiket;
        final int hargaTiket = 50000;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan lagi.");
                continue;
            }
            double harga = jumlahTiket * hargaTiket ;
            if (jumlahTiket > 10) {
                harga = harga * 0.85; 
                System.out.println("Anda mendapatkan diskon 15%!");
            } else if (jumlahTiket > 4) {
                harga = harga * 0.90; 
                System.out.println("Anda mendapatkan diskon 10%!");
            }
            totalTiket += jumlahTiket;
            totalPendapatan += harga;
            System.out.println("Harga untuk " + jumlahTiket + " tiket: Rp " + harga);
            System.out.println("-----------------------------------");
        }
        
        System.out.println("\n=== LAPORAN AKHIR ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
        
        sc.close();
    }
}