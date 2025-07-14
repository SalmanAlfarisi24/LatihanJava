import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Penghitung Rata-rata Nilai ---");
        System.out.print("Masukkan jumlah mata pelajaran: ");
        int jumlahMataPelajaran = input.nextInt();

        if (jumlahMataPelajaran <= 0) {
            System.out.println("Jumlah mata pelajaran harus lebih dari nol.");
            return;
        }

        double totalNilai = 0;
        int nilai;

        System.out.println("\n--- Masukkan Nilai Setiap Mata Pelajaran ---");

        for (int i = 1; i <= jumlahMataPelajaran; i++) {
            System.out.print("Masukkan nilai mata pelajaran ke-" + i + ": ");
            nilai = input.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid! Nilai harus antara 0 dan 100.");
                i--;
            } else {
                totalNilai += nilai;
            }
        }

        double rataRata = totalNilai / jumlahMataPelajaran;

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total nilai dari " + jumlahMataPelajaran + " mata pelajaran adalah: " + totalNilai);
        System.out.printf("Rata-rata nilai Anda adalah: %.2f%n", rataRata);

        if (rataRata >= 75) {
            System.out.println("Selamat! Anda lulus dengan hasil yang memuaskan.");
        } else if (rataRata >= 60) {
            System.out.println("Anda lulus, tetapi ada baiknya untuk meningkatkan pemahaman.");
        } else {
            System.out.println("Maaf, Anda perlu belajar lebih giat lagi.");
        }

        input.close();
    }
}
