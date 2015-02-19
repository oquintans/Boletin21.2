package ejercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Ventana {

    ArrayList ventana = new ArrayList();

    public void add() {
        int aux = 0;
        do {
            String info = JOptionPane.showInputDialog("Introducir info");
            ventana.add(info);
            aux = JOptionPane.showConfirmDialog(null, "Introducir mas?");
        } while (aux != 1);
    }
    public void visualizar(){
        for (int i = ventana.size()-1; i >= 0; i--) {
            JOptionPane.showMessageDialog(null,ventana.get(i));
            ventana.remove(i);
        }
    }
}
