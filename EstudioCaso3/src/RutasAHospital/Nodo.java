package RutasAHospital;

public class Nodo {
    private Dato dato;

    public Nodo(Dato dato) {
        this.dato = dato;
    }

    public Dato getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return dato.toString();
    }    
}
