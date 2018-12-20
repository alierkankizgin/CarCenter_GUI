
class Volkswagen extends Brands implements Colour{
	public Volkswagen(){}
		
	}

class Polo extends Volkswagen{
	public String calledname = "VW Polo ";
	public double price = 62500.0;
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
	
	public String getRenk(){
		
		return "White";
		
	}
	
	public Polo(){}
		public Polo(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
			
		}
	}
class Scirocco extends Volkswagen{
	public String calledname = "VW Scirocco ";
	public double price = 97750.0;
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
	
	public Scirocco(){}
		public Scirocco(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
	}
}
class Passat extends Volkswagen{
	public String calledname = "VW Passat ";
	public double price = 142600.0;
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
	
	public Passat(){}
		public Passat(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
	}
}
