package proyecto2.handlersImage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.handlers.ImageHandler;

//CLASE PARA PASAR IMAGEN A BLANCO Y NEGRO

public class JPEGImageHandlerBN extends ImageHandler{
    String nombreI;
    BufferedImage jpg;
    BufferedImage bmp;
    File bmpTemp;

    public JPEGImageHandlerBN(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreI = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File fi = new File(getFileName());
        jpg = ImageIO.read(fi);
        bmpTemp = new File("src/imagenes/temporal/bmpTemp2.bmp");
        ImageIO.write(jpg, "bmp", bmpTemp);
        bmp = ImageIO.read(bmpTemp);
    }

    @Override
    public void generateFiles() throws Exception {
        for(int i = 0; i < bmp.getWidth(); i++) {
            for(int j = 0; j < bmp.getHeight(); j++) {
                Color color = new Color(bmp.getRGB(i, j));
                int promedio = (color.getBlue()+ color.getGreen() + color.getRed())/3;
                Color nuevo = new Color(promedio, promedio, promedio);
                bmp.setRGB(i, j, nuevo.getRGB());
            }
        }
        ImageIO.write(bmp, "jpg", new File("src/imagenes/BN-"+nombreI+".jpg"));
        bmpTemp.delete();
    }
    
}
