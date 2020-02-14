package Epam_2.MavenDemo;

public class Sweet {
	private int weight,price;
	
	Sweet(){
		weight=0;
		price=0;
	}
	Sweet(int weight,int price){
		this.weight=weight;
		this.price=price;
	}
	int getPrice() {
		return price;
	}
	int getWeight() {
		return weight;
	}
}
