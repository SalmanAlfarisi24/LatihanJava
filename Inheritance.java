// Kelas induk (superclass) untuk semua pegawai
class Pegawai {
    // Atribut umum yang dimiliki semua pegawai
    private String nama;
    private String alamat;
    private String telepon;
    private String bagian;
    private String nomorId;
    private double gajiPokok;

    // Constructor
    public Pegawai(String nama, String alamat, String telepon, 
                   String bagian, String nomorId, double gajiPokok) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.bagian = bagian;
        this.nomorId = nomorId;
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getNomorId() {
        return nomorId;
    }

    public void setNomorId(String nomorId) {
        this.nomorId = nomorId;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan informasi umum pegawai
    public void displayInfo() {
        System.out.println("=== Data Pegawai ===");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
        System.out.println("Bagian: " + bagian);
        System.out.println("ID: " + nomorId);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
    }
}

// Kelas turunan untuk Pegawai Tetap
class PegawaiTetap extends Pegawai {
    private double tunjanganTetap;

    // Constructor
    public PegawaiTetap(String nama, String alamat, String telepon,
                        String bagian, String nomorId, double gajiPokok, 
                        double tunjanganTetap) {
        super(nama, alamat, telepon, bagian, nomorId, gajiPokok);
        this.tunjanganTetap = tunjanganTetap;
    }

    // Getter dan Setter khusus Pegawai Tetap
    public double getTunjanganTetap() {
        return tunjanganTetap;
    }

    public void setTunjanganTetap(double tunjanganTetap) {
        this.tunjanganTetap = tunjanganTetap;
    }

    // Method menghitung total gaji
    public double hitungTotalGaji() {
        return getGajiPokok() + tunjanganTetap;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tunjangan Tetap: Rp" + tunjanganTetap);
        System.out.println("Total Gaji: Rp" + hitungTotalGaji());
        System.out.println("Status: Pegawai Tetap\n");
    }
}

// Kelas turunan untuk Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // dalam bulan

    // Constructor
    public PegawaiKontrak(String nama, String alamat, String telepon,
                          String bagian, String nomorId, double gajiPokok,
                          int lamaKontrak) {
        super(nama, alamat, telepon, bagian, nomorId, gajiPokok);
        this.lamaKontrak = lamaKontrak;
    }

    // Getter dan Setter khusus Pegawai Kontrak
    public int getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
        System.out.println("Status: Pegawai Kontrak\n");
    }
}

// Kelas utama untuk testing
public class SistemDataPegawai {
    public static void main(String[] args) {
        // Membuat objek pegawai tetap
        PegawaiTetap pt1 = new PegawaiTetap(
            "Ahmad Santoso",
            "Jl. Merdeka No. 123",
            "08123456789",
            "Keuangan",
            "PT001",
            6000000,
            1500000
        );

        // Membuat objek pegawai kontrak
        PegawaiKontrak pk1 = new PegawaiKontrak(
            "Budi Prasetyo",
            "Jl. Sudirman No. 456",
            "08765432109",
            "Marketing",
            "PK001",
            4500000,
            12
        );

        // Menampilkan informasi pegawai
        pt1.displayInfo();
        pk1.displayInfo();
    }
}
