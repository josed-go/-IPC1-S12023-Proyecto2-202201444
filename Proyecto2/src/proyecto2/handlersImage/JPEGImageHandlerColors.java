package proyecto2.handlersImage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.handlers.ImageHandler;


public class JPEGImageHandlerColors extends ImageHandler{
    String nombreI;
    BufferedImage jpg;
    BufferedImage bmpR;
    BufferedImage bmpV;
    BufferedImage bmpA;
    BufferedImage bmpS;
    File bmpTemp;

    public JPEGImageHandlerColors(String filename) {
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
        bmpR = ImageIO.read(bmpTemp);
        bmpV = ImageIO.read(bmpTemp);
        bmpA = ImageIO.read(bmpTemp);
        bmpS = ImageIO.read(bmpTemp);
    }

    @Override
    public void generateFiles() throws Exception {
        // GENERAR IMAGEN ROJA
        for(int i = 0; i < bmpR.getWidth(); i++) {
            for(int j = 0; j < bmpR.getHeight(); j++) {
                Color color = new Color(bmpR.getRGB(i, j));
                Color nuevo = new Color(color.getRed(),0,0);
                bmpR.setRGB(i, j, nuevo.getRGB());
            }
        }
        ImageIO.write(bmpR, "jpg", new File("src/imagenes/Red-"+nombreI+".jpg"));
        
        // GENERAR IMAGEN VERDE
        for(int i = 0; i < bmpV.getWidth(); i++) {
            for(int j = 0; j < bmpV.getHeight(); j++) {
                Color color = new Color(bmpV.getRGB(i, j));
                Color nuevo = new Color(0,color.getGreen(),0);
                bmpV.setRGB(i, j, nuevo.getRGB());
            }
        }
        ImageIO.write(bmpV, "jpg", new File("src/imagenes/Green-"+nombreI+".jpg"));
        
        // GENERAR IMAGEN AZUL
        for(int i = 0; i < bmpA.getWidth(); i++) {
            for(int j = 0; j < bmpA.getHeight(); j++) {
                Color color = new Color(bmpA.getRGB(i, j));
                Color nuevo = new Color(0,0,color.getBlue());
                bmpA.setRGB(i, j, nuevo.getRGB());
            }
        }
        ImageIO.write(bmpA, "jpg", new File("src/imagenes/Blue-"+nombreI+".jpg"));
        
        // GENERAR IMAGEN SEPIA
        for(int i = 0; i < bmpS.getWidth(); i++) {
            for(int j = 0; j < bmpS.getHeight(); j++) {
                Color color = new Color(bmpS.getRGB(i, j));
                Color nuevo = new Color((int)(0.4*color.getRed()),(int)(0.23*color.getGreen()),(int)(0.16*color.getBlue()));
                bmpS.setRGB(i, j, nuevo.getRGB());
            }
        }
        ImageIO.write(bmpS, "jpg", new File("src/imagenes/Sepia-"+nombreI+".jpg"));
        
        
        
        bmpTemp.delete();
    }
    
}
