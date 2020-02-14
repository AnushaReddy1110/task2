package Epam_2.MavenDemo;

public class Choclate {
	private int price, weight;
	String name;
	Choclate(){
		price=0;
		weight=0;
	}
	Choclate(int weight, int price){
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
