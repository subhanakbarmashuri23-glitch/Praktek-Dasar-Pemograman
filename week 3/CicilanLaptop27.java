import java.util.Scanner;;
public class CicilanLaptop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaLaptop;       
        double uangMuka;       
        int lamaCicilan;         
        double sisaHarga;
        double bunga;
        double cicilanPerBulan;

        System.out.print("Masukkan harga laptop: ");
        hargaLaptop = sc.nextDouble();
        System.out.print("Masukkan uang muka: ");
        uangMuka = sc.nextDouble();
        System.out.print("Masukkan lama cicilan (bulan): ");
        lamaCicilan = sc.nextInt();

        sisaHarga = hargaLaptop - uangMuka;
        bunga = 0.02 * sisaHarga;
        cicilanPerBulan = (sisaHarga + (bunga * lamaCicilan)) / lamaCicilan;

        System.out.println("Cicilan yang harus dibayar setiap bulan adalah Rp. " + cicilanPerBulan);

        sc.close();
    }
}
