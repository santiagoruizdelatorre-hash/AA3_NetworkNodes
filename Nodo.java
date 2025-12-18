import java.util.ArrayList;

public class Nodo {
    String nombre;
    String ip;
    boolean firewall;
    boolean vulnerable;
    boolean comprometido;
    ArrayList<Nodo> vecinos;



    Nodo(String nombre, String ip, boolean firewall, boolean vulnerable) {
        this.nombre = nombre;
        this.ip = ip;
        this.firewall = firewall;
        this.vulnerable = vulnerable;
        this.comprometido = false;
        this.vecinos = new ArrayList<>();
    }

        
    void conectar(Nodo otro) {
        if (!vecinos.contains(otro)) {
            vecinos.add(otro);
        }
    }

    @Override
    public String toString() {
        // TODO: devolver algo tipo:
        // "WebServer (172.16.0.10) [VULN] [PWN]" etc.
        return "";
    }


    public String getnombre() {
        return nombre;
    }


    public String getIP() {
        return ip;
    }

    public boolean isFirewall() {
        return firewall;
    }

    public boolean isVulnerable() {
        return vulnerable;
    }

    public boolean isComprometido() {
        return comprometido;
    }

    public ArrayList<Nodo> getvecinos() {
        return vecinos;
    }

}