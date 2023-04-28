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
    
    public HiloC(ImageHandler imgH) {
        this.imgH = imgH;
    }
    
    @Override
    public void run() {
        try {
            sleep(1000);
            JPEGHandler.runHandler(imgH);
            sleep(1000);
        } catch (Exception ex) {
            Logger.getLogger(HiloC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
