package proyecto2.controlador;

import java.util.ArrayList;
import proyecto2.modelo.Categoria;


public class CategoriaControlador {
    
    static ArrayList<Categoria> arrayCategoria = new ArrayList<>();
    static ArrayList<Categoria> arrayCateUsuario = new ArrayList<>();
    
    public void CrearCategoriaGeneral(String user) {
        if(!ValidarUsuario(user)) {
            arrayCategoria.add(new Categoria("GENERAL", user));
        }
    }
    
    public boolean ValidarUsuario(String user) {
        for(Categoria cate: arrayCategoria) {
            if(cate.getNombre().equalsIgnoreCase("GENERAL") && cate.getUsuario().equalsIgnoreCase(user)) {
                return true;
            }
        }
        return false;
    }
    
    public void CategoriaUsuario(String user) {
        LimpiarArray();
        for(Categoria c: arrayCategoria) {
            if(c.getUsuario().equalsIgnoreCase(user)) {
                arrayCateUsuario.add(new Categoria(c.getNombre(),c.getUsuario()));
            }
        } 
    }
    
    public ArrayList<Categoria> ObtenerCategorias() {
        return arrayCateUsuario;
    }
    
    public void LimpiarArray() {
        arrayCateUsuario.clear();
    }
}
