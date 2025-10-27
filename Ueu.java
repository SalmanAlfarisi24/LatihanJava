Tentu, berikut adalah kode solusi yang mencakup semua atribut dari kasus cerita, tanpa menggunakan komentar:
💻 Class Mahasiswa
public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;
    private String jurusan;
    private String kelas;
    private int tahunMasuk; 

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public int getTahunMasuk() {
        return tahunMasuk;
    }
}

🚀 Class MainMahasiswa
public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhsA = new Mahasiswa();
        Mahasiswa mhsB = new Mahasiswa();

        System.out.println("--- Mengisi Data Mahasiswa A ---");
        mhsA.setNama("Fauzan Hamzah");
        mhsA.setNim("HMW2023001");
        mhsA.setIpk(3.95);
        mhsA.setJurusan("Teknik Informatika");
        mhsA.setKelas("A");
        mhsA.setTahunMasuk(2023);

        System.out.println("--- Mengisi Data Mahasiswa B ---");
        mhsB.setNama("Laily Fitriani");
        mhsB.setNim("HMW2022045");
        mhsB.setIpk(3.70);
        mhsB.setJurusan("Manajemen Bisnis");
        mhsB.setKelas("B");
        mhsB.setTahunMasuk(2022);
        
        System.out.println("\n");

        System.out.println("=== DATA MAHASISWA A ===");
        System.out.println("Nama: " + mhsA.getNama());
        System.out.println("NIM: " + mhsA.getNim());
        System.out.println("Jurusan: " + mhsA.getJurusan());
        System.out.println("Kelas: " + mhsA.getKelas());
        System.out.println("Tahun Masuk: " + mhsA.getTahunMasuk());
        System.out.println("IPK: " + mhsA.getIpk());
        
        System.out.println("---------------------------------");

        System.out.println("=== DATA MAHASISWA B ===");
        System.out.println("Nama: " + mhsB.getNama());
        System.out.println("NIM: " + mhsB.getNim());
        System.out.println("Jurusan: " + mhsB.getJurusan());
        System.out.println("Kelas: " + mhsB.getKelas());
        System.out.println("Tahun Masuk: " + mhsB.getTahunMasuk());
        System.out.println("IPK: " + mhsB.getIpk());
    }
}

