import java.sql.*;

public class Main {
private static final String url =
        "jdbc:mysql://localhost:3306/books?user=root&password=alberto&ssl=true";
private static final String url2 =
        "jdbc:mysql://localhost:3306/books3?user=root&password=alberto&ssl=true";
    public static void main(String[] args) {
try {
    Connection connection = DriverManager.getConnection(url);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from books");

Connection connection1 = DriverManager.getConnection(url2);
while (resultSet.next()) {
    PreparedStatement preparedStatement = connection1.prepareStatement
            ("insert into books3(books_title, books_author) values (? , ?)");
}
}catch (SQLException e){

}
    }
}
