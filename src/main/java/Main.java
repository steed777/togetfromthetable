import java.sql.*;

public class Main {
private static final String url =
        "jdbc:mysql://localhost:3306/books?user=root&password=alberto&ssl=true";
private static final String url2 =
        "jdbc:mysql://localhost:3306/books3?user=root&password=alberto&ssl=true";
    public static void main(String[] args) throws SQLException{

    Connection connection = DriverManager.getConnection(url);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from books");
    Connection connection1 = DriverManager.getConnection(url2);

    while (resultSet.next()) {
    PreparedStatement preparedStatement = connection1.prepareStatement
            ("INSERT INTO books3(books_title, books_author) values (?, ?)");
    preparedStatement.setString(1, "books_title");
    preparedStatement.setString(2, "books_author");
    preparedStatement.execute();
}
    }
}
