
public class generateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int i;
		
		
		
		
		
		
		PizzaOrder[] item1=new PizzaOrder[5];
		item1[0]=new PizzaOrder("Panner Pizza  ",2,2000);
		item1[1]=new PizzaOrder("Veg Pizza     ",3,1500);
		item1[2]=new PizzaOrder("chicken Pizza ",1,2500);
		System.out.println("----------------------------------BILL--------------------------------------------");
		System.out.println("==================================================================================");
		System.out.println("==================================================================================");
		System.out.println("                             WELCOME                                    ");
		System.out.println("      			1633 Bill generation      		                ");
		System.out.println("           		    PONDA GOA      				    			");
		System.out.println("          		 PHN:9999999999      							");
		System.out.println("        		 VAT NO:VAT 111111     							");
		System.out.println("===================================================================================");
		System.out.println("===================================================================================");
		System.out.println("The Name of the product     "+"  Quantity  "+"  Price of Product  "+"  Total Price of Product");
		
		for(i=0;i<=2;i++)
		{
			total=total+item1[i].totalPrice();
			item1[i].printDetail();
			
			
		}
		System.out.println("");
		System.out.println("Total Amount:-         "+total);
		
			int amount=total;
			int gst;
			amount=(amount*8)/100;
			gst=total+amount;
			System.out.println("");
			System.out.println(" Gst Tax:-             "+amount);
			System.out.println("");
			System.out.println("GST(8%) GST AMOUNT:-   "+gst);
			System.out.println("");
			System.out.println("------------------------------------THANK YOU --------------------------------------");
			System.out.println("===================================================================================");
			System.out.println("===================================================================================");
		
		
	}



	}