import javax.swing.*;

public class ListaColores {
    public static void main(String[] args) {
        String[] colores = {"Rojo", "Verde", "Azul"};
        
        while (true) {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null, 
                    "Selecciona un color:", 
                    "Lista de Colores", 
                    JOptionPane.PLAIN_MESSAGE, 
                    null, 
                    colores, 
                    colores[0]);
            
            if (seleccion == null) {
                JOptionPane.showMessageDialog(null, "No hay un color seleccionado.");
            } else {
                JOptionPane.showMessageDialog(null, "El color seleccionado es: " + seleccion);
            }
        }
    }
}