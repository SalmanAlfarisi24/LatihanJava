import java.util.Scanner;

public class JobSuggesterClean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Job Suggester Berdasarkan Flowchart ---");

        System.out.print("Apakah Anda Laki-laki atau Perempuan? (L/P): ");
        String gender = scanner.nextLine().trim().toUpperCase();

        if (gender.equals("L")) {
            System.out.print("Masukkan tinggi badan Anda dalam cm: ");
            int height = scanner.nextInt();
            scanner.nextLine();

            if (height >= 170) {
                System.out.print("Apakah penampilan Anda Menarik/Biasa? (M/B): ");
                String appearance = scanner.nextLine().trim().toUpperCase();
                if (appearance.equals("M")) {
                    System.out.print("Apakah Anda menarik? (Ya/Tidak): ");
                    String interesting = scanner.nextLine().trim().toUpperCase();
                    if (interesting.equals("YA")) {
                        System.out.println("Profesi yang disarankan adalah: Model");
                    } else {
                        System.out.println("Profesi yang disarankan adalah: debt collector");
                    }
                } else {
                    System.out.println("Profesi yang disarankan adalah: BOS");
                }
            } else {
                System.out.print("Apakah penampilan Anda Menarik/Biasa? (M/B): ");
                String appearance = scanner.nextLine().trim().toUpperCase();
                if (appearance.equals("M")) {
                    System.out.print("Apakah Anda menarik? (Ya/Tidak): ");
                    String interesting = scanner.nextLine().trim().toUpperCase();
                    if (interesting.equals("YA")) {
                        System.out.println("Profesi yang disarankan adalah: teller bank");
                    } else {
                        System.out.println("Profesi yang disarankan adalah: BOS");
                    }
                } else {
                    System.out.println("Profesi yang disarankan adalah: BOS");
                }
            }
        } else if (gender.equals("P")) {
            System.out.print("Apakah penampilan Anda Menarik/Biasa? (M/B): ");
            String appearance = scanner.nextLine().trim().toUpperCase();

            if (appearance.equals("M")) {
                System.out.print("Apakah Anda menarik? (Ya/Tidak): ");
                String interesting = scanner.nextLine().trim().toUpperCase();
                if (interesting.equals("YA")) {
                    System.out.println("Profesi yang disarankan adalah: Sekretaris");
                } else {
                    System.out.println("Profesi yang disarankan adalah: BOS");
                }
            } else {
                System.out.print("Masukkan tinggi badan Anda dalam cm: ");
                int height = scanner.nextInt();
                scanner.nextLine();

                if (height > 155) {
                    System.out.print("Apakah penampilan Anda Menarik/Biasa? (M/B): ");
                    String secondAppearance = scanner.nextLine().trim().toUpperCase();
                    if (secondAppearance.equals("M")) {
                        System.out.print("Apakah Anda menarik? (Ya/Tidak): ");
                        String interesting = scanner.nextLine().trim().toUpperCase();
                        if (interesting.equals("YA")) {
                            System.out.println("Profesi yang disarankan adalah: Pramugari");
                        } else {
                            System.out.println("Profesi yang disarankan adalah: Manager");
                        }
                    } else {
                        System.out.println("Profesi yang disarankan adalah: Manager");
                    }
                } else {
                    System.out.println("Profesi yang disarankan adalah: Manager");
                }
            }
        } else {
            System.out.println("Masukan jenis kelamin tidak valid. Harap masukkan 'L' atau 'P'.");
        }

        System.out.println("--- Selesai / Akhir ---");
        scanner.close();
    }
}
