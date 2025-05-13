package RutasAHospital;

public class Matriz {

    private int mat[][];
    private Nodo nodos[];

    public Matriz(int t) {
        mat = new int[t][t];
        nodos = new Nodo[t];
    }

    //metodo para agregar un nodo
    public void agregarNodo(int i, Nodo nodo) {
        nodos[i] = nodo;
    }

    //metodo para agegar la arista entre los nodos (dirigido)
    public void agregarArista(int origen, int destino) {
        mat[origen][destino] = 1;
    }

    //metodo para imprimir la matriz
    public void imprimirMat() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //metodo para imprimir los nodos de la matriz

    public void imprimirNodos() {
        System.out.println("Nodos del grafo:");
        for (int i = 0; i < nodos.length; i++) {
            System.out.println("Nodo " + i + ": " + nodos[i]);
        }
    }

}
