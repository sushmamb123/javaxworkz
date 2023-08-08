package unique.com.acer.book;

import Inheritance.Keypad;
import Inheritance.Mobile;
import Inheritance.SmartPhone;
import Inheritance.Touch;

public class MainKeypad {

	public static void main(String[] args) {
		System.out.println("invoking main in MainKeypad");
		Keypad keypad=new Keypad();
		Keypad keypad1=new Mobile();
		Keypad keypad2=new Touch();
		Keypad keypad3=new SmartPhone();
		keypad.keypadInfo();
		System.out.println(keypad.name);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Mobile mobile=new Mobile();
		Mobile mobile1=new Touch();
		Mobile mobile2=new SmartPhone();
		mobile.mobileInfo();
		System.out.println(mobile.app);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Touch touch=new Touch();
		Touch touch1=new SmartPhone();
		touch.touchInfo();
		System.out.println(touch.screen);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		SmartPhone smartPhone=new SmartPhone();
		smartPhone.smartPhoneInfo();
		System.out.println(smartPhone.cost);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");







	}

}
