import java.util.Scanner;

public class Star14Modifikasi {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = key.nextInt();

        for (int i = 2; i < n; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        key.close();
    }
} 
