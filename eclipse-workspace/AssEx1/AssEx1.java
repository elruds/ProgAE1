import javax.swing.*;


public class AssEx1 {

	public static void main(String[]args) {
		{
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
				
				
				
				boolean noNumberEntered = false;
		do {	String initBal = JOptionPane.showInputDialog(null, "Enter customer's current balance");  
				//requests input of current balance
			
			 try {initBal.trim();
		
				double d = Double.parseDouble(initBal);
				noNumberEntered = false;
				LWMGUI frame = new LWMGUI(name, d);
				frame.setInitBal();  //want current balance to appear in GUI 'current balance' text field
				frame.setVisible(true);  
		
				break;
			 }
			 
			catch (NumberFormatException nfx) {
				noNumberEntered = true;
				JOptionPane.showMessageDialog(null, "Please enter a number" + "", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
			}
					
			while (noNumberEntered==true);
				
				
		}	
			
			
			
			
		}
	}
	}
}
		

				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		