import javax.swing.*;
import java.awt.event.*;

public class ComboNumeros {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Números Pares e Impares");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JComboBox<String> cboNumeros = new JComboBox<>();
        cboNumeros.setBounds(50, 50, 100, 30);

        JButton btnPares = new JButton("Pares");
        btnPares.setBounds(170, 50, 100, 30);
        btnPares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
                for (int i = 0; i < 10; i += 2) {
                    modelo.addElement("Nº " + i);
                }
                cboNumeros.setModel(modelo);
            }
        });

        JButton btnImpares = new JButton("Impares");
        btnImpares.setBounds(170, 90, 100, 30);
        btnImpares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
                for (int i = 1; i < 10; i += 2) {
                    modelo.addElement("Nº " + i);
                }
                cboNumeros.setModel(modelo);
            }
        });

        JButton btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(170, 130, 100, 30);
        btnVaciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cboNumeros.setModel(new DefaultComboBoxModel<>());
            }
        });

        JLabel etiResultado = new JLabel("Seleccione un número");
        etiResultado.setBounds(50, 170, 200, 20);
        etiResultado.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));

        cboNumeros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cboNumeros.getSelectedItem() != null) {
                    etiResultado.setText(cboNumeros.getSelectedItem().toString());
                }
            }
        });

        frame.add(cboNumeros);
        frame.add(btnPares);
        frame.add(btnImpares);
        frame.add(btnVaciar);
        frame.add(etiResultado);

        frame.setVisible(true);
    }
}