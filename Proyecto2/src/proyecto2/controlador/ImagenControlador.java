package proyecto2.controlador;

import java.util.ArrayList;
import proyecto2.AppState;
import proyecto2.estructura.ListaDoble;
import proyecto2.modelo.Imagen;


public class ImagenControlador {
    
    static ListaDoble listaD = new ListaDoble();
    static ListaDoble cola = new ListaDoble();
    
    static ArrayList<String> arrayUser = new ArrayList<>();
    
    UsuarioControlador userC = new UsuarioControlador();
    
    public void AgregarImagen(String ruta, String categoria) {
        Imagen imagenN = new Imagen(ruta, categoria, userC.UsuarioLogeado());
        listaD.add(imagenN);
        listaD.MostrarLista();
        AppState.SerializarI(listaD);
     }
    
    public void EliminarImagen(String categoria,String ruta) {
        for(int i = 0; i < listaD.getSize(); i++) {
            if(((Imagen)listaD.get(i)).getCategoria().equalsIgnoreCase(categoria) && ((Imagen)listaD.get(i)).getRuta().equalsIgnoreCase(ruta) && ((Imagen)listaD.get(i)).getUsuario().equalsIgnoreCase(userC.UsuarioLogeado())) {
                listaD.delete(ruta);
                LimpiarArray();
                ImagenesCategoria(categoria);
                System.out.println(ruta+" Imagen eliminada");
                listaD.MostrarLista();
                AppState.SerializarI(listaD);
            }
        }
    }
    
    public void ImagenesCategoria(String categoria) {
        LimpiarArray();
        for(int i = 0; i < listaD.getSize(); i++) {
            if(((Imagen)listaD.get(i)).getCategoria().equalsIgnoreCase(categoria) && ((Imagen)listaD.get(i)).getUsuario().equalsIgnoreCase(userC.UsuarioLogeado())) {
                arrayUser.add(((Imagen)listaD.get(i)).getRuta());
            }
        }
    }
    
    public void EliminarImagenes(String categoria) {
        int i = 0;
                
        try {
            while(listaD.getSize() >= 0) {
                i = listaD.getSize()-1;
                if(((Imagen)listaD.get(i)).getCategoria().equalsIgnoreCase(categoria) && ((Imagen)listaD.get(i)).getUsuario().equalsIgnoreCase(userC.UsuarioLogeado())) {
                    listaD.delete(((Imagen)listaD.get(i)).getRuta());
                    AppState.SerializarI(listaD);
                }
            }
            LimpiarArray();
        } catch (Exception ex) {
            
        }
        
    }
    
    public void Imagenes() {
        try {
            listaD = AppState.DeserializarI();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<String> ObtenerImagenes() {
        return arrayUser;
    }
    
    public void LimpiarArray() {
        arrayUser.clear();
    }
    
    // CONVERTIDOR DE IMAGENES
    
    public void AgregarImagenesACola(String user, String categoria) {
        
        for(int i = 0; i < listaD.getSize(); i++) {
            if(((Imagen)listaD.get(i)).getCategoria().equalsIgnoreCase(categoria) && ((Imagen)listaD.get(i)).getUsuario().equalsIgnoreCase(user)) {
                cola.add(listaD.get(i));
            }
        }
        cola.MostrarLista();
        
    }
    
    public ListaDoble ImagenesCola() {
        return cola;
    }
}
