import Factory.GUIFactory;

// Client or Application
import ConcreteClass.Button;
import ConcreteClass.TextField;
import ConcreteClass.Checkbox;
public class Application {
       private GUIFactory GuiFactory;
       
       public Application(GUIFactory GuiFactory){
    	    this.GuiFactory=GuiFactory;
       }
       public void createUI() {
    	   Button button=GuiFactory.createButton();
    	   Checkbox checkbox=GuiFactory.createCheckbox();
    	   TextField textField=GuiFactory.createTextField();
    	   
    	   button.render();
    	   checkbox.render();
    	   textField.render();
       }
}
