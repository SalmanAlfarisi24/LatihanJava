// File: MainApp.java
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
    private java.util.ArrayList<Mahasiswa> mahasiswa = new java.util.ArrayList<>();
    
    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public void tambahMahasiswa(Mahasiswa m) {
        mahasiswa.add(m);
    }
    
    public void cariMahasiswa(String nim) {
        for (Mahasiswa m : mahasiswa) {
            if (m.getNim().equals(nim)) {
                System.out.print("Ditemukan: ");
                m.tampilkanData();
                return;
            }
        }
        System.out.println("NIM " + nim + " tidak ditemukan");
    }
    
    public void tampilkanSemua() {
        System.out.println("Kelas: " + namaKelas);
        for (Mahasiswa m : mahasiswa) {
            m.tampilkanData();
        }
    }
}

public class MainApp {
    public static void main(String[] args) {
        Kelas kelasA = new Kelas("A");
        
        // Tambah mahasiswa
        kelasA.tambahMahasiswa(new Mahasiswa("Aris", "240602001", "Informatika"));
        kelasA.tambahMahasiswa(new Mahasiswa("Budi", "240602002", "Sistem Informasi"));
        kelasA.tambahMahasiswa(new Mahasiswa("Citra", "240602003", "Teknik Komputer"));
        
        // Tampilkan semua
        kelasA.tampilkanSemua();
        
        // Pencarian
        System.out.println("\n=== PENCARIAN ===");
        kelasA.cariMahasiswa("240602002");
        kelasA.cariMahasiswa("240602005");
    }
}
