import java.util.Scanner;

public class Tugas3_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah toko: ");
        int toko = sc.nextInt();
        if (toko < 1) {
            System.out.println("Jumlah toko minimal 1");
            sc.close();
            return;
        }

        int totalSemua = 0;
        int max = -1;
        int tokoMax = 0;

        for (int i = 1; i <= toko; i++) {
            System.out.print("Jumlah pelanggan toko " + i + ": ");
            int pelanggan = sc.nextInt();
            while (pelanggan < 0) {
                System.out.print("Tidak boleh negatif: ");
                pelanggan = sc.nextInt();
            }

            int totalToko = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("  Barang pelanggan " + j + ": ");
                int brg = sc.nextInt();
                while (brg < 0) {
                    System.out.print("  Tidak boleh negatif: ");
                    brg = sc.nextInt();
                }
                totalToko += brg;
            }

            System.out.println("Toko " + i + " - pelanggan: " + pelanggan + ", total barang: " + totalToko);
            totalSemua += totalToko;

            if (totalToko > max) {
                max = totalToko;
                tokoMax = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoMax);

        sc.close();
    }
}
