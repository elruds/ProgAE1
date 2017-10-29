import javax.swing.JOptionPane;

public class AssEx1 {

	public static void main(String[]args)
	{	LWMGUI frame = new LWMGUI();
		String result = JOptionPane.showInputDialog("Enter customer name"); {
																		//requests input of customer name

			if ((result.equals(null)) || (result.equals(""))) {
			
				System.exit(0);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Customer name: " + result + "", 
									"Customer name", JOptionPane.INFORMATION_MESSAGE); //shows name
				frame.setVisible(true);
				
			}
		}
	}
}
		/*
		for(;;) {		
				
				String result2 = JOptionPane.showInputDialog(null, "Enter customer's current balance");  
				//requests input of current balance
				
				getCurrentBalance(result2);
			
		}
			}
		}
	}

				private static double getCurrentBalance(String result2) {
				
					try {
						
								result2.trim();
								
									double d = Double.parseDouble(result2);
									return d;
						}
					
						
								
								catch (NumberFormatException nfx) {
									JOptionPane.showMessageDialog(null, "Please enter a number" + "", 
											"Error", JOptionPane.ERROR_MESSAGE);
									
								}					
					
				}
				
				}
*/
				
				
				
				
				
				
				
				
				
				
				
				  	
