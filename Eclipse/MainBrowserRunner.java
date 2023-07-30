package unique.com.acer;

public class MainBrowserRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MainBrowserRunner");
		Browser browser=new Browser();
		browser.network();
		browser.issues();
		}

}
