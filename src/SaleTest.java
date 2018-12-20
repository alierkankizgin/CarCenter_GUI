import java.util.Scanner;
import java.util.ArrayList;
import org.omg.Messaging.SyncScopeHelper;

public class SaleTest {
	public static void main(String[] args){
		//Brands c = new Brands();
		//c.CenterName ="AEK Car Center";
		
	    Sale p = new Sale();
	    Scanner markasecim = new Scanner(System.in);
	    
	    	System.out.println("Welcome to AEK Car Center. Please select the car brand.");
		    System.out.println("'1' for Volkswagen, '2' for Seat, '3' for Skoda.");
		    
		  int marka = markasecim.nextInt();
		  int secilenmodelno = 0; //1-Polo, 2-Scirocco, 3-.....
		    
		    switch (marka) {
	        case 1 :
	        	Polo a1 = new Polo();
	    	    Scirocco a2 = new Scirocco();
	    	    Passat a3= new Passat();
	    	    
	    	    p.enterItem(a1);
	    	    p.enterItem(a2);
	    	    p.enterItem(a3);
	    	    
	           // System.out.println("Volkswagen");
	            System.out.println("We have 3 models of Volkswagen:");
	            System.out.println(p.toString());
	            System.out.println(" ");
	            System.out.println("Please select car model.");
	            System.out.println("'1' for Polo, '2' for Scirocco, '3' for Passat.");
	            
	            Scanner modelsecim1 = new Scanner(System.in);
	            int model1 = modelsecim1.nextInt();
	            
	            switch (model1) {
	            case 1 :
	            	System.out.println("Polo is an excellent choice.");
	            	secilenmodelno=1;
	            	break;
	            	
	            case 2:
	            	System.out.println("Scirocco is an excellent choice.");
	            	secilenmodelno=2;
	            	break;
	            	
	            case 3:
	            	System.out.println("Passat is an excellent choice.");
	            	secilenmodelno=3;
	            	break;
	            	
	            default :
		            System.out.println("Wrong Choice. Please select 1,2 or 3.");
		            System.out.println("Would you like to do it again <y/n>");
		            //BURAYA TEKRAR KODU EKLENECEK
		            break;
	            }
	            break;

	        case 2 :
	        	Leon b1 = new Leon();
	    	    Ateca b2 = new Ateca ();
	    	    Ibiza b3 = new Ibiza();
	    	   
	    	    p.enterItem(b1);
	    	    p.enterItem(b2);
	    	    p.enterItem(b3);
	    	    
	           // System.out.println("Seat");
	            System.out.println("We have 3 models of Seat:");
	            System.out.println(p.toString());
	            System.out.println(" ");
	            System.out.println("Please select car model.");
	            System.out.println("'1' for Leon, '2' for Ateca, '3' for Ibiza.");
	            
	            Scanner modelsecim2 = new Scanner(System.in);
	            int model2 = modelsecim2.nextInt();
	            
	            switch (model2) {
	            case 1 :
	            	System.out.println("Leon is an excellent choice.");
	            	secilenmodelno=4;
	            	break;
	            	
	            case 2:
	            	System.out.println("Ateca is an excellent choice.");
	            	secilenmodelno=5;
	            	break;
	            	
	            case 3:
	            	System.out.println("Ibiza is an excellent choice.");
	            	secilenmodelno=6;
	            	break;
	            	
	            default :
		            System.out.println("Wrong Choice. Please select 1,2 or 3.");
		            System.out.println("Would you like to do it again <y/n>");
		            //BURAYA TEKRAR KODU EKLENECEK
		            break;
	            }
	            break;

	        case 3 :
	        	Superb c1 = new Superb();
	      	    Octavia c2 = new Octavia();
	      	    Fabia c3 = new Fabia();
	      	    
	      	    p.enterItem(c1);
	      	    p.enterItem(c2);
	      	    p.enterItem(c3);
	      	    
	          //  System.out.println("Skoda");
	            System.out.println("We have 3 models of Skoda:");
	            System.out.println(p.toString());
	            System.out.println(" ");
	            System.out.println("Please select car model.");
	            System.out.println("'1' for Superb, '2' for Octavia, '3' for Fabia.");
	            
	            Scanner modelsecim3 = new Scanner(System.in);
	            int model3 = modelsecim3.nextInt();
	            
	            switch (model3) {
	            case 1 :
	            	System.out.println("Superb is an excellent choice.");
	            	secilenmodelno=7;
	            	break;
	            	
	            case 2:
	            	System.out.println("Octavia is an excellent choice.");
	            	secilenmodelno=8;
	            	break;
	            	
	            case 3:
	            	System.out.println("Fabia is an excellent choice.");
	            	secilenmodelno=9;
	            	break;
	            	
	            default :
		            System.out.println("Wrong Choice. Please select 1,2 or 3.");
		            System.out.println("Would you like to do it again <y/n>");
		            //BURAYA TEKRAR KODU EKLENECEK
		            break;
	            }
	            break;

	        default :
	            System.out.println("Wrong Choice. Please select 1,2 or 3.");
	            System.out.println("Would you like to do it again <y/n>");
	            //BURAYA TEKRAR KODU EKLENECEK
	            break;
	            
	        }
		    
		    
		
		double hamfiyat=0;
		String secilenmodel = null;
	
		switch (secilenmodelno) {
		case 1 :
			hamfiyat = hamfiyat + 62500.0;
			secilenmodel = "Volkswagen Polo - Manual";
			break;
		case 2 :
			hamfiyat = hamfiyat + 97750.0;
			secilenmodel = "Volkswagen Scirocco - Manual";
			break;
		case 3 :
			hamfiyat = hamfiyat + 142600.0;
			secilenmodel = "Volkswagen Passat - Automatic";
			break;
		case 4 :
			hamfiyat = hamfiyat + 75800.0;
			secilenmodel = "Seat Leon - Manual";
			break;
		case 5 :
			hamfiyat = hamfiyat + 89500.0;
			secilenmodel = "Seat Ateca (4Motion) - Automatic";
			break;
		case 6 :
			hamfiyat = hamfiyat + 49500.0;
			secilenmodel = "Seat Ibiza - Manual";
			break;
		case 7 :
			hamfiyat = hamfiyat + 124800.0;
			secilenmodel = "Skoda Superb - Automatic";
			break;
		case 8 :
			hamfiyat = hamfiyat + 98700.0;
			secilenmodel = "Skoda Octavia - Automatic";
			break;
		case 9 :
			hamfiyat = hamfiyat + 58900.0;
			secilenmodel = "Skoda Fabia - Manual";
			break;
		default :
			System.out.println("Something went wrong. Please restart the program.");
			break;
		}
		
	
		System.out.println("Please enter your name.");
		
		Scanner information = new Scanner (System.in);
		
		String isim = information.nextLine();
		
		System.out.println("Please enter your phone number.");
		
		String telefon = information.nextLine();
		
		System.out.println("Do you want you pay via take credit? (true/false) Note:If you take credit, you must pay small tax.");
		
		boolean kredi = information.nextBoolean();
	
		
		
		double odenecekfiyat = 0;
		
		if (kredi==true) {
			odenecekfiyat = hamfiyat*(1.08) + 2500.0; //toplam fiyat = %1.08 vergi + servis ücreti
		}
		
		else if (kredi==false) {
			odenecekfiyat = hamfiyat + 2500.0; //toplam fiyat = ham + servis ücreti
		}
	
		
		System.out.println("Your Receipt:");
		System.out.println("Name: " + isim );
		System.out.println("Phone Number: " + telefon );
		System.out.println("Car: " + secilenmodel);
		System.out.println("Total Cost: " + odenecekfiyat + " TL");
		System.out.println("Thank you for choosing us. Use it with a good hand.");
		
		
		
		
	}
	
	}


