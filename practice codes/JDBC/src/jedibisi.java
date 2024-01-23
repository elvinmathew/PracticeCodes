import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jedibisi {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/msu";
            String username="root";
            String password="7307";
            Connection con=DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("not connected");
            }else {
                System.out.println("connected");
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception e");}
    }
}
