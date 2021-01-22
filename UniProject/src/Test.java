import java.sql.*;

/**
 * This program demonstrates making JDBC connection to a SQLite database.
 *
 * @author www.codejava.net
 */
public class Test
{

    public static void main(String[] args)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:D:\\Programs\\sqlite\\product.db";
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null)
            {
                String query = "select * from Customers;";
                try (Statement stmt = conn.createStatement())
                {
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next())
                    {
                        int id = rs.getInt("id");
                        String firstName = rs.getString("firstName");
                        String secondName = rs.getString("secondName");

                        System.out.println(id + ", " + firstName + " " + secondName);
                    }
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }

            }
            conn.close();
        } catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

    }
}