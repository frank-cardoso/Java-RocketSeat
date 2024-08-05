package je11_controle_fluxo_excecao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {

            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            if(nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome não pode ser vazio");
            }

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            if(sobrenome == null || sobrenome.trim().isEmpty()) {
                throw new IllegalArgumentException("Sobrenome não pode ser vazio");
            }

            System.out.println("Digite sua idade: ");
            int idade;
            try {
                idade = scanner.nextInt();
                if(idade < 0 || idade > 150) {
                    throw new IllegalArgumentException("A idade deve estar entre 0 e 150");
                }
            } catch(InputMismatchException ex) {
                throw new IllegalArgumentException("Idade deve ser um número inteiro");
            }

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
            if(altura < 0) {
                throw new IllegalArgumentException("A altura deve ser maior que zero");
            }

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }catch(InputMismatchException ex) {
            System.err.println("Entrada inválida. Por favor, insira os dados no padrão Americano: 0.00");
        }catch(IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }
        catch(Exception ex) {
            System.err.println("Erro inesperado: " + ex.getMessage());
        }
    }
}
