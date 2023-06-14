import java.sql.*;

public class DataModels {
    String insert = "INSERT INTO student_id(NAME,ID,DEPT,MOBILE,BLOODGROUP,ISSUEDON,EXPIRESON,ERRORDETAILS) VALUES(?,?,?,?,?,?,?,?)";
    Connection connection;
    DataModels(){
        String create = "CREATE TABLE student_Id(NAME TEXT, ID TEXT, DEPT TEXT, MOBILE TEXT, BLOODGROUP TEXT, ISSUEDON TEXT,EXPIRESON TEXT, ERRORDETAILS TEXT)";
        String url = "JDBC:sqlite:src/studentID.db";
        try{
            connection = DriverManager.getConnection(url);
            if(connection==null){
                System.out.println("wow failed!");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public void addData(String name,String ID,String dept,String mobile,String BloodGroup,String issuedOn,String ExpiresOn,String errorDetails){
       try {
           PreparedStatement pstm = connection.prepareStatement(insert);
           pstm.setString(1,name);
           pstm.setString(2,ID);
           pstm.setString(3,dept);
           pstm.setString(4,mobile);
           pstm.setString(5,BloodGroup);
           pstm.setString(6,issuedOn);
           pstm.setString(7,ExpiresOn);
           pstm.setString(8,errorDetails);
           pstm.executeUpdate();
//           String sql = "SELECT * FROM student_id";
//           Statement statement = connection.createStatement();
//
//           ResultSet resultSet = statement.executeQuery(sql);
//
//           while (resultSet.next()){
//               System.out.println( resultSet.getString("NAME") );
//               System.out.println(resultSet.getString("ID"));
//           }


       }catch (SQLException e){
           System.out.println(e);
       }
    }

}
