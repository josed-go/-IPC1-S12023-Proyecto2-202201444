package proyecto2.controlador;

import proyecto2.AppState;
import proyecto2.estructura.ListaSimple;
import proyecto2.modelo.Usuario;


public class UsuarioControlador {

    static ListaSimple lista = new ListaSimple();
    static String userLog;
    
    public void CrearUsuario(String user) {
        Usuario nuevo = new Usuario(user);
        lista.add(nuevo);
        lista.listar();       
        AppState.SerializarU(lista);
    }
    
    public void UsuarioLog(String usuario) {
        for(int i = 0; i < lista.getSize(); i++) {
            if(((Usuario)lista.get(i)).usuario.equalsIgnoreCase(usuario)) {
                userLog = ((Usuario)lista.get(i)).usuario;
            }
        }
    }
    
    public String UsuarioLogeado() {
        return userLog;
    }
    
    public ListaSimple Usuarios() {
        return lista;
    }
    
    public void ObtenerUsuarios() {
        try {
            lista = AppState.DeserializarU();
        } catch (Exception e) {
        }
        
    }

    
}
