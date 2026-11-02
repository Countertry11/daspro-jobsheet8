import java.util.Scanner;

public class Rectangle03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris = ");
        int baris = sc.nextInt();
        System.out.print("Masukkan Jumlah Kolom = ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}
