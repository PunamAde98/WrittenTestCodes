
public class OperatingSystem 
{
	String osName;
	String vendor;
	String version;
	
	public OperatingSystem () {}
	
   public OperatingSystem (String n, String v, String vr)
	{
	   osName=n;
	   vendor=v;
	   version=vr;
	}
   
   public String toString()
   {
	   return " \n Operating system name: " +osName+
			   "\n Vendor: "+vendor+ "\n Version: "+version;
   }

}
