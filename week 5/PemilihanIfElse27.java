import java.util.Scanner;

public class PemilihanIfElse27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS siakad ---");
        System.out.print("Masukan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 ditampilkan");
        }
        else if (semester == 2) {
            System.out.println("KRS semester 2 ditampilkan");
        }
        else if (semester == 3) {
            System.out.println("KRS semestr 3 ditampilkan");
        }
        else if (semester == 4) {
            System.out.println("KRS semester 4 ditampikan");
        }
        else if (semester == 5) {
            System.out.println("KRS semester 5 ditampilkan");
        }             
        else if (semester == 6) {
            System.out.println("KRS semester 6 ditampilkan");
        }
        else if (semester == 7) {
            System.out.println("KRS semester 7 ditampikan");
        }
        else if (semester == 8) {
            System.out.println("KRS semester 8 ditampilkan");
        }
        else {
            System.out.println("semester tidak valid");
        }

        sc.close();
    }
    
}
