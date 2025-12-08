import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormNamaLengkap {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Nama");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel lblInput = new JLabel("Masukkan Nama:");
        lblInput.setBounds(20, 20, 120, 25);
        frame.add(lblInput);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(150, 20, 200, 25);
        frame.add(txtNama);

        JButton btnTampil = new JButton("Tampilkan");
        btnTampil.setBounds(150, 60, 100, 30);
        frame.add(btnTampil);

        JButton btnHapus = new JButton("Hapus");
        btnHapus.setBounds(260, 60, 90, 30);
        frame.add(btnHapus);

        JLabel lblOutput = new JLabel("Output akan tampil di sini");
        lblOutput.setBounds(20, 110, 350, 25);
        frame.add(lblOutput);

        btnTampil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText();
                if (nama.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Input tidak boleh kosong!");
                } else {
                    lblOutput.setText("Halo, " + nama + "!");
                }
            }
        });

        btnHapus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                lblOutput.setText("Output akan tampil di sini");
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
