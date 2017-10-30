import javax.swing.JOptionPane;

public class AssEx1 {

	public static void main(String[]args) {
//	{	Wine wineModel = new Wine();
//		LWMGUI controller = new LWMGUI(wineModel);	
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
				
				
			}
		}
	

try {
		
		for(;;) {		
				
				String initBal = JOptionPane.showInputDialog(null, "Enter customer's current balance");  
				//requests input of current balance
				
				initBal.trim();
				
				double d = Double.parseDouble(initBal);
				
				LWMGUI frame = new LWMGUI(name);
				frame.setVisible(true);
				
		}
}

				
				catch (NumberFormatException nfx) {
					JOptionPane.showMessageDialog(null, "Please enter a number" + "", 
							"Error", JOptionPane.ERROR_MESSAGE);
				}
		
}
}


				
				
				
				
				
				
				
				
				
				
				
				  	
