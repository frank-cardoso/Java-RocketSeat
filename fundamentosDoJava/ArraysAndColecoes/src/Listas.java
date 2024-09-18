import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List linguagens = new ArrayList();

        linguagens.add("CSharp");
        linguagens.add("Java");
        linguagens.add("Java Script");
        linguagens.add("Go");

        System.out.println("Comprimento atual:" + linguagens.size());
        System.out.println("A linguagem Java está na posição" + linguagens.remove("go"));
    }
}
