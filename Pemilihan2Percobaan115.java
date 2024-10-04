import java.util.Scanner;
    public class Pemilihan2Percobaan115 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int Tahun;

            System.out.print("Masukkan Tahun: ");
            Tahun = input.nextInt();

            if ((Tahun % 4 == 0 && Tahun % 100 != 0) || (Tahun % 400 == 0)) {
                    System.out.println("Tahun Kabisat");
            }else {
                System.out.println("Bukan Tahun Kabisat");
            }
        }
    }
