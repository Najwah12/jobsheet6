import java.util.Scanner;
public class DiskonBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya):");
        String jenisBuku = scanner.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();
        double diskon = 0;
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBuku
 > 3) {
                diskon = 5;
            }
        }
        System.out.println("Diskon yang didapatkan: " + diskon + "%");
        scanner.close();
    }
}