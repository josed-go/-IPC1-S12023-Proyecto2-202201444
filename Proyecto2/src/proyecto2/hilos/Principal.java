package proyecto2.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto2.handlers.ImageHandler;
import proyecto2.handlers.JPEGHandler;

/**
 *
 * @author JD
 */
public class Principal extends Thread {
    
    ImageHandler imgH;
    javax.swing.JTextArea textA;
    
    public Principal(ImageHandler imgH, javax.swing.JTextArea jTextArea1) {
        this.imgH = imgH;
        this.textA = jTextArea1;
    }
    
    @Override
    public void run() {
        try {
            sleep(1000);
            textA.append("\nLeyendo imagen : " + imgH.getFileName());
            JPEGHandler.runHandler(imgH);
            textA.append("\nConvirtiendo imagen : " + imgH.getFileName());
            sleep(1000);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
