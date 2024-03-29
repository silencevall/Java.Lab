package RequestPackage;
import java.sql.*;

public class executeRequest {
    public static void executeRequest(int month) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=Lab5;encrypt=false;trustServerCertificate=true", "sa", "123");
            statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM [Table] WHERE MONTH(Birthday) = " + month;
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String surname = resultSet.getString("SurName");
                String lastName = resultSet.getString("LastName");
                Date birthday = resultSet.getDate("Birthday");
                String gradebook = resultSet.getString("Number");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Surname: " + surname);
                System.out.println("Patronymic: " + lastName);
                System.out.println("Birthday: " + birthday);
                System.out.println("Gradebook: " + gradebook);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}


