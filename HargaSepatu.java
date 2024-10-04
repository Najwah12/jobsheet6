import java.util.Scanner;

public class HargaSepatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan merek sepatu (Converse/Sketcher/Nike): ");
        String merek = scanner.nextLine();
        System.out.print("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = scanner.nextInt();

        int harga = 0;

        // Converse
        if (merek.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1200000;
            }
        }
        // Sketcher
        else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && (ukuran >= 36 && ukuran <= 41)) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && (ukuran >= 41 && ukuran <= 44)) {
                harga = 1800000;
            }
        }
        // Nike
        else if (merek.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1500000;
            }
        }

        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Kombinasi merek, kategori, dan ukuran tidak ditemukan.");
        }

        scanner.close();
    }
}