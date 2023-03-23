package EX01.Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;
 
    // Métodos para conectar e desconectar do banco de dados
    // ...
 
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
 }