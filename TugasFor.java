import java.util.Scanner;

public class TampilNilaiGenapWhileTanpaKomentar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menampilkan Nilai Genap dari 2 sampai 100");
        System.out.println("--------------------------------------------------");

        System.out.print("Masukkan angka (masukan ini tidak akan memengaruhi output genap, hanya untuk demonstrasi if > 100): ");
        int inputAngka = scanner.nextInt();

        if (inputAngka > 100) {
            System.out.println("Anda memasukkan angka lebih dari 100. Output genap tetap akan ditampilkan.");
        }

        System.out.print("Tekan Enter untuk menampilkan deret genap: ");
        scanner.nextLine(); 
        scanner.nextLine(); 

        int i = 2; 
        while (i <= 100) { 
            System.out.print(i);
            if (i > 10) {
                System.out.print(" (nilai ini lebih dari 10)");
            }
            if (i < 100) {
                System.out.print(", ");
            }
            i += 2; 
        }
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("Program selesai.");

        scanner.close();
    }
}
