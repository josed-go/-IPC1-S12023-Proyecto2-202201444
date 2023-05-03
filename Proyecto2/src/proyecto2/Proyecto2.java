package proyecto2;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import proyecto2.controlador.UsuarioControlador;
import proyecto2.vista.Inicio;

/**
 *
 * @author JD
 */
public class Proyecto2 {


    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);

        UsuarioControlador userC = new UsuarioControlador();
        userC.ObtenerUsuarios();
        
    }
    
}
