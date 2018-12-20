

import java.util.ArrayList;
public class Sale {
	ArrayList<Brands> list = new ArrayList<Brands>();
	
	public void enterItem(Brands item){
		list.add(item);
	}
	public void clearCashRegister(){
		list.clear();
	}
	public int numberOfItems(){
		return list.size();
	}

	
	public String toString(){
		String receipt = "";
		for(int i=0;i<list.size();i++){
			if(list.get(i) instanceof Polo){
				receipt += "\n" + ((Polo)list.get(i)).getCalledName() + ((Polo)list.get(i)).getTransmission() + ((Polo)list.get(i)).getPrice()+" TL";
			}
			else if(list.get(i) instanceof Scirocco){
				receipt += "\n" + ((Scirocco)list.get(i)).getCalledName() + ((Scirocco)list.get(i)).getTransmission() +  ((Scirocco)list.get(i)).getPrice()+" TL";
			}		
			else if(list.get(i) instanceof Passat){
				receipt += "\n" + ((Passat)list.get(i)).getCalledName() + ((Passat)list.get(i)).getTransmission() +  ((Passat)list.get(i)).getPrice()+" TL";
				
			}
			else if(list.get(i) instanceof Leon){
				receipt  += "\n" + ((Leon)list.get(i)).getCalledName() + ((Leon)list.get(i)).getTransmission() +  ((Leon)list.get(i)).getPrice()+" TL";
			}
			else if(list.get(i) instanceof Ateca){
				receipt += "\n" + ((Ateca)list.get(i)).getCalledName() + ((Ateca)list.get(i)).getTransmission() +  ((Ateca)list.get(i)).getPrice()+" TL";
			}
			else if(list.get(i) instanceof Ibiza){
				receipt += "\n" + ((Ibiza)list.get(i)).getCalledName() + ((Ibiza)list.get(i)).getTransmission() +  ((Ibiza)list.get(i)).getPrice()+" TL";
			}
			else if(list.get(i) instanceof Superb){
				receipt += "\n" + ((Superb)list.get(i)).getCalledName() + ((Superb)list.get(i)).getTransmission() +  ((Superb)list.get(i)).getPrice()+" TL";
			}
			else if(list.get(i) instanceof Octavia){
				receipt += "\n" +((Octavia)list.get(i)).getCalledName() + ((Octavia)list.get(i)).getTransmission() +  ((Octavia)list.get(i)).getPrice()+" TL";
			}
			else if(list.get(i) instanceof Fabia){
				receipt += "\n"+ ((Fabia)list.get(i)).getCalledName() + ((Fabia)list.get(i)).getTransmission() +  ((Fabia)list.get(i)).getPrice()+" TL";
				
			}else continue;
			
	}return receipt;
	
		
		}

}
		
		
	


