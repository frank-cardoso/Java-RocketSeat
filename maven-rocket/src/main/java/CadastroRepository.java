import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CadastroRepository {
    private Connection conexao;

    public CadastroRepository() {
        conexao = FabricaConexao.getConexao();
    }
    public void incluir(Cadastro cadastro){
        try {
            String intrucaoSQL = "INSERT INTO public.tab_cadastro (nome, idade) VALUES(?,?)";
            PreparedStatement pst = conexao.prepareStatement(intrucaoSQL);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
            pst.execute();
            System.out.println("Cadastro inserido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void alterar(Cadastro cadastro){
        try {
            String intrucaoSQL = "UPDATE public.tab_cadastro SET nome=?, idade=? WHERE id=?";
            PreparedStatement pst = conexao.prepareStatement(intrucaoSQL);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
            pst.setInt(3, cadastro.getID());
            pst.execute();
            System.out.println("Cadastro alterado com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void excluir(Integer id){
        try {
            String intrucaoSQL = "DELETE FROM public.tab_cadastro WHERE id=?";

            PreparedStatement pst = conexao.prepareStatement(intrucaoSQL);
            pst.setInt(1, id);
            pst.execute();
            System.out.println("Cadastro excluido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public List<Cadastro> listar(){
        List<Cadastro> lista = new ArrayList<>();
        try {
            String intrucaoSQL = "SELECT id, nome, idade FROM public.tab_cadastro";
            PreparedStatement statement = conexao.prepareStatement(intrucaoSQL);
            //statement.setInt(1, 1);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Integer id = result.getInt("id");
                String nome = result.getString("nome");
                Integer idade = result.getInt("idade");

                Cadastro cadastro = new Cadastro();
                cadastro.setId(id);
                cadastro.setNome(nome);
                cadastro.setIdade(idade);

                lista.add(cadastro);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    public Cadastro buscar(Integer id){
        Cadastro cadastro = null;
        try {
            String intrucaoSQL = "SELECT id, nome, idade FROM public.tab_cadastro WHERE id = ?";
            PreparedStatement statement = conexao.prepareStatement(intrucaoSQL);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String nome = result.getString("nome");
                Integer idade = result.getInt("idade");

                cadastro = new Cadastro();
                cadastro.setId(id);
                cadastro.setNome(nome);
                cadastro.setIdade(idade);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cadastro;
    }
}
