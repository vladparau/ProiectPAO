package File;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadFile {
    private static ReadFile single_instance = null;
    private static final String url = "jdbc:mysql://localhost:3306/proiect";
    public static ReadFile getInstance() {
        if(single_instance == null)
            single_instance = new ReadFile();
        return single_instance;
    }

    public void audit(String action) {

        try (Connection connection = DriverManager.getConnection(url, "root", "");
             Statement statement = connection.createStatement()){

            Date date= new Date(System.currentTimeMillis());
            String query = "INSERT INTO proiect.audit values('" + action + "','" + date +"');" ;
            statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String []> readFromFile(String path){

        try (Connection connection = DriverManager.getConnection(url, "root", "");
             Statement statement = connection.createStatement()) {

            List<String[]> text = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery("Select * from proiect." + path);

            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while (resultSet.next()) {
                String[] temp = new String[columnsNumber];

                for (int i = 1; i <= columnsNumber; i++) {
                    String data = resultSet.getString(i);
                    temp[i - 1] = data;
                }

                text.add(temp);
            }

            return text;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}

