import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List <String> prateleira = new ArrayList();
        prateleira.add("jeep");
        prateleira.add("ford ka");
        prateleira.add("fiat uno");
        prateleira.add("palio");
        prateleira.add("AMG");

        Collections.sort(prateleira);
        Collections.reverse(prateleira);
        Collections.shuffle(prateleira);

        for (String carrinho : prateleira) {
            System.out.println(carrinho);
        }
    }
}
