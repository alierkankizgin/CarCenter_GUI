public class Skoda extends Brands{
	public Skoda(){}

}
class Superb extends Skoda{
	public String calledname = "Skoda Superb ";
	public double price = 124800.0;
	public String transmission = "- Automatic - ";
	
	public String getCalledName(){
		return calledname;
	}
	public double getPrice(){
		return price;
	}
	
	public String getTransmission(){
		return transmission;
	}
	
	public Superb(){}
		public Superb(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
		}
	}
class Octavia extends Skoda{
	public String calledname = "Skoda Octavia ";
	public double price = 98700.0;
	public String transmission = "- Automatic - ";
	
	public String getCalledName(){
		return calledname;
	}
	public double getPrice(){
		return price;
	}
	
	public String getTransmission(){
		return transmission;
	}
	
	public Octavia(){}
		public Octavia(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
	}
}
class Fabia extends Skoda{
	public String calledname ="Skoda Fabia ";
	public double price = 58900.0;
	public String transmission = "- Manual - ";
	
	public String getCalledName(){
		return calledname;
	}
	public double getPrice(){
		return price;
	}
	
	public String getTransmission(){
		return transmission;
	}
	
	public Fabia(){}
		public Fabia(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
	}
}
