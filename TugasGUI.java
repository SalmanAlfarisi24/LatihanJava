import javax.swing.JOptionPane;

class Mahasiswa {
    private String nama, nim, jurusan, tahunMasuk, judulSkripsi;
    private int sksLulus, sksGagal;

    // Constructor
    public Mahasiswa() {}

    // Getter dan Setter
    public void setNama(String nama) { this.nama = nama; }
    public String getNama() { return nama; }

    public void setNim(String nim) { this.nim = nim; }
    public String getNim() { return nim; }

    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
    public String getJurusan() { return jurusan; }

    public void setTahunMasuk(String tahun) { this.tahunMasuk = tahun; }
    public String getTahunMasuk() { return tahunMasuk; }

    public void setSksLulus(int sks) { this.sksLulus = sks; }
    public int getSksLulus() { return sksLulus; }

    public void setSksGagal(int sks) { this.sksGagal = sks; }
    public int getSksGagal() { return sksGagal; }

    public void setJudul(String judul) { this.judulSkripsi = judul; }
    public String getJudul() { return judulSkripsi; }

    // Hitung Total SKS Valid
    public int getTotalSksValid() {
        return sksLulus - sksGagal;
    }
}

public class ProgramMahasiswa {
    public static void main(String[] args) {
        // Membuat 2 Objek Mahasiswa
        for (int i = 1; i <= 2; i++) {
            Mahasiswa mhs = new Mahasiswa();
            
            JOptionPane.showMessageDialog(null, "Input Data Mahasiswa ke-" + i);
            mhs.setNama(JOptionPane.showInputDialog("Nama Mahasiswa:"));
            mhs.setNim(JOptionPane.showInputDialog("NIM:"));
            mhs.setJurusan(JOptionPane.showInputDialog("Jurusan:"));
            mhs.setTahunMasuk(JOptionPane.showInputDialog("Tahun Masuk:"));
            mhs.setSksLulus(Integer.parseInt(JOptionPane.showInputDialog("Jumlah SKS Lulus:")));
            mhs.setSksGagal(Integer.parseInt(JOptionPane.showInputDialog("Jumlah SKS Tidak Lulus:")));
            mhs.setJudul(JOptionPane.showInputDialog("Judul Skripsi:"));

            // Menampilkan Hasil
            String hasil = "--- Data Mahasiswa ke-" + i + " ---\n" +
                           "Nama: " + mhs.getNama() + "\n" +
                           "NIM: " + mhs.getNim() + "\n" +
                           "Jurusan: " + mhs.getJurusan() + "\n" +
                           "Tahun Masuk: " + mhs.getTahunMasuk() + "\n" +
                           "SKS Lulus: " + mhs.getSksLulus() + "\n" +
                           "SKS Tidak Lulus: " + mhs.getSksGagal() + "\n" +
                           "Total SKS Valid: " + mhs.getTotalSksValid() + "\n" +
                           "Judul Skripsi: " + mhs.getJudul();
            
            JOptionPane.showMessageDialog(null, hasil);
        }
    }
}
