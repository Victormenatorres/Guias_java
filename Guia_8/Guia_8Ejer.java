import javax.swing.*;
import java.awt.event.*;

public class ComboColores {
    public static void main(String[] args) {
        String[] colores = {"Rojo", "Verde", "Azul"};

        JComboBox<String> cboColores = new JComboBox<>(colores);
        cboColores.setEditable(true);

        JLabel etiResultado = new JLabel("Seleccione un color");

        cboColores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mensaje = "El color elegido es " + cboColores.getSelectedItem().toString();
                etiResultado.setText(mensaje);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        JPanel panel = new JPanel();
        panel.add(cboColores);
        panel.add(etiResultado);

        JOptionPane.showMessageDialog(null, panel, "Selecciona un color", JOptionPane.PLAIN_MESSAGE);
    }
}