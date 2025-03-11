import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    // datos de accesos al motor de bases de DATOS(MariaDB,MySQL)
    private static final String USUARIO = "root";
    private static final String PASSWORD = "password";

    // definiendo la cadena de conexion al SERVIDOR DE BASES DE DATOS.
    // jdbc es el driver de windows que permite una conexion CON EL SGBD
    // mysql es el tipo de conector que utilizamos.
    // localhost es el servidor donde se encuentra la base de datos
    // 3306 puerto donde escucha el servicio mysql
    // ejemplo nombre de la base de datos.
    private static final String URL = "jdbc:mysql://localhost:3306/ejemplo";

    public static void main(String[] args) throws Exception {
        try {

            Connection conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            if (conexion != null) {
                System.out.println("Conexion realizada con éxito");
                conexion.close();
            } else {
                System.out.println("No se ha podido conectar.");
            }


        } catch (SQLException sqle) {
            System.out.println("Se ha producido un error con la base de datos." + sqle.getMessage());

        }

    }
}
