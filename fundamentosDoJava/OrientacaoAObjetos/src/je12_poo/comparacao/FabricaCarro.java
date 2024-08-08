package je12_poo.comparacao;

public class FabricaCarro {
    public static void main (String [] args){
        Carro carro1 = new Carro("branca","fiat","palio");
        Carro carro2 = new Carro("branca","fiat","palio");
        Carro carro3 = new Carro("branca","fiat","palio");
        Carro carro4 = new Carro("branca","fiat","palio");
        Carro carro5 = new Carro("branca","fiat","palio");

        //case01
        System.out.println(carro1 == carro2); //false
        //case02
        System.out.println(carro1.equals(carro2)); //false
    }


}
