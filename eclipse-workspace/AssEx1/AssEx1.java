import javax.swing.JOptionPane;

public class AssEx1 {

	public static void main(String[]args)
	{
		String result = JOptionPane.showInputDialog(null, "Enter customer name"); {
																		//requests input of customer name

			if ((!result.equals(null)) && (!result.equals(""))) {

				JOptionPane.showMessageDialog(null, "Customer name: " + result + "", 
									"Result summary", JOptionPane.INFORMATION_MESSAGE);
																		//shows name which was entered
				
				
				String result2 = JOptionPane.showInputDialog(null, "Enter customer's current balance");  
																		//requests input of current balance
				
				
					
				if ((!result2.equals(null)) && (!result2.equals("")))	{
					JOptionPane.showMessageDialog(null, "Current balance: " + result2 + "",  
									"Result summary", JOptionPane.INFORMATION_MESSAGE);
													 					//shows balance which was entered

					LWMGUI frame = new LWMGUI();
					frame.setVisible(true);
				
				}
					else   {	//terminates program if user cancels or closes dialog box
				
				System.exit(0);
				}
				}	
		
		
		}
	}
	
		
}
