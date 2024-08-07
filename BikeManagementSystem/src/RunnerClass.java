
public class RunnerClass {

	public static void main(String[] args) {
		DBConnection db = new DBConnection();
//		db.createTable();
		db.insertBike(new Bike(1,20,"BMW"));
		System.out.println(db.getAllBikes());
	}

}
