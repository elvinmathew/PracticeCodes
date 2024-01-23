import java.io.FileInputStream;
import java.sql.*;
public class insertimg {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/images","root","7307");
            String q="insert into images(pic) values(?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            FileInputStream fis=new FileInputStream("D:\\15.png");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done");
        }catch(Exception e){

        }
}
}
