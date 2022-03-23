package homeWork11;

import java.sql.*;
/*
Подключиться к chinook.db
Написать PreparedStatement для добавления строки в таблицу Albums и добавить несколько строк
Пример PreparedStatement для добавления строки в таблицу Artists:
    insert into albums(Title, ArtistId) values(?, ?);
Заметьте, что идентификатор вручную передавать не нужно, он будет поставлен автоматически
С помощью Statement вывести все альбомы по одному на строчку начиная с последних
 */

public class DatabaseSample2 {

        public static void main (String[]args) throws SQLException {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:chinook.db");

            try{
                String sql = "insert into albums(Title, ArtistId) values(?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, "Radio GAGA");
                preparedStatement.setInt(2,51);
                preparedStatement.executeUpdate();
                preparedStatement.setString(1, "Radio GUGU");
                preparedStatement.setInt(2,51);

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Albums");

                while(resultSet.next())
                {
                    // read the result set
                    System.out.println("Title = " + resultSet.getString("Title"));
                    System.out.println("AlbumId = " + resultSet.getInt("AlbumId"));
                }


            }catch(SQLException e)
            {
                // if the error message is "out of memory",
                // it probably means no database file is found
                System.err.println(e.getMessage());
            }
            finally
            {
                try
                {
                    if(conn!= null)
                        conn.close();
                }
                catch(SQLException e)
                {
                    // connection close failed.
                    System.err.println(e.getMessage());
                }
            }

        }

}
