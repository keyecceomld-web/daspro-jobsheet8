import java.util.Scanner;

public class Rectangle14 {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = key.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = key.nextInt();

        for (int j = 1; j <= kolom; j++) {
            for (int i = 1; i <= baris; i++){
                System.out.print("#");
            }
            System.out.println();
        }
        key.close();
    }
}
