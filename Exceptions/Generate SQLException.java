import java.sql.*;

class SQLExceptionExample {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/invalid_db", "user", "pass");
    }
}
