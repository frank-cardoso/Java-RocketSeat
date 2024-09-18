import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        Map <String, String> estados = new TreeMap<>();
        estados.put("PI", "Piaui");
        estados.put("MA", "Maranhao");
        estados.put("CE", "Ceara");
        System.out.println("O estado que está na chave " + estados.get("PI"));
        System.out.println(estados.size());

        Iterator keys = estados.keySet().iterator();

        while(keys.hasNext()) {
            String chave = keys.next().toString();
            String valor = estados.get(chave);

            System.out.println("O estado é " + valor);
        }
 }
}
