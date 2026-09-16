//Nama: Subhan Akbar Mashuri
//NIM: 264107020214
//Kelas: TI-1D
import java.util.Scanner;   

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Buat variabel untuk menyimpan data
        double hargaHandphone, hargaKabel, hargaEarphone, hargaJualHandphone, hargaJualKabel, hargaJualEarphone;
        double biayaPengemasan, biayaPengiriman, diskon;
        int faktorResikoKerusakan;
        double keuntunganProduk1, keuntunganProduk2, keuntunganProduk3, keuntunganHandphone;
        int jumlahItemPenghitungKeuntungan;
        double keuntungankabel, keuntunganEarphone;
        double totalKeuntungan;
        int jumlahTerjualHandphone, jumlahTerjualKabel, jumlahTerjualEarphone;
        double rataRataKeuntungan, keuntunganYangDiharapkan;
        double targetkeuntungan;
        int jumlahTerjualProduk;

        //masukan nilai tiap variabel
        System.out.print("harga handphone: ");
        hargaHandphone = sc.nextDouble();
        System.out.print("harga kabel: ");
        hargaKabel = sc.nextDouble();
        System.out.print("harga earphone: ");
        hargaEarphone = sc.nextDouble();
        System.out.print("harga jual handphone: ");
        hargaJualHandphone = sc.nextDouble();
        System.out.print("harga jual kabel: ");
        hargaJualKabel = sc.nextDouble();
        System.out.print("harga jual earphone: ");
        hargaJualEarphone = sc.nextDouble();
        System.out.print("biaya pengemasan: ");
        biayaPengemasan = sc.nextDouble();
        System.out.print("biaya pengiriman: ");
        biayaPengiriman = sc.nextDouble();
        System.out.print("diskon: ");
        diskon = sc.nextDouble();
        System.out.print("jumlah terjual handphone: ");
        jumlahTerjualHandphone = sc.nextInt();
        System.out.print("jumlah terjual kabel: ");
        jumlahTerjualKabel = sc.nextInt();
        System.out.print("jumlah terjual earphone: ");
        jumlahTerjualEarphone = sc.nextInt();
        System.out.print("faktor risiko kerusakan: ");
        faktorResikoKerusakan = sc.nextInt();
        System.out.print("target keuntungan: ");
        targetkeuntungan = sc.nextDouble();

        //lakukan perhitungan keuntungan
        keuntunganHandphone = hargaJualHandphone - hargaHandphone - biayaPengemasan - biayaPengiriman - diskon; 
        keuntungankabel = hargaJualKabel - hargaKabel - biayaPengemasan - biayaPengiriman - diskon; 
        keuntunganEarphone = hargaJualEarphone - hargaEarphone - biayaPengemasan - biayaPengiriman - diskon;
        jumlahTerjualProduk = jumlahTerjualHandphone + jumlahTerjualKabel + jumlahTerjualEarphone;
        jumlahItemPenghitungKeuntungan = (int) (jumlahTerjualProduk - (faktorResikoKerusakan/100 * jumlahTerjualProduk));
        keuntunganProduk1 = keuntunganHandphone * jumlahItemPenghitungKeuntungan;
        keuntunganProduk2 = keuntungankabel * jumlahItemPenghitungKeuntungan;
        keuntunganProduk3 = keuntunganEarphone * jumlahItemPenghitungKeuntungan;
        totalKeuntungan = keuntunganProduk1 + keuntunganProduk2 + keuntunganProduk3;
        keuntunganYangDiharapkan = targetkeuntungan / totalKeuntungan * 100; 
        rataRataKeuntungan = totalKeuntungan / 3;
        
        //tampilkan hasil perhitungan
        System.out.println("Rata-rata keuntungan: " + rataRataKeuntungan);
        System.out.println("Keuntungan Produk 1: " + keuntunganProduk1);
        System.out.println("Keuntungan Produk 2: " + keuntunganProduk2);
        System.out.println("Keuntungan Produk 3: " + keuntunganProduk3);
        System.out.println("Total Keuntungan: " + totalKeuntungan);
        System.out.println("Keuntungan Per Item: " + keuntunganHandphone);
        System.out.println("Keuntungan Kabel: " + keuntungankabel);
        System.out.println("Keuntungan Earphone: " + keuntunganEarphone);
        System.out.println("Jumlah Item Penghitung Keuntungan: " + jumlahItemPenghitungKeuntungan);
        System.out.println("Keuntungan Yang Diharapkan: " + keuntunganYangDiharapkan + "%");

        sc.close();
    }    
}
