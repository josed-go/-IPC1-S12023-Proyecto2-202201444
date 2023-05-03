package proyecto2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto2.estructura.ListaDoble;
import proyecto2.estructura.ListaSimple;
import proyecto2.modelo.Categoria;

public class AppState {
    public static String rutaUsers = "./appStateU.dat";
    public static String rutaCategorias = "./appStateC.dat";
    public static String rutaImagenes = "./appStateI.dat";
    
    public static void SerializarU(ListaSimple listaU) {
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
            oos.writeObject(listaU);
        } catch (FileNotFoundException e) {
            System.out.println("No encontro la carpeta del archivo.");
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void SerializarC(ArrayList<Categoria> arrayC) {
        File file = new File(rutaCategorias);
        
        if(!file.exists()) {
            file.getParentFile().mkdir();
        }
        
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("No se pudo crear el archivo de serealizacion");
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(rutaCategorias);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayC);
        } catch (FileNotFoundException e) {
            System.out.println("No encontro la carpeta del archivo.");
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void SerializarI(ListaDoble listaD) {
        File file = new File(rutaImagenes);
        
        if(!file.exists()) {
            file.getParentFile().mkdir();
        }
        
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("No se pudo crear el archivo de serealizacion");
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(rutaImagenes);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaD);
        } catch (FileNotFoundException e) {
            System.out.println("No encontro la carpeta del archivo.");
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ListaSimple DeserializarU() {
        ListaSimple listaU = new ListaSimple();
        try {
            File file = new File(rutaUsers);
            if(!file.exists()) {
                return listaU;
            }
            
            
            FileInputStream fis = new FileInputStream(file);
            while(fis.available() > 0){
                ObjectInputStream ois = new ObjectInputStream(fis);
                listaU = (ListaSimple)ois.readObject();
                //ois.close();
            }
            //fis.close();
            
            return listaU;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaU;
    }
    
    public static ArrayList<Categoria> DeserializarC() {
        ArrayList<Categoria> arrayC = new ArrayList<>();
        try {
            File file = new File(rutaCategorias);
            if(!file.exists()) {
                return arrayC;
            }
            
            
            FileInputStream fis = new FileInputStream(file);
            while(fis.available() > 0){
                ObjectInputStream ois = new ObjectInputStream(fis);
                arrayC = (ArrayList<Categoria>)ois.readObject();
                //ois.close();
            }
            //fis.close();
            
            return arrayC;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayC;
    }
    
    public static ListaDoble DeserializarI() {
        ListaDoble listaD = new ListaDoble();
        try {
            File file = new File(rutaImagenes);
            if(!file.exists()) {
                return listaD;
            }
            
            
            FileInputStream fis = new FileInputStream(file);
            while(fis.available() > 0){
                ObjectInputStream ois = new ObjectInputStream(fis);
                listaD = (ListaDoble)ois.readObject();
                //ois.close();
            }
            //fis.close();
            
            return listaD;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaD;
    }
}
