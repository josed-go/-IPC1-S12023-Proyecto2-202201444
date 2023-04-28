package proyecto2.handlersImage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.handlers.ImageHandler;


public class JPEGImageHandlerRotator extends ImageHandler{
    String nombreI;
    BufferedImage jpg;
    BufferedImage bmpH;
    BufferedImage bmpV;
    File bmpTemp;

    public JPEGImageHandlerRotator(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreI = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File fi = new File(getFileName());
        jpg = ImageIO.read(fi);
        bmpTemp = new File("src/imagenes/temporal/bmpTemp4.bmp");
        ImageIO.write(jpg, "jpg", bmpTemp);
        bmpH = ImageIO.read(bmpTemp);
        bmpV = ImageIO.read(bmpTemp);
    }

    @Override
    public void generateFiles() throws Exception {
        
        for(int i = 0; i < (bmpH.getWidth()); i++) {
            for(int j = 0; j < (bmpH.getHeight()+1)/2; j++) {       
               Color colorT = new Color(bmpH.getRGB(i, j));
               
               bmpH.setRGB(i, j, bmpH.getRGB(i, bmpH.getHeight()-1-j));
                
               bmpH.setRGB(i, bmpH.getHeight()-1-j, colorT.getRGB() );
            }
        }

        ImageIO.write(bmpH, "jpg", new File("src/imagenes/Hrotation-"+nombreI+".jpg"));
        
        for(int i = 0; i < (bmpV.getWidth()+1)/2; i++) {
            for(int j = 0; j < (bmpV.getHeight()); j++) {       
               Color colorT = new Color(bmpV.getRGB(i, j));
               
               bmpV.setRGB(i, j, bmpV.getRGB(bmpV.getWidth()-i-1, j));
                
               bmpV.setRGB(bmpV.getWidth()-i-1, j, colorT.getRGB() );
            }
        }

        ImageIO.write(bmpV, "jpg", new File("src/imagenes/Vrotation-"+nombreI+".jpg"));
        bmpTemp.delete();
    }
    
}
