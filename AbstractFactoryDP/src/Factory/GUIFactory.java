package Factory;
// Abstract Factory

import ConcreteClass.Button;
import ConcreteClass.TextField;
import ConcreteClass.Checkbox;
public interface GUIFactory {
     Button createButton();
     TextField createTextField();
     Checkbox createCheckbox();
 
}
