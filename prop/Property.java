package prop;
import java.util.*;

public class Property {
		String location;
		String area;
		Property(String location,String area){
			this.location=location;
			this.area=area;
		}
		void displayInfo() {
			System.out.println("Property location is: "+location);
			
			System.out.println("Location area is :"+area);
		}
}

class Apartment extends Property{
	String name;
	Apartment(String location,String area,String name){
		
		super(location,area);
		this.name=name;
	}
	
	void displayInfo() {
		
		super.displayInfo();
		System.out.println("Apartment name is : "+name);
	}
}
class Villa extends Property{
	int num;
	
	Villa(String location,String area,int num){
		
		super(location,area);
		
		this.num=num;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Villa number is : "+num);
		
	}
}
class Plot extends Property{
	String sec;
	
	
	Plot(String location,String area,String sec){
		super(location,area);
		this.sec=sec;
		}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Plot sec is : "+sec);
	}
}
class Main{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);;
		System.out.println("Enter location: ");
		String location=s1.nextLine();
		
        System.out.println("Enter area: ");
        String area=s1.nextLine();
        
        System.out.println("Enter Apartment name: ");
        String name=s1.nextLine();

        System.out.println("Enter villa no :");
        int num=s1.nextInt();
        
        s1.nextLine();
        System.out.println("Enter a plot sec: ");
        String sec=s1.nextLine();
        s1.nextLine(); 
        
        
        System.out.println("     property detailsasas");
        
        Plot po=new Plot(location,area,sec);
        po.displayInfo();
         
        Apartment a= new Apartment(location,area,name);
        a.displayInfo();
        
        
       
        
        s1.close();
        
        
	}
}