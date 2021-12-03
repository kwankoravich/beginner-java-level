package Lab_4;

public abstract class AbstractProductFrontPage {
	//abstract class
	public abstract String getTitle();
	public abstract String homePage();
	public abstract String nextPage();
	public abstract String contactUs();
	
	//final keyword
	
	final String productQuality = "Excellent";
	
	//Enum
	
	enum productStatus{
		DRAFT,
		QUALITY,
		NAME,
		LOGISTC
	}
}
