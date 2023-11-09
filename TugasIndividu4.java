import java.util.Arrays;
import java.util.Scanner;

class Atlet implements Comparable<Atlet> {
    String nama;

    public Atlet(String nama) {
        this.nama = nama;
    }

    @Override
    public int compareTo(Atlet other) {
        return this.nama.compareTo(other.nama);
    }
}

public class TugasIndividu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Atlet[] atletBadminton = new Atlet[5];
        Atlet[] atletTenisMeja = new Atlet[5];
        Atlet[] atletBasket = new Atlet[5];
        Atlet[] atletBolaVoly = new Atlet[5];

        System.out.println("=================");
        System.out.println(" Atlet Badminton");
        System.out.println("=================");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            atletBadminton[i] = new Atlet(scanner.nextLine());
        }

        System.out.println("\n==================");
        System.out.println(" Atlet Tenis Meja");
        System.out.println("==================");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            atletTenisMeja[i] = new Atlet(scanner.nextLine());
        }

        System.out.println("\n==============");
        System.out.println(" Atlet Basket");
        System.out.println("==============");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            atletBasket[i] = new Atlet(scanner.nextLine());
        }

        System.out.println("\n============");
        System.out.println(" Atlet Voli");
        System.out.println("============");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            atletBolaVoly[i] = new Atlet(scanner.nextLine());
        }

        Atlet[] allAtlet = new Atlet[atletBadminton.length + atletTenisMeja.length +
                                     atletBasket.length + atletBolaVoly.length];

        System.arraycopy(atletBadminton, 0, allAtlet, 0, atletBadminton.length);
        System.arraycopy(atletTenisMeja, 0, allAtlet, atletBadminton.length, atletTenisMeja.length);
        System.arraycopy(atletBasket, 0, allAtlet, atletBadminton.length + atletTenisMeja.length, atletBasket.length);
        System.arraycopy(atletBolaVoly, 0, allAtlet, atletBadminton.length + atletTenisMeja.length + atletBasket.length,
                atletBolaVoly.length);

        Arrays.sort(allAtlet);

        System.out.println("\n=============================================");
        System.out.println(" Nama Atlet yang Diurutkan Secara Ascending:");
        System.out.println("=============================================");
        for (Atlet atlet : allAtlet) {
            System.out.println(atlet.nama);
        }

        scanner.close();
    }
}
