package proyecto2.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto2.handlers.ImageHandler;
import proyecto2.handlers.JPEGHandler;

/**
 *
 * @author JD
 */
public class HiloC extends Thread {
    ImageHandler imgH;
    javax.swing.JTextArea textA;
    
    public HiloC(ImageHandler imgH, javax.swing.JTextArea jTextArea1) {
        this.imgH = imgH;
        this.textA = jTextArea1;
    }
    
    @Override
    public void run() {
        try {
            sleep(1000);
            textA.append("\nLeyendo imagen : " + imgH.getFileName());
            JPEGHandler.runHandler(imgH);
            textA.append("\nRotando la imagen : " + imgH.getFileName());
            sleep(1000);
        } catch (Exception ex) {
            Logger.getLogger(HiloC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
