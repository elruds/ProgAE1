import javax.swing.JOptionPane;

public class AssEx1 {

	public static void main(String[]args) {
//	{	Wine wineModel = new Wine();
//		LWMGUI controller = new LWMGUI();	
//		LWMGUI view = controller;
//		controller.setView(view);
		
		String name = JOptionPane.showInputDialog("Enter customer name"); {
																		//requests input of customer name

			if ((name.equals(null)) || (name.equals(""))) {
			
				System.exit(0);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Customer name: " + name + "", 
									"Customer name", JOptionPane.INFORMATION_MESSAGE); //shows name
				
			String initBal = JOptionPane.showInputDialog(null, "Enter customer's current balance");  
//				//requests input of current balance
				
				String trimInitBal = initBal.trim();
		
				double d = Double.parseDouble(initBal);
				
				JOptionPane.showMessageDialog(null, "Customer balance: " + d + "", 
						"Current balance", JOptionPane.INFORMATION_MESSAGE);
				
				LWMGUI frame = new LWMGUI(name, trimInitBal);
				frame.setVisible(true);
				frame.setInitBal();
		
		}
			}
		

				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		

//try {
//		
//		for(;;) {		
//				
//				
//				
//				
//
//		}	
//		}

				
//		
//		catch (NumberFormatException nfx) {
//			JOptionPane.showMessageDialog(null, "Please enter a number" + "", 
//					"Error", JOptionPane.ERROR_MESSAGE);
//		
//	}

				
				
				
				
				
		
}
}	


				
				
				
				
				
				
				
				
				
				
				
				  	
