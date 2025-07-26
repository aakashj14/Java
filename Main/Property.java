package main;

public class Property {
	String location;
	String area;
	
	Property(String location,String area){
		
		this.location=location;
		this.area=area;
		
	}
	void displayproperty() {
		
		System.out.println("Location:"+location);
		System.out.println("Area:"+area);
	}
}	
	
	class Apartment extends Property{
		
		String location1;
		String area1;
		
		
	Apartment(String location,String area,String location1,String area1 ){
		super(location,area);
		
		
	}
	void displayproperty() {
		super.displayproperty();{
			
			System.out.println("Location 1:"+location1);
			System.out.println("Area 1:"+area1);
			
			
		}
	}
		
		
		
	}
	
	class drive{
		
		public static void main(String[] args) {
			Apartment a1 = new Apartment("tambarm","west","vandalur","east");
			a1.displayproperty();
			
		}
	}
	
		
		



