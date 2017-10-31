import javax.swing.JOptionPane;

public class AssEx1 {

	public static void main(String[]args) {
	{	Wine wineModel = new Wine();
//		LWMGUI frame = new LWMGUI(name, trimwineModel);
//		LWMGUI view = controller;
		
		
		String name = JOptionPane.showInputDialog("Enter customer name"); {
																		//requests input of customer name

			if ((name.equals(null)) || (name.equals(""))) {
			
				System.exit(0);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Customer name: " + name + "", 
									"Customer name", JOptionPane.INFORMATION_MESSAGE); //shows name
				
				
				
				boolean invalid_input = false;
		do {	String initBal = JOptionPane.showInputDialog(null, "Enter customer's current balance");  
				//requests input of current balance
			
			 try {String trimInitBal = initBal.trim();
		
				double d = Double.parseDouble(initBal);
				invalid_input = false;
				LWMGUI frame = new LWMGUI(name, trimInitBal);
				frame.setVisible(true);
				frame.setInitBal(); //want current balance to appear in GUI 'current balance' text field
				JOptionPane.showMessageDialog(null, "Customer balance: " + d + "", 
						"Current balance", JOptionPane.INFORMATION_MESSAGE);
				break;
			 }
			 
			catch (NumberFormatException nfx) {
				invalid_input = true;
				JOptionPane.showMessageDialog(null, "Please enter a number" + "", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
			}
					
			while (invalid_input==true);
				
				
		}
			
			
			
			
		}
	}
	}
}
		

				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		


				
				
				
				
				
				
				
				
				
				
				
				  	
