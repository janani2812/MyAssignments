package week1.day2;

public class Browser {
	
 public String launchBrowser(String browserName) {
	System.out.println("Browser launched sucessfully");
	return browserName;
 }
 void loadUrl() {
		System.out.println("Appliaction url loaded successfully");
 }
public static void main(String[] args) {
	Browser Bw = new Browser();
	String name =Bw.launchBrowser("Chrome");
	System.out.println("Browser name is :"+name);
	Bw.loadUrl();
}
}
