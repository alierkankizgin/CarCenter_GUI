
class Seat extends Brands {
	public Seat(){
		
	}

}
class Leon extends Seat{
	public String calledname = "Seat Leon ";
	public double price = 75800.0;
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
	
	public Leon(){}
		public Leon(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
		}
	}
class Ateca extends Seat{
	public String calledname = "Seat Ateca (4Motion) ";
	public double price = 89500.0;
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
	
	public Ateca(){}
		public Ateca(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
	}
}
class Ibiza extends Seat{
	public String calledname = "Seat Ibiza ";
	public double price = 49500.0;
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
	
	public Ibiza(){}
		public Ibiza(String calledname, double price, String transmission){
			this.calledname = calledname;
			this.price = price;
			this.transmission = transmission;
	}
}
