package week1.day2;

public class edgeBrowser {
	public static void main(String[] args) {
		Browser Bw = new Browser();
		String Edge =Bw.launchBrowser("Edge");
		System.out.println("Browser name is :"+Edge);
		Bw.loadUrl();
	}

}
