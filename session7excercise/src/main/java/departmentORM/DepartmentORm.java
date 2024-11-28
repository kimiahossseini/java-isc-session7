package departmentORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DepartmentORm {
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/testdb";
    private static final String USER = "sa"; 
    private static final String PASSWORD = "";
    
	public static void main(String[] args) throws fileexception {
		List<Department> listdepartment=new ArrayList<>();
		String countryid="US";
		String sql="""
			SELECT d.DEPARTMENT_NAME,l.COUNTRY_ID 
				FROM DEPARTMENTS d
				JOIN LOCATIONS l
				ON d.LOCATION_ID = l.LOCATION_ID
				WHERE l.COUNTRY_ID =? 
				""";
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedstatement = connection.prepareStatement(sql)) 
		{	System.out.println("Connected to the H2 database successfully!");
			preparedstatement.setString(1, countryid);
			try (ResultSet resultset = preparedstatement.executeQuery()) 
			{
				while (resultset.next()) {
					Department department=new Department();
					department.setDepartname(resultset.getNString("DEPARTMENT_NAME"));
					listdepartment.add(department);
				}
				listdepartment.forEach(t -> System.out.println(t));
			}

		} catch (SQLException e) {
			throw new fileexception("connection to h2 is faild", e);
			
		}
		
		
	}

	}


