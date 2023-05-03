package proyecto2.controlador;

import java.util.ArrayList;
import proyecto2.AppState;
import proyecto2.modelo.Categoria;


public class CategoriaControlador {
    
    static ArrayList<Categoria> arrayCategoria = new ArrayList<>();
    static ArrayList<Categoria> arrayCateUsuario = new ArrayList<>();
    
    UsuarioControlador userC = new UsuarioControlador();
    ImagenControlador imagenC = new ImagenControlador();
    
    public void CrearCategoriaGeneral(String user) {
        if(!ValidarUsuario(user)) {
            arrayCategoria.add(new Categoria("GENERAL", user));
        }
    }
    
    public void AgregarCategoria(String categoria) {
        if(!ValidarCategoria(categoria)) {
            arrayCategoria.add(new Categoria(categoria, userC.UsuarioLogeado()));
            CategoriaUsuario(userC.UsuarioLogeado());
            AppState.SerializarC(arrayCategoria);
        }
    }
    
    public void EliminarCategoria(String categoria) {
        for(int i = 0; i < arrayCategoria.size(); i++) {
            if(arrayCategoria.get(i).getNombre().equalsIgnoreCase(categoria) && arrayCategoria.get(i).getUsuario().equalsIgnoreCase(userC.UsuarioLogeado())) {
                if(arrayCategoria.get(i).getNombre().equalsIgnoreCase("GENERAL")) {
                    userC.ValidarUsuario().setFlag(false);
                }
                arrayCategoria.remove(i);
                CategoriaUsuario(userC.UsuarioLogeado());
                AppState.SerializarC(arrayCategoria);
            }
        }
        imagenC.EliminarImagenes(categoria);
    }
    
    public boolean ValidarCategoria(String categoria) {
        for(Categoria cate: arrayCategoria) {
            if(cate.getNombre().equalsIgnoreCase(categoria) && cate.getUsuario().equals(userC.UsuarioLogeado())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean ValidarUsuario(String user) {
        for(Categoria cate: arrayCategoria) {
            if((cate.getNombre().equalsIgnoreCase("GENERAL") && cate.getUsuario().equalsIgnoreCase(user)) || userC.ValidarUsuario().flag == false) {
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
    
    public void Categorias() {
        try {
            arrayCategoria = AppState.DeserializarC();
        } catch (Exception e) {
        }
    }
}
