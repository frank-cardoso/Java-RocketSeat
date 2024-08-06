package je12_poo;

public class Cliente {
    String nome;
    Double limiteDeCredito = 10.0;

    public void solicitarLimiteCredito(Double valorSolicitado) {
        limiteDeCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto) {
        limiteDeCredito = limiteDeCredito - valorProduto;
    }

    public Cliente(String nomeInformado) {
        nome = nomeInformado;
    }
}
