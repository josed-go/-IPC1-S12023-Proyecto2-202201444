package proyecto2.estructura;

import java.io.Serializable;
import proyecto2.modelo.Usuario;


public class NodoUsuario implements Serializable{
    private Usuario user;
    private NodoUsuario siguiente;
    
    public NodoUsuario(Usuario user) {
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
    
}
