
public class Laptop 
{
	private String brand;
	private int cost;
	private String operatingSystem;
	private OperatingSystem os;
	
	public Laptop() {}
	
	public Laptop(String b, int c, String os)
	{
		setBrand(b);
	    setCost(c);
	    setOperatingSystem(os);
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}
	
	public String toString()
	{
		return "Laptop brand: " +brand+ "\n Laptop cost: " +cost+
				"\n Laptop Operating System: "+operatingSystem+
				"\n Operating System: " +os;
	}

}
