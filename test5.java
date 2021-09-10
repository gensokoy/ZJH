package execl;
import java.sql.*;
import java.util.Collection;
public class test5 {
	public static void main(String args[])
	{
		String driver="com.mysql.jdbc.Driver";
		String user="root";
		String password="数据库密码";
		String url="jdbc:mysql://localhost:3306/typesql";
		try{
			//加载数据库驱动
			Class.forName(driver);
			//连接数据库
			Connection conn=DriverManager.getConnection(url,user,password);
			System.out.println("连接成功!");
			//创建Statement对象
			Statement stmt=conn.createStatement();
			//建立结果集
			ResultSet rs=stmt.executeQuery("SELECT id,username FROM userdetails");
			System.out.println("查询成功!");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString("username"));
			}
			//关闭结果集
			rs.close();
			//关闭Statement对象
			stmt.close();
			//关闭数据库
			conn.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
