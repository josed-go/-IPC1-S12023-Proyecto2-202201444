package proyecto2.handlersImage;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.handlers.ImageHandler;


public class JPEGtoBMPImage extends ImageHandler {
    String nombreI;
    BufferedImage jpg;
    BufferedImage bmp;
    File bmpTemp;

    public JPEGtoBMPImage(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreI = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File fi = new File(getFileName());
        jpg = ImageIO.read(fi);
        bmpTemp = new File("src/imagenes/temporal/bmpTemp5.bmp");
        ImageIO.write(jpg, "bmp", bmpTemp);
        bmp = ImageIO.read(bmpTemp);
        
    }

    @Override
    public void generateFiles() throws Exception {
        ImageIO.write(jpg, "bmp", new File("src/imagenes/converted-"+nombreI+".bmp"));
        bmpTemp.delete();
    }
    
}
