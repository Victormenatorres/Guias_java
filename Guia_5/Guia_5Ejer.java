import javax.swing.*;
import java.awt.event.*;

public class ListaNombres {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista de Nombres");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel etiResultado = new JLabel("Selecciona un nombre");
        etiResultado.setBounds(50, 170, 200, 20);
        etiResultado.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));

        DefaultListModel<String> modelo = new DefaultListModel<>();
        JList<String> lstNombres = new JList<>(modelo);
        JScrollPane scrollPane = new JScrollPane(lstNombres);
        scrollPane.setBounds(50, 50, 100, 80);

        JButton btnCurso1 = new JButton("Curso 1");
        btnCurso1.setBounds(170, 50, 100, 30);
        btnCurso1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> modelo = new DefaultListModel<>();
                modelo.addElement("Juan");
                modelo.addElement("María");
                modelo.addElement("Luis");
                lstNombres.setModel(modelo);
            }
        });

        JButton btnCurso2 = new JButton("Curso 2");
        btnCurso2.setBounds(170, 90, 100, 30);
        btnCurso2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> modelo = new DefaultListModel<>();
                modelo.addElement("Ana");
                modelo.addElement("Marta");
                modelo.addElement("Jose");
                lstNombres.setModel(modelo);
            }
        });

        JButton btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(170, 130, 100, 30);
        btnVaciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lstNombres.setModel(new DefaultListModel<>());
            }
        });

        lstNombres.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!lstNombres.isSelectionEmpty()) {
                    etiResultado.setText(lstNombres.getSelectedValue().toString());
                }
            }
        });

        frame.add(scrollPane);
        frame.add(btnCurso1);
        frame.add(btnCurso2);
        frame.add(btnVaciar);
        frame.add(etiResultado);

        frame.setVisible(true);
    }
}