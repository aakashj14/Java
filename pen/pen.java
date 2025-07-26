package pen;

public class pen {
     String brand;
     String colour;
     int price;
     
     pen(String brand,String colour ,int price){
    	 this.brand=brand;
    	 this.colour=colour;
    	 this.price=price;
     }
     
void display() {
	System.out.println("A pen colour is  "+ colour+"  in "+brand+" brand and the price is "+price);
}
public static void main(String[] args) {
	pen p1=new pen("camal","blue",45);
	p1.display();
}
}