/*A program which allows a sales assistant in a wine shop to enter a customer's 
name and initial account balance via OptionPanes.  A simple GUI then allows input of the name 
of a wine, number of bottles of wine and price per bottle.  A sale or return can be 
processed.
The program calculates the amount of the transaction and updates the account balance 
accordingly.*/

import javax.swing.*;


public class AssEx1 {

	public static void main(String[]args) {
		{	Wine wineModel = new Wine();




			String name = JOptionPane.showInputDialog("Enter customer name"); {
			//requests input of customer name

			if ((name.equals(null)) || (name.equals(""))) { //field must not be empty

				System.exit(0);
			}

			else {

				boolean noNumberEntered;
				do {
				    String initBal = JOptionPane.showInputDialog(null, "Enter customer's "
				    		+ "current balance");
					//requests input of initial balance

					try {
						double initBalD = Double.parseDouble(initBal.trim());
						double balInPence = initBalD * 100.0; //converts to pence
						CustomerAccount accountModel = new CustomerAccount(name, (int) balInPence);
						LWMGUI view = new LWMGUI(accountModel);
						 
						view.printCurrentBal();  //prints initial balance to current balance textfield in view
						view.setVisible(true);

						break;
					}

					catch (NumberFormatException nfx) {
						noNumberEntered = true;			//must enter a number
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
		

				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
