package Factory;

// Concrete Factory

import ConcreteClass.Button;
import ConcreteClass.TextField;
import ConcreteClass.Checkbox;
import ConcreteClass.LightButton;
import ConcreteClass.LightTextField;
import ConcreteClass.LightCheckbox;

public class LightThemeFactory implements GUIFactory {

	public Button createButton() {
	   return new LightButton();
	}
	public Checkbox createCheckbox() {
		return new LightCheckbox();
	}
	public TextField createTextField() {
		return new LightTextField();
	}
}
