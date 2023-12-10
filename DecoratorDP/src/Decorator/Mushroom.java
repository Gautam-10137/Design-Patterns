package Decorator;
import baseObj.BasePizza;
public class Mushroom  extends ToppingDecorator{
  
	BasePizza basePizza;
	public Mushroom(BasePizza pizza) {
		this.basePizza=pizza;
	}
	public int cost() {
		return this.basePizza.cost() +5;
	}
}
