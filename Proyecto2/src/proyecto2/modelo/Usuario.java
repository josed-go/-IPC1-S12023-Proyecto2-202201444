package proyecto2.modelo;

import java.io.Serializable;

public class Usuario implements Serializable{
    public String usuario;
    public boolean flag;
    
    public Usuario(String usuario, boolean flag) {
        this.usuario = usuario;
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
 
}
