// Class Orang
class Orang {
    private String nama;
    private String alamat;
    private int umur;
    
    // Constructor
    public Orang() {}
    
    public Orang(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    // method untuk.menampilkan data
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Umur: " + umur + " tahun");
    }
}

// Class Dosen (turunan dari Orang)
class Dosen extends Orang {
    private String nidn;
    
    // Constructor
    public Dosen() {}
    
    public Dosen(String nama, String alamat, int umur, String nidn) {
        super(nama, alamat, umur);
        this.nidn = nidn;
    }

    public String getNIDN() {
        return nidn;
    }

    public void setNIDN(String nidn) {
        this.nidn = nidn;
    }
    
    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }
}

// Class Mahasiswa (turunan dari Orang)
class Mahasiswa extends Orang {
    private String npm;
    
    // Constructor
    public Mahasiswa() {}
    
    public Mahasiswa(String nama, String alamat, int umur, String npm) {
        super(nama, alamat, umur);
        this.npm = npm;
    }
    
    public String getNPM() {
        return npm;
    }

    public void setNPM(String npm) {
        this.npm = npm;
    }
    
    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NPM: " + npm);
    }
}

// Class Utama (main class)
public class Utama {
    public static void main(String[] args) {
        
        Dosen dosen1 = new Dosen("Dr. Ahmad Wijaya", "Jl. Pendidikan No. 123", 45, "NIDN123456");
        
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "Jl. Merdeka No. 45", 20, "NPM202410001");
        
        System.out.println("----data Dosen ----");
        dosen1.displayInfo();
        
        System.out.println("\n---- data Mahasiswa ----");
        mhs1.displayInfo();
        
        // Demonstrasi penggunaan getter methods
        System.out.println("\n=== MENGGUNAKAN GETTER METHODS ===");
        System.out.println("Dosen - Nama: " + dosen1.getNama() + ", NIDN: " + dosen1.getNIDN());
        System.out.println("Mahasiswa - Nama: " + mhs1.getNama() + ", NPM: " + mhs1.getNPM());
    }
}
