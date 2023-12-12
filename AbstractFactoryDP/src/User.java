

import Factory.LightThemeFactory;
import Factory.DarkThemeFactory;

public class User {

	public static void main(String[] args) {
	 
        Application application1=new Application(new LightThemeFactory());
        application1.createUI();
        
        Application application2=new Application(new DarkThemeFactory());
        application2.createUI();
	}

}
