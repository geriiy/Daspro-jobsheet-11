import java.util.Scanner;

public class NestedLoop_2341720109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] array = new double[5][7];

        int i = 0;
        for (double[] kota : array) {
            System.out.println("Kota ke-" + i);
            int j = 0;
            double totalNilaiKota = 0;

            for (double nilaiHari : kota) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                kota[j] = sc.nextDouble();
                totalNilaiKota += kota[j];
                j++;
            }

            double rataRataKota = totalNilaiKota / array[0].length;
            System.out.println("Rata-rata kota ke-" + i + ": " + rataRataKota);
            System.out.println();
            i++;
        }
    }
}
