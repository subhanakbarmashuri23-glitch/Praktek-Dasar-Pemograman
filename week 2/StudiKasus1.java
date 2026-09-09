public class StudiKasus1 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        int jumlahAnak = 4;
        double tunjanganAnak = 100000;

        double pensiun = gajiPokok * 0.10;
        double totalTunjangan = jumlahAnak * tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan - pensiun;

        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan Anak   : Rp " + totalTunjangan);
        System.out.println("Potongan Pensiun : Rp " + pensiun);
        System.out.println("Gaji Bersih      : Rp " + gajiBersih);
    }
}