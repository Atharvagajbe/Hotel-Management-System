package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    Connection connection;
    Statement statement;

    public connection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://<your db address>:3306/hotelMS", "username", "DB password");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
