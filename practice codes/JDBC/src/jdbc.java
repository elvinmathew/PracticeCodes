import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection
            String url="jdbc:mysql://localhost:3306/cwd";
            String username="root";
            String password="7307";
            Connection con=DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("connection's closed");
            }else{
                System.out.println("connection's created");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
