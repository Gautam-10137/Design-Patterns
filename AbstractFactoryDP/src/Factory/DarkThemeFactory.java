package Factory;
//Concrete Factory

import ConcreteClass.Button;
import ConcreteClass.TextField;
import ConcreteClass.Checkbox;
import ConcreteClass.DarkButton;
import ConcreteClass.DarkTextField;
import ConcreteClass.DarkCheckbox;
public class DarkThemeFactory implements GUIFactory{

	public Button createButton() {
		return new DarkButton();
	}
	public TextField createTextField() {
		return new DarkTextField();
	}
	public Checkbox createCheckbox() {
		return new DarkCheckbox();
	}
}
