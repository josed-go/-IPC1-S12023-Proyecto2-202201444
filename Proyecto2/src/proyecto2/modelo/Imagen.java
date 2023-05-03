package proyecto2.modelo;

import java.io.Serializable;

public class Imagen implements Serializable{
    public String ruta;
    public String categoria;
    public String usuario;

    public Imagen(String ruta, String categoria, String usuario) {
        this.ruta = ruta;
        this.categoria = categoria;
        this.usuario = usuario;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
