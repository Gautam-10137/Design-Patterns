import baseObj.BasePizza;
import baseObj.Farmhouse;
import baseObj.Margherita;
import baseObj.VegDelight;
import Decorator.ToppingDecorator;
import Decorator.ExtraCheese;
import Decorator.Mushroom;

public class PizzaShop {

	public static void main(String[] args) {
		BasePizza pizza1=new VegDelight();
		System.out.println("Ist order (VegDelight Pizza) Total Bill="+pizza1.cost());
		
		BasePizza pizza2=new ExtraCheese(pizza1);
		System.out.println("2nd order (VegDelight Pizza + ExtraCheese) Total Bill="+pizza2.cost());
		
		BasePizza pizza3=new Mushroom(new ExtraCheese(new VegDelight()));
		System.out.println("3rd order (VegDelight Pizza + ExtraCheese + Mushroom) Total Bill="+pizza3.cost());

	}

}
