import java.util.Scanner;

public class durasiParkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar/Selesai): ");
            jenis = sc.nextInt();
            
            if (jenis == 0) {
                break;
            }
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            
            if (durasi <= 0) {
                System.out.println("Durasi tidak valid!");
                continue;
            }
            int tarif = 0;
            if (durasi > 5) {
                tarif = 12500;
            } else {
                if (jenis == 1) { 
                    tarif = durasi * 3000;
                } else if (jenis == 2) {
                    tarif = durasi * 2000;
                }
            }
            total += tarif;
            System.out.println("Tarif parkir: Rp " + tarif);
            System.out.println("Total sementara: Rp " + total);
            
        } while (jenis != 0);
        
        System.out.println("Total pembayaran parkir: Rp " + total);
        System.out.println("Terima kasih!");
        
        sc.close();
    }
}