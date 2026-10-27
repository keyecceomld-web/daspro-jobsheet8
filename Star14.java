import java.util.Scanner;

public class Star14 {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = key.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.print("*");
        }
        System.out.println();
        key.close();
    }
}