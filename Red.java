 import java.util.ArrayList;

 public class Red {
        ArrayList<Nodo> nodos;

        Red() {
            nodos = new ArrayList<>();
        }

        void agregarNodo(Nodo n) {
            if(!nodos.contains(n))
            nodos.add(n);
        }

        void conectar(Nodo a, Nodo b) {
            a.conectar(b);
            b.conectar(a);
        }

        
        void mostrar() {
            System.out.println("===== GRAPH =====");
            for (Nodo n : nodos){
                System.out.println(n.getnombre() + " --> " + n.getvecinos());

            }
        }
        
        void resetCompromisos() {
            for (Nodo n : nodos){
                n.comprometido = false;
            }
        }

        void escanearDesde(Nodo origen) {
            // TODO: BFS desde origen - https://www.geeksforgeeks.org/dsa/breadth-first-search-or-bfs-for-a-graph/
            // Reglas:
            // - si un nodo visitado es vulnerable => comprometido=true
            // - si un nodo visitado es firewall => NO se propaga a sus vecinos
        }

        Nodo buscarPorIP(String ip) {
            // Buscar por IP (iterar nodos)
            for (Nodo n : nodos) {
                if (n.getIP().equals(ip)) {
                    return n;
                }
            }

        return null;
    }
  
        int contarVulnerablesAlcanzables(Nodo origen) {
            // Contar vulnerables alcanzables desde origen (BFS)
            return 0;
        }

        String listarVecinosDe(Nodo n) {
            // Listar vecinos (iterar vecinos)
            return "";
        }

        ArrayList<Nodo> nodosAislados() {
            // Obtener nodos aislados (vecinos.size()==0)
            return new ArrayList<>();
        }
    }
