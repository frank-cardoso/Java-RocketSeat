package je12_poo.enums;

public class EnumApp {
    public static void main(String[] args) {
        EstadoBrasileiro estadoLocalizacao = EstadoBrasileiro.valueOf("RIO_JANEIRO");

        System.out.println(estadoLocalizacao.getNome());
        System.out.println(estadoLocalizacao.getSigla());
        System.out.println(estadoLocalizacao.getNomeMaiusculo());
    }
}

/*
SITUAÇÃO DE ERRO
Java é sensível quanto aos aspectos literais de maiusculo e minusculo,
veja o cenário abaixo
 */

//public class EnumApp {
//    public static void main(String[] args) {
//        //erro
//        EstadoBrasileiro estadoLocalizacao = EstadoBrasileiro.valueOf("Rio_Janeiro");
//        //erro
//        EstadoBrasileiro estadoLocalizacao = EstadoBrasileiro.valueOf("rio_janeiro");
//        //OK
//        EstadoBrasileiro estadoLocalizacao = EstadoBrasileiro.valueOf("RIO_JANEIRO");
//
//        System.out.println(estadoLocalizacao.getNome());
//        System.out.println(estadoLocalizacao.getSigla());
//        System.out.println(estadoLocalizacao.getNomeMaiusculo());
//    }
//}

