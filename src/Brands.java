
public abstract class Brands implements Colour {
	public String CenterName = "Aek Car Center";
	public double TaxRate = 1.08;
	public double ServiceFee = 2500.0;

	public Brands(){
		
	}
	
	public String getRenk(){
		
		return "White";
		
	}
	
	public String getCenterName(){
		return CenterName;
	}
	public void setCenterName(String newCenterName){
		this.CenterName = newCenterName;
	}
	public double getTaxRate(){
		return TaxRate;
	}
	public void setTaxRate(double newTaxRate){
		this.TaxRate = newTaxRate;
	}
	public double getServiceFee(){
		return ServiceFee;
	}
	public void setServiceFee(double newServiceFee){
		this.ServiceFee = newServiceFee;
	}

}
