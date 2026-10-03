import java.util.Scanner;

public class KalkulatorPPh27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Kalkulator PPh Progresif ---");
        System.out.print("Penghasilan Kena Pajak / PKP (Rp): ");
        double pkp = sc.nextDouble();

        double batas1 = 60000000;   
        double batas2 = 250000000;  
        double batas3 = 500000000;  

        double pajak;

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= batas1) {
            pajak = 0.05 * pkp;
        } else if (pkp <= batas2) {
            double pajakLapisan1 = 0.05 * batas1;                 
            double pajakLapisan2 = 0.15 * (pkp - batas1);          
            pajak = pajakLapisan1 + pajakLapisan2;
        } else if (pkp <= batas3) {
            double pajakLapisan1 = 0.05 * batas1;
            double pajakLapisan2 = 0.15 * (batas2 - batas1);       
            double pajakLapisan3 = 0.25 * (pkp - batas2);          
            pajak = pajakLapisan1 + pajakLapisan2 + pajakLapisan3;
        } else {
            double pajakLapisan1 = 0.05 * batas1;
            double pajakLapisan2 = 0.15 * (batas2 - batas1);
            double pajakLapisan3 = 0.25 * (batas3 - batas2);       
            double pajakLapisan4 = 0.30 * (pkp - batas3);          
            pajak = pajakLapisan1 + pajakLapisan2 + pajakLapisan3 + pajakLapisan4;
        }

        System.out.printf("PKP          : Rp%.0f%n", pkp);
        System.out.printf("PPh 21 wajib : Rp%.0f%n", pajak);

        sc.close();
    }
}
