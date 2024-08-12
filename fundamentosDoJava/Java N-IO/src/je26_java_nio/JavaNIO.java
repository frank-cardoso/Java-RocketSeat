package je26_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\aula-java.txt");
            List<String> nomes = new ArrayList<>();
            nomes.add("JOAO");
            nomes.add("CESAR");

            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(n->conteudo.append(n + "\n"));
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
