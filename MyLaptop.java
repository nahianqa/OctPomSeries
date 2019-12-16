package javalession;

public class MyLaptop {

	String brand;
	String model;
	int price;
	 static int warranty;
	 

	public static void main(String [] args){
	MyLaptop laptop = new MyLaptop();
	laptop.brand= "HP";
	laptop.model = "G17";
	laptop.price = 350;
	warranty=3;
laptop.checkWarranty(warranty);

	}
	public void checkWarranty(int warranty){
	if(warranty<2){
	System.out.println(" please extend your warranty");
	}
	else if (warranty>2){
		System.out.println(" You dont need to extend warranty ");
		}
	}
	}
	
