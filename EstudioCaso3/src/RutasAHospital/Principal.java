package RutasAHospital;


public class Principal {

    public static void main(String[] args) {

        Matriz grafo = new Matriz(5);

        //creamos los nodos con su dato
        Nodo nodo0 = new Nodo(new Dato("Casa"));
        Nodo nodo1 = new Nodo(new Dato("Parada"));
        Nodo nodo2 = new Nodo(new Dato("Terminal"));
        Nodo nodo3 = new Nodo(new Dato("Periferie"));
        Nodo nodo4 = new Nodo(new Dato("Hospital"));

        //agregamos los nodos a la matriz
        grafo.agregarNodo(0, nodo0);
        grafo.agregarNodo(1, nodo1);
        grafo.agregarNodo(2, nodo2);
        grafo.agregarNodo(3, nodo3);
        grafo.agregarNodo(4, nodo4);

        //agregar las aristas
        grafo.agregarArista(0, 1);//Casa -> Parada
        grafo.agregarArista(0, 3);//Casa -> Periferie
        grafo.agregarArista(1, 0);//Parada -> Casa
        grafo.agregarArista(1, 2);//Parada -> Terminal
        grafo.agregarArista(2, 1);//Terminal -> Parada
        grafo.agregarArista(3, 0);//Periferie -> Casa
        grafo.agregarArista(2, 4);//Parada -> Hospital
        grafo.agregarArista(3, 4);//Periferie -> Hospital
        grafo.agregarArista(4, 2);//Hospital -> Terminal
        grafo.agregarArista(4, 3);//Hospital -> Periferie

        //imprimo los nodos y la matiz
        grafo.imprimirNodos();
        grafo.imprimirMat();
    }
}
