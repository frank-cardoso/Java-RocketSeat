package je10_controle_fluxo_repeticao;

import java.util.Random;

public class ExemploFor {
    public static void main(String[] args) {
        boolean dormiu = false;
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos ++){
            System.out.println(carneirinhos + " - Carneirinho(s)");
            if(dormiu = new Random().nextInt(20) == carneirinhos){
                System.out.println("Dormiu... ");
                break;
            }
        }
    }
}
