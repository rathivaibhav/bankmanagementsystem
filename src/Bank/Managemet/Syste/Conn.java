package Bank.Managemet.Syste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    public Statement s;

    Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/databankmanagementsystem","root","Vr@312002");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}
