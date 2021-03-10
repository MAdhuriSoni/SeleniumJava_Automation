//package framework.ExcelDriven;

		import java.io.IOException;

		import java.util.ArrayList;
public class testSample {

		public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		dataDriven d= new dataDriven();

		ArrayList data= d.getData("Add Profile");

		//ArrayList is generic it captures string as well as integer values

		System.out.println(data.get(0));

		System.out.println(data.get(1));

		System.out.println(data.get(2));

		System.out.println(data.get(3));

		System.out.println(data.get(4));

		
		}
	}
