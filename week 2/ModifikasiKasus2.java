import java.util.Scanner;
public class ModifikasiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lebar tanah      : ");
        double lebar = sc.nextDouble();

        System.out.print("Masukkan panjang tanah    : ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan diameter kolam   : ");
        double diameter = sc.nextDouble();

        System.out.print("Masukkan sisi taman       : ");
        double sisi = sc.nextDouble();

        double luasTanah = lebar * panjang;

        double jariJari = diameter / 2;
        double luasKolam = Math.PI * jariJari * jariJari;

        double luasTaman = sisi * sisi;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("\n=== HASIL ===");
        System.out.println("Luas Tanah           : " + luasTanah + " m2");
        System.out.println("Luas Kolam           : " + luasKolam + " m2");
        System.out.println("Luas Taman           : " + luasTaman + " m2");
        System.out.println("Luas Tidak Digunakan : " + luasTidakDigunakan + " m2");

        sc.close();
    }
}