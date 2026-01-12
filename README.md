```java
// Mahasiswa2.java
package GUI;

public class Mahasiswa2 {

    private String nama;
    private String nim;
    private String jurusan;
    private int tahunMasuk;
    private int sksLulus;
    private int sksTidakLulus;
    private String judulSkripsi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getSksLulus() {
        return sksLulus;
    }

    public void setSksLulus(int sksLulus) {
        this.sksLulus = sksLulus;
    }

    public int getSksTidakLulus() {
        return sksTidakLulus;
    }

    public void setSksTidakLulus(int sksTidakLulus) {
        this.sksTidakLulus = sksTidakLulus;
    }

    public String getJudulSkripsi() {
        return judulSkripsi;
    }

    public void setJudulSkripsi(String judulSkripsi) {
        this.judulSkripsi = judulSkripsi;
    }

    // Total SKS valid (tidak boleh negatif)
    public int getTotalValid() {
        int total = sksLulus - sksTidakLulus;
        return Math.max(total, 0);
    }
}
```

```java
// Input_Nilai.java
package GUI;

import javax.swing.*;
import java.awt.*;

public class Input_Nilai extends JFrame {

    private JTextField txtNama, txtNim, txtJurusan, txtTahun, txtLulus, txtTidakLulus, txtJudul;
    private JTextArea areaOutput;

    public Input_Nilai() {
        setTitle("Form Input Mahasiswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel panelInput = new JPanel(new GridLayout(7, 2, 8, 8));

        panelInput.add(new JLabel("Nama Mahasiswa"));
        txtNama = new JTextField();
        panelInput.add(txtNama);

        panelInput.add(new JLabel("NIM"));
        txtNim = new JTextField();
        panelInput.add(txtNim);

        panelInput.add(new JLabel("Jurusan"));
        txtJurusan = new JTextField();
        panelInput.add(txtJurusan);

        panelInput.add(new JLabel("Tahun Masuk"));
        txtTahun = new JTextField();
        panelInput.add(txtTahun);

        panelInput.add(new JLabel("Jumlah SKS Lulus"));
        txtLulus = new JTextField();
        panelInput.add(txtLulus);

        panelInput.add(new JLabel("Jumlah SKS Tidak Lulus"));
        txtTidakLulus = new JTextField();
        panelInput.add(txtTidakLulus);

        panelInput.add(new JLabel("Judul Skripsi"));
        txtJudul = new JTextField();
        panelInput.add(txtJudul);

        add(panelInput, BorderLayout.NORTH);

        areaOutput = new JTextArea(10, 40);
        areaOutput.setEditable(false);
        areaOutput.setLineWrap(true);
        areaOutput.setWrapStyleWord(true);
        add(new JScrollPane(areaOutput), BorderLayout.CENTER);

        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JButton btnSimpan = new JButton("Simpan");
        JButton btnReset = new JButton("Reset");
        panelButton.add(btnSimpan);
        panelButton.add(btnReset);
        add(panelButton, BorderLayout.SOUTH);

        btnSimpan.addActionListener(e -> simpanData());
        btnReset.addActionListener(e -> resetForm());

        pack();
        setLocationRelativeTo(null);
    }

    private void simpanData() {
        if (txtNama.getText().isEmpty() || txtNim.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan NIM wajib diisi!");
            return;
        }

        try {
            Mahasiswa2 m = new Mahasiswa2();
            m.setNama(txtNama.getText());
            m.setNim(txtNim.getText());
            m.setJurusan(txtJurusan.getText());
            m.setTahunMasuk(Integer.parseInt(txtTahun.getText()));
            m.setSksLulus(Integer.parseInt(txtLulus.getText()));
            m.setSksTidakLulus(Integer.parseInt(txtTidakLulus.getText()));
            m.setJudulSkripsi(txtJudul.getText());

            areaOutput.append(
                "Nama               : " + m.getNama() + "\n" +
                "NIM                : " + m.getNim() + "\n" +
                "Jurusan            : " + m.getJurusan() + "\n" +
                "Tahun Masuk        : " + m.getTahunMasuk() + "\n" +
                "SKS Lulus          : " + m.getSksLulus() + "\n" +
                "SKS Tidak Lulus    : " + m.getSksTidakLulus() + "\n" +
                "Total SKS Valid    : " + m.getTotalValid() + "\n" +
                "Judul Skripsi      : " + m.getJudulSkripsi() + "\n" +
                "----------------------------------------\n"
            );
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Tahun dan SKS harus berupa angka!");
        }
    }

    private void resetForm() {
        txtNama.setText("");
        txtNim.setText("");
        txtJurusan.setText("");
        txtTahun.setText("");
        txtLulus.setText("");
        txtTidakLulus.setText("");
        txtJudul.setText("");
        areaOutput.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Input_Nilai().setVisible(true));
    }
}
```
