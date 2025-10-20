// File: MainApp.java
import java.util.Scanner;
import java.util.ArrayList;

class Mahasiswa {
    private String nama, nim, jurusan;
    
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    
    public String getNim() { return nim; }
    
    public void tampilkanData() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan);
    }
}

class Kelas {
    private String namaKelas;
    private ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    
    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public void tambahMahasiswa(Mahasiswa m) {
        mahasiswa.add(m);
    }
    
    public void cariMahasiswa(String nim) {
        boolean ditemukan = false;
        for (Mahasiswa m : mahasiswa) {
            if (m.getNim().equals(nim)) {
                System.out.print("✓ Ditemukan: ");
                m.tampilkanData();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("✗ NIM " + nim + " tidak ditemukan");
        }
    }
    
    public void tampilkanSemua() {
        System.out.println("\n=== DATA KELAS " + namaKelas + " ===");
        for (Mahasiswa m : mahasiswa) {
            m.tampilkanData();
        }
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kelas kelasA = new Kelas("A");
        
        // Data awal
        kelasA.tambahMahasiswa(new Mahasiswa("Aris", "240602001", "Informatika"));
        kelasA.tambahMahasiswa(new Mahasiswa("Budi", "240602002", "Sistem Informasi"));
        kelasA.tambahMahasiswa(new Mahasiswa("Citra", "240602003", "Teknik Komputer"));
        
        // Menu utama
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan semua mahasiswa");
            System.out.println("2. Cari mahasiswa by NIM");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    kelasA.tampilkanSemua();
                    break;
                case 2:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = scanner.nextLine();
                    kelasA.cariMahasiswa(nimCari);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
                      }
