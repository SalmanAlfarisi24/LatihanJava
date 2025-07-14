
import java.util.Scanner;

public class NumberProcessorMinimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Masukkan angka antara 1 sampai 100. Ketik 'selesai' untuk mengakhiri input.");
        System.out.println("Hasil (semua, ganjil, genap) akan ditampilkan untuk setiap angka yang valid.");

        while (true) {
            System.out.print("Masukkan angka: ");
            input = scanner.next();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            int num = Integer.parseInt(input); // Akan error jika input bukan angka
            if (num >= 1 && num <= 100) {
                System.out.println("Angka Anda: " + num);
                if (num % 2 != 0) {
                    System.out.println(num + " adalah bilangan Ganjil.");
                } else {
                    System.out.println(num + " adalah bilangan Genap.");
                }
            } else {
                System.out.println("Angka harus antara 1 dan 100. Silakan coba lagi.");
            }
            System.out.println("---"); // Pemisah untuk setiap input
        }

        System.out.println("Program selesai.");
        scanner.close();
    }
}
