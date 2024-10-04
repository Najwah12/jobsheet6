import java.util.Scanner;
public class BilanganTerbesar {
    public static void main(String[] args) {
        int bil1 = 28, bil2 = 54, bil3 = 15;
        int terbesar;

        // Metode 1: Menggunakan if-else bertingkat
        if (bil1 >= bil2 && bil1 >= bil3) {
            terbesar = bil1;
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }

        // Metode 2: Menggunakan ternary operator (lebih ringkas)
        terbesar = (bil1 >= bil2) ? (bil1 >= bil3 ? bil1 : bil3) : (bil2 >= bil3 ? bil2 : bil3);

        System.out.println("Bilangan terbesar: " + terbesar);
    }
}