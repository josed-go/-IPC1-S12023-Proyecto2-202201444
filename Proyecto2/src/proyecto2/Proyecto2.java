package proyecto2;

import proyecto2.controlador.CategoriaControlador;
import proyecto2.controlador.ImagenControlador;
import proyecto2.controlador.UsuarioControlador;
import proyecto2.vista.Inicio;

/**
 *
 * @author JD
 */
public class Proyecto2 {


    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);

        UsuarioControlador userC = new UsuarioControlador();
        CategoriaControlador categoriaC = new CategoriaControlador();
        ImagenControlador imagenC = new ImagenControlador();
        userC.ObtenerUsuarios();
        categoriaC.Categorias();
        imagenC.Imagenes();
        
    }
    
}
