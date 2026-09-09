import java.util.Scanner;
public class ModifikasiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok       : Rp ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan/anak   : Rp ");
        double tunjanganAnak = input.nextDouble();

        System.out.print("Masukkan jumlah anak      : ");
        int jumlahAnak = input.nextInt();

        double pensiun = gajiPokok * 0.10;
        double totalTunjangan = tunjanganAnak * jumlahAnak;
        double gajiBersih = gajiPokok + totalTunjangan - pensiun;

        System.out.println("\n=== HASIL ===");
        System.out.println("Total Tunjangan : Rp " + totalTunjangan);
        System.out.println("Potongan Pensiun: Rp " + pensiun);
        System.out.println("Gaji Bersih     : Rp " + gajiBersih);

        input.close();
    }
}

