package NavinSimple;

public class Encapsulation {
	public static void main(String[] args) {
		employ e1= new employ();
		e1.setEmdId(3);
		e1.setEmpName("imam");
		employ e2 = new employ();
		e2.setEmdId(4);
		e2.setEmpName("cm");
		System.out.println(e1.getEmdId());
		System.out.println(e2.getEmdId());
		System.out.println(e1.getEmpName());
		System.out.println(e2.getEmpName());

		
		
	}

}
class employ {
	 private int emdId ;
	private String empName;
	public int getEmdId() {
		return emdId;
	}
	public void setEmdId(int emdId) {
		this.emdId = emdId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
