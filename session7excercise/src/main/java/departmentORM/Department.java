package departmentORM;

public class Department {
	private String departname;

	public String getDepartname() {
		return departname;
	}

	public void setDepartname(String departname) {
		this.departname = departname;
	}

	@Override
	public String toString() {
		return "Department [departname=" + departname + "]";
	}
	

}
