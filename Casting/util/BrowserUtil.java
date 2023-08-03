package com.example.casting.util;

import com.example.casting.ex2.Browser;
import com.example.casting.ex2.Chrome;
import com.example.casting.ex2.Edge;
import com.example.casting.ex2.FireFox;
import com.example.casting.ex2.OperaBrowser;

public class BrowserUtil extends Browser{
	public void run(Browser browser)
	{
		Browser browser2 = new Browser();
		browser.web();

		if(browser instanceof Chrome)
		{
			Browser chrome = new Chrome();
			chrome.web();

			Chrome chrome2=(Chrome)chrome;//Converting (parent class)Browser of browser type to (sub class)Chrome
			chrome2.develop();
		}

		if(browser instanceof FireFox)
		{
			Browser fireFox=new FireFox();
			fireFox.web();

			FireFox fireFox2=(FireFox)fireFox;
			fireFox2.use();
		}

		if(browser instanceof OperaBrowser)
		{
			Browser opera=new Browser();
			opera.web();

			OperaBrowser opera2=new OperaBrowser();
			opera2.platform();
		}

		if(browser instanceof Edge)
		{
			Browser edge=new Browser();
			edge.web();

			Edge edge2=new Edge();
			edge2.screening();
		}
	}

}



