package proyecto2.estructura;

import proyecto2.modelo.Imagen;


public class ListaDoble extends EstructuraDeDatos{
    
    NodoImagen primerNodo;
    NodoImagen ultimoNodo;
    
    public void MostrarLista() {
        if(primerNodo == null) {
            return;
        }
        
        NodoImagen nodoAux = primerNodo;
        while(nodoAux != null) {
            System.out.println(nodoAux.getImagen().getRuta() + "-->");
            nodoAux = nodoAux.getSiguiente();
        }
    }

    @Override
    public void add(Object e) {
        Imagen imagen = (Imagen)e;
        
        if(primerNodo == null) {
            primerNodo = ultimoNodo = new NodoImagen(imagen);
        } else {
            NodoImagen newNodo = new NodoImagen(imagen, null, ultimoNodo);
            ultimoNodo.setSiguiente(newNodo);
            ultimoNodo = newNodo;
        }
        index++;
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        if(primerNodo != null) {
            return  null;
        }
        
        String rutaImagen = e.toString();
        NodoImagen nodoAux = primerNodo;
        
        for(int i = 0; i < index; i++) {
            if(nodoAux.getImagen().getRuta().equals(rutaImagen)) {
                return nodoAux.getImagen();
            }
            nodoAux = nodoAux.getSiguiente();
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
        if(i < 0 || i > index) {
            return new IndexOutOfBoundsException();
        }
        
        NodoImagen nodoAux = primerNodo;
        
        for(int j = 0; j < i; j++) {
            nodoAux = nodoAux.getSiguiente();
        }
        
        return nodoAux.getImagen();
        
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        String ruta = e.toString();
        NodoImagen nodoAux = primerNodo;
        
        while(nodoAux != null && !nodoAux.getImagen().getRuta().equals(ruta) ) {
            nodoAux = nodoAux.getSiguiente();
        }
        
        if(nodoAux == null) {
            return;
        } else if (nodoAux == primerNodo) {
            primerNodo = primerNodo.getSiguiente();
            if(primerNodo != null) {
                primerNodo.setAnterior(null);
            }            
        } else if (nodoAux == ultimoNodo) {
            ultimoNodo = ultimoNodo.getAnterior();
            ultimoNodo.setSiguiente(null);
        } else {
            nodoAux.getAnterior().setSiguiente(nodoAux.getSiguiente());
            nodoAux.getSiguiente().setAnterior(nodoAux.getAnterior());
        }
        index--;
    }
    
}
