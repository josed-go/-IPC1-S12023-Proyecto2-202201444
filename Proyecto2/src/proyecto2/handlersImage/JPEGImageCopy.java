package proyecto2.handlersImage;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.handlers.ImageHandler;


public class JPEGImageCopy extends ImageHandler{
    String nombreI;
    BufferedImage jpg;
    BufferedImage bmp;
    File bmpTemp;

    public JPEGImageCopy(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreI = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File fi = new File(getFileName());
        jpg = ImageIO.read(fi);
        bmpTemp = new File("src/imagenes/temporal/bmpTemp.bmp");
        ImageIO.write(jpg, "bmp", bmpTemp);
        bmp = ImageIO.read(bmpTemp);
    }

    @Override
    public void generateFiles() throws Exception {
        ImageIO.write(bmp, "jpg", new File("src/imagenes/copia-"+nombreI+".jpg"));
        bmpTemp.delete();
    }
    
}
