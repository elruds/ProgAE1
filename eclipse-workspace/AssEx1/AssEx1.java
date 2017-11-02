import javax.swing.*;


public class AssEx1 {

	public static void main(String[]args) {
		{	Wine wineModel = new Wine();
			
			
		
		
		String name = JOptionPane.showInputDialog("Enter customer name"); {
																		//requests input of customer name

			if ((name.equals(null)) || (name.equals(""))) {
			
				System.exit(0);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Customer name: " + name + "", 
									"Customer name", JOptionPane.INFORMATION_MESSAGE); //shows name
				CustomerAccount accountModel = new CustomerAccount(name);
				accountModel.setcName(name);
				
				
				boolean noNumberEntered = false;
		do {	String initBal = JOptionPane.showInputDialog(null, "Enter customer's current balance");  
				//requests input of initial balance
			
			 try {initBal.trim();
		
				double d = Double.parseDouble(initBal);
				noNumberEntered = false;
				LWMGUI view = new LWMGUI(name, d, wineModel, accountModel);
				view.setCurrentBal();  //prints initial balance to current balance textfield in view
				view.setVisible(true);  
		
				break;
			 }
			 
			catch (NumberFormatException nfx) {  
				noNumberEntered = true;
				JOptionPane.showMessageDialog(null, "Please enter a number" + "", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
			}
					
			while (noNumberEntered==true); //loop while no number entered
				
				
		}	
			
			
			
			
		}
	}
	}
}
		

				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		