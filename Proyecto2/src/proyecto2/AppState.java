package proyecto2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto2.estructura.ListaSimple;
import proyecto2.modelo.Usuario;

public class AppState {
    public static String rutaUsers = "./appState.bin";
    public static ListaSimple listaS = new ListaSimple();
    
    public static void Serializar() {
        File file = new File(rutaUsers);
        
        if(!file.exists()) {
            file.getParentFile().mkdir();
        }
        
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("No se pudo crear el archivo de serealizacion");
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(rutaUsers);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaS);
        } catch (FileNotFoundException e) {
            System.out.println("No encontro la carpeta del archivo.");
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Deserializar() {
        try {
            File file = new File(rutaUsers);
            if(!file.exists()) {
                return;
            }
            
            FileInputStream fis = new FileInputStream(rutaUsers);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaS = (ListaSimple) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
