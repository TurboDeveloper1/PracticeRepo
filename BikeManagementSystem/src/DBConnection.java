import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
	private static final String url = "jdbc:postgresql://localhost/postgres";
	private static final String user = "postgres";
	private static final String password = "1188";
	private static Connection con;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rst;
	private static final String createTable = "CREATE TABLE Bike(id int, milieage int, name varchar(100));";
	private static final String insertBike = "INSERT INTO Bike VALUES(?,?,?);";
	private static final String updateBike = "CREATE TABLE Bike(id int, milieage int, name varchar(100));";
	private static final String getAllBikes = "SELECT * from Bike;";
	
	private static Connection getConnection() {
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			System.out.println("Error is "+e);
		}
		return con;
	}
	
	public void createTable() {
		try {
			st = getConnection().createStatement();
			st.execute(createTable);
			System.out.println("Table created successfully");
		} catch (Exception e) {
		}
	}
	public void insertBike(Bike b) {
		try {
			pst = getConnection().prepareStatement(insertBike);
			pst.setInt(1, b.getBikeId());
			pst.setInt(2, b.getBikeMileage());
			pst.setString(3, b.getBikeName());
			pst.execute();
			System.out.println("Bike created successfully");
		} catch (Exception e) {
		}
	}
	public void updateBike(Bike b) {
		
	}
	public void deleteBike(Bike b) {
		
	}
	public void deleteBikeById(int bikeId) {
		
	}
	public List<Bike> getAllBikes(){
		List<Bike> bikes = new ArrayList<>();
		try {
			st = getConnection().createStatement();
			rst = st.executeQuery(getAllBikes);
			while(rst.next()) {
				int id = rst.getInt(1);
				int mileage = rst.getInt(2);
				String name = rst.getString(3);
				bikes.add(new Bike(id,mileage,name));
			}
			System.out.println("All Bike fetched successfully");
		} catch (Exception e) {
		}
		return bikes;
	}
	
	
	
}
