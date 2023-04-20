package proyecto2.handlersImage;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.handlers.ImageHandler;


public class BMPtoJPEGImage extends ImageHandler {
    String nombreI;
    BufferedImage jpg;
    BufferedImage bmp;
    File bmpTemp;

    public BMPtoJPEGImage(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreI = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File fi = new File(getFileName());
        bmp = ImageIO.read(fi);
        
    }

    @Override
    public void generateFiles() throws Exception {
        ImageIO.write(bmp, "jpg", new File("src/imagenes/converted-"+nombreI+".jpg"));
    }
    
}
