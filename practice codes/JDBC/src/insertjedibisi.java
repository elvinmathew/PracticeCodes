import com.mysql.cj.jdbc.StatementImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class insertjedibisi {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/cwd";
            String username = "root";
            String password = "7307";

            Connection con = DriverManager.getConnection(url, username, password);

            String q="insert into table_1(t_Name, t_City) values(?,?)";
            PreparedStatement pstmt= con.prepareStatement(q);
            Scanner br=new Scanner((System.in));
            System.out.println("enter name: ");
            String name=br.nextLine();
            System.out.println("enter city");
            String city=br.nextLine();

            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
