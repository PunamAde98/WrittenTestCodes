
public class MainQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystem op= new OperatingSystem();
		op.osName="Apple";
		op.vendor="punam";
		op.version="1.0";
		
       Laptop lap=new Laptop();
       lap.setBrand("lenovo");
       lap.setCost(56000);
       lap.setOperatingSystem("Microsoft Windows");
       lap.setOs(op);
       
       System.out.println(lap);
      
       
	}

}
