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
        this.vecinos = new ArrayList<>();
    }

        
    void conectar(Nodo otro) {
        if(!vecinos.contains(otro))
            vecinos.add(otro);
    }
    
@Override
public String toString() {
    String Vuln;
    if (vulnerable) Vuln = "VULN";
    else Vuln = "NO_VULN";

    String FW;
    if (firewall) FW = "FW";
    else FW = "NO_FW";

    String Pwn;
    if (comprometido) Pwn = "PWN";
    else Pwn = "OK";

    return nombre + " (" + ip + ") [" + Vuln + "] [" + FW + "] [" + Pwn + "]";
}
}

