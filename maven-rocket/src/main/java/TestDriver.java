import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;

public class TestDriver {
    public static void main(String[] args) {
        try {
            // Registrar o driver manualmente
            Class.forName("org.postgresql.Driver");

            // Verificar se o driver está disponível
            Driver driver = DriverManager.getDriver("jdbc:postgresql://localhost:5432/rocket_db");
            System.out.println("Driver encontrado: " + driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
