public class MainMahasiswa {
    public static void main(String[] args) {
        
        // 1. Membuat objek dan mengisi data (Menggantikan semua Setter)
        Mahasiswa mhsA = new Mahasiswa(
            "Fauzan Hamzah", 
            "HMW2023001", 
            3.95, 
            "Teknik Informatika", 
            "A", 
            2023
        );
        
        Mahasiswa mhsB = new Mahasiswa(
            "Laily Fitriani", 
            "HMW2022045", 
            3.70, 
            "Manajemen Bisnis", 
            "B", 
            2022
        );
        
        System.out.println("Data Mahasiswa telah diinisialisasi.");
        System.out.println("\n");

        // 2. Menampilkan data objek (Menggantikan semua Getter)
        System.out.println("=== DATA MAHASISWA A ===");
        System.out.println(mhsA.toString()); // Atau cukup System.out.println(mhsA);

        System.out.println("\n=== DATA MAHASISWA B ===");
        System.out.println(mhsB.toString()); // Atau cukup System.out.println(mhsB);
    }
}
