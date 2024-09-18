import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set linguagens = new HashSet();

        linguagens.add("Go");
        linguagens.add("CSharp");
        linguagens.add("Java Script");
        linguagens.add("Java");

        System.out.println("Comprimento atual:" + linguagens.size());
        System.out.println("A linguagem Java está na posição" + linguagens.remove("go"));

        for (Object linguagem: linguagens) {
            System.out.println(linguagem);
        }
    }
}
