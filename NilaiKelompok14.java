import java.util.Scanner;

public class NilaiKelompok14 {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = key.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = key.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan pelatih harus > 0.");
        } else {
          int nomorkelompok = 1; //penghitung outer loop
          double rataTertinggi = -1; // -1 agar kelompok pertama tetap tercatat
          int kelompokTerbaik = 0;  

        while (nomorkelompok <= jumlahKelompok) {
            System.out.println("Kelompok " + nomorkelompok);
            double totalNilai = 0;

        for (int j = 1; j <= jumlahPenilai; j++){
            int nilai;
            do {
                System.out.print("  Nilai dari Penilai " + j + ": ");
                nilai = key.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("  Nilai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);
            totalNilai += nilai;
        }
        double rataNilai = totalNilai / jumlahPenilai;
        System.out.println("Kelompok " + nomorkelompok +": nilai rata-rata = " + rataNilai);

        if (rataNilai > rataTertinggi) {
            rataTertinggi = rataNilai;
            kelompokTerbaik = nomorkelompok;
        }
        nomorkelompok++;
        
          }
          System.out.println("================================");
          System.out.println("Kelompok Terbaik    : " + kelompokTerbaik);
          System.out.println("Rata-rata Tertinggi : " + rataTertinggi);
        }
        key.close();
    
    }
}
