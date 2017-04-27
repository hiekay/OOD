package ood.lkp;

public class KFC {
public Hamberger sell(){
	Bread bread = new Bread();
	Vegetable vegetable = new Vegetable();
	Beef beef = new Beef();
	System.out.println("KFC sell a hamberger");
	return new Hamberger(beef, vegetable, bread);
}
}
