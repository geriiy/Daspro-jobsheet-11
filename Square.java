import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int iluar = 1; iluar<=n; iluar++) {
            for (int i = 0; i<=n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
