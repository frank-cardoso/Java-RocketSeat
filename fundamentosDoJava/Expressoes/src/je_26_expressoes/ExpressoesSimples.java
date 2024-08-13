package je_26_expressoes;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Frank";
        Integer matricula = 123;
        Double salario = 2244.83;

        String dadosFuncionario = String.format("Mat.: %d - Nome : %s - Sal.: %,.2f", matricula, nome, salario);
        System.out.println(dadosFuncionario);
    }
}
