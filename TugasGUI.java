// AplikasiMahasiswa.java
import javax.swing.*;
import java.awt.*;

public class AplikasiMahasiswa extends JFrame {
    private JTextField[][] tf = new JTextField[2][7];
    
    class Mahasiswa {
        private String nama, nim, jurusan, tahunMasuk, judulSkripsi;
        private int sksLulus, sksTidakLulus;
        
        public void setData(int i) {
            nama = tf[i][0].getText();
            nim = tf[i][1].getText();
            jurusan = tf[i][2].getText();
            tahunMasuk = tf[i][3].getText();
            sksLulus = Integer.parseInt(tf[i][4].getText());
            sksTidakLulus = Integer.parseInt(tf[i][5].getText());
            judulSkripsi = tf[i][6].getText();
        }
        
        public int hitungSks() { return sksLulus - sksTidakLulus; }
        
        public String getInfo() {
            return "Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan +
                   "\nTahun Masuk: " + tahunMasuk + "\nSKS Lulus: " + sksLulus +
                   "\nSKS Tidak Lulus: " + sksTidakLulus + "\nTotal SKS Valid: " + hitungSks() +
                   "\nJudul Skripsi: " + judulSkripsi + "\nStatus: " + 
                   (hitungSks() >= 100 ? "MEMENUHI" : "BELUM MEMENUHI") + "\n\n";
        }
    }
    
    public AplikasiMahasiswa() {
        setTitle("Input Mahasiswa");
        setSize(800, 600);
        setLayout(new BorderLayout());
        
        // Input panel
        JPanel panel = new JPanel(new GridLayout(1, 2, 10, 0));
        String[] labels = {"Nama", "NIM", "Jurusan", "Tahun Masuk", "SKS Lulus", "SKS Tidak Lulus", "Judul Skripsi"};
        
        for (int i = 0; i < 2; i++) {
            JPanel p = new JPanel(new GridLayout(7, 2));
            for (int j = 0; j < 7; j++) {
                p.add(new JLabel(labels[j]));
                tf[i][j] = new JTextField();
                p.add(tf[i][j]);
            }
            panel.add(p);
        }
        
        // Buttons
        JPanel btnPanel = new JPanel();
        btnPanel.add(new JButton("Proses") {{
            addActionListener(e -> proses());
        }});
        btnPanel.add(new JButton("Reset") {{
            addActionListener(e -> reset());
        }});
        btnPanel.add(new JButton("Keluar") {{
            addActionListener(e -> System.exit(0));
        }});
        
        add(panel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        
        // Data contoh
        String[][] contoh = {
            {"Ahmad", "001", "TI", "2021", "120", "10", "Skripsi 1"},
            {"Budi", "002", "SI", "2021", "110", "15", "Skripsi 2"}
        };
        
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 7; j++)
                tf[i][j].setText(contoh[i][j]);
        
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void proses() {
        Mahasiswa[] mhs = new Mahasiswa[2];
        StringBuilder hasil = new StringBuilder();
        
        for (int i = 0; i < 2; i++) {
            mhs[i] = new Mahasiswa();
            mhs[i].setData(i);
            hasil.append("MAHASISWA ").append(i+1).append(":\n");
            hasil.append(mhs[i].getInfo());
        }
        
        JOptionPane.showMessageDialog(this, hasil.toString());
    }
    
    private void reset() {
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 7; j++)
                tf[i][j].setText("");
    }
    
    public static void main(String[] args) {
        new AplikasiMahasiswa();
    }
  }
