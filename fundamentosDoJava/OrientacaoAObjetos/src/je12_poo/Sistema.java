package je12_poo;

import java.io.PrintStream;
import java.io.PrintWriter;

public class Sistema {

    public static void main(String[] args) {
        Cliente robertoCarlos = new Cliente("Roberto Carlos");

        System.out.println(robertoCarlos.limiteDeCredito);
        robertoCarlos.solicitarLimiteCredito(200.0);
        System.out.println(robertoCarlos.limiteDeCredito);
        robertoCarlos.comprar(50.0);

        Cliente izabelly = new Cliente("Izabelly Santos");

        System.out.println(izabelly.limiteDeCredito);
        izabelly.solicitarLimiteCredito(80.0);
        izabelly.comprar(22.0);

        System.out.println("Limite do(a) " + robertoCarlos.nome + " é " + robertoCarlos.limiteDeCredito);
        System.out.println("Limite do(a) " + izabelly.nome + " é " + izabelly.limiteDeCredito);
    }
}
