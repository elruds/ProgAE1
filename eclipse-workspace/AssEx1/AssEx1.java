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

				boolean noNumberEntered;
				do {
				    String initBal = JOptionPane.showInputDialog(null, "Enter customer's current balance");
					//requests input of initial balance

					try {
						double initBalD = Double.parseDouble(initBal.trim());
						double balInPence = initBalD * 100.0;
						CustomerAccount accountModel = new CustomerAccount(name, (int) balInPence);
						LWMGUI view = new LWMGUI(accountModel);
						 
						view.printCurrentBal();  //prints initial balance to current balance textfield in view
						view.setVisible(true);

						break;
					}

					catch (NumberFormatException nfx) {
						noNumberEntered = true;
						JOptionPane.showMessageDialog(null, "Please enter a number" + "",
								"Error", JOptionPane.ERROR_MESSAGE);
					}
				}

				while (noNumberEntered); //loop while no number entered


			}




		}
		}
	}
}
		

				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
