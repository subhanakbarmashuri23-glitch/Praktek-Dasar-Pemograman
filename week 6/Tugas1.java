import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon=0;

        System.out.print("Membeli buku (kamus/novel/lainnya): ");
        String buku = sc.nextLine().trim();
        System.out.print("Jumlah buku yang dibeli: ");
        int jumlahBuku = sc.nextInt();

        if (buku.equalsIgnoreCase("kamus")) {
            diskon += 0.1;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (buku.equalsIgnoreCase("novel")) {
            diskon += 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else {
            if (buku.equalsIgnoreCase("lainnya")) {
                diskon += 0.05;
            }
        }

        System.out.print("jumlah diskon: " + Math.round(diskon * 100) + "%");

        sc.close();
        }
    }

