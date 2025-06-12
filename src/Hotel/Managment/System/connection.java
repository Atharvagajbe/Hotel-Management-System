package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    Connection connection;
    Statement statement;

    public connection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://hotelms.cbmsgiue46ql.eu-north-1.rds.amazonaws.com:3306/hotelMS", "falsifier", "Lamborghini7744");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}