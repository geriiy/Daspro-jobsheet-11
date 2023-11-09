import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu='y';
        do{
            int number= random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak angka 1-10: ");
                int answer = sc.nextInt();
                sc.nextLine();
                success=(answer==number);
                if (answer<number) {
                    System.out.println("Masukkan angka yang lebih besar");
                    
                }
                else if (answer>number) {
                    System.out.println("Masukkan angka yang lebih kecil");
                    
                }
                else {
                    System.out.println("Selamat tebakan Anda benar!!");
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)? ");
            menu = sc.nextLine().charAt(0);

        }while (menu=='y'||menu=='Y');
        
    }
    
}
