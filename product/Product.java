package product;

public class Product {
	String name;
	double price;
	String category;
	
	Product(String name,double price,String category){
		this.name=name;
		this.price=price;
		this.category=category;
	}
	void getProduct(String category) {
		if(category.equalsIgnoreCase("electronics")) {
			 double gstelec= price*18/100;
			 price=price+gstelec;
			
		    System.out.println("electronics price include gst:"+price);	
		}
		
		else if(category.equalsIgnoreCase("groceries")) {
			double gstgro=price*5/100;
			
			price=price+gstgro;
			System.out.println("groceries price include gst:"+price);
		}
		else if(category.equalsIgnoreCase("clothes")) {
			double gstclo=price*12/100;
			
			price=price+gstclo;
			System.out.println("clothes price include gst:"+price);
		}
		
		else {
			
			System.out.println("invalid category");
		}
	}
	public static void main(String[] args) {
		Product p1=new Product("battery",1200.00,"");
				
				p1.getProduct("electronics");
	}
}

