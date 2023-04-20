package proyecto2.estructura;

import proyecto2.modelo.Usuario;

public class ListaSimple extends EstructuraDeDatos{
    private NodoUsuario cabeza = null;
    
    public void listar() {
        NodoUsuario nodoA = cabeza;
        while(nodoA != null ) {
            System.out.println(nodoA.getUser().usuario+"->");
            nodoA = nodoA.getSiguiente();
        }
        System.out.println("null \n");
    }

    @Override
    public void add(Object e) {
        Usuario user = (Usuario) e;
        
        if(find(user.usuario) != null) {
            return;
        }
        
        NodoUsuario nodoUser = new NodoUsuario(user);
        if(cabeza == null) {
            cabeza = nodoUser;
        } else {
            NodoUsuario nodoAux = cabeza;
            while(nodoAux.getSiguiente() != null) {
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nodoUser);
        }
        index++;
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object nombreUsuario) {
       
        NodoUsuario nodoU = cabeza;
        for(int i = 0; i < index; i++) {
            if(nodoU.getUser().usuario.equalsIgnoreCase(nombreUsuario.toString())) {
                return nodoU.getUser();
            }
            nodoU = nodoU.getSiguiente();
        }
        
        return null;
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        return index;
    }

    @Override
    public Object get(int i) {
        if(i < 0 || i >= index) {
            throw new IllegalArgumentException("Indice fuera de los limites");
        }
        
        NodoUsuario nodoAux = cabeza;
        for(int cont = 0; cont < i; cont++) {
            nodoAux = nodoAux.getSiguiente();
        }
        
        return nodoAux.getUser();
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
