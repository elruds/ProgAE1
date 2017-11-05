import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LWMGUI extends JFrame implements ActionListener
{
	private JPanel top, middle1, middle2, bottom;
	private JTextField enterWineName, enterQuantity, enterPrice, enterTransAmt, enterCurrentBal;
	private JLabel name, quantity, price, winePurchased, transAmt, currentBal;
	private JButton processSale, processReturn;
	private Wine wineModel;
	private CustomerAccount custAcc;
	
	
	
	public LWMGUI(Wine wineModel, CustomerAccount custAcc)
	{	 
		 this.custAcc = custAcc;
		 this.wineModel = wineModel;
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(700,300);
		 setLocation(700,300);
		 setTitle("Lilybank Wine Merchants: " + custAcc.getCname()); //creates JFrame object
		
		 
		 layoutComponents();
		 
		processSale.addActionListener(this);
		processReturn.addActionListener(this);
		
	}

		
	private void layoutComponents()
	{	
		
		top = new JPanel();
		top.setBackground(Color.lightGray);
		
		name = new JLabel("Name: ");
		top.add(name);
		
		enterWineName = new JTextField(20); 
		top.add(enterWineName);						//creates text field labelled "Name"
		
		quantity = new JLabel("Quantity: ");
		top.add(quantity);
		
		enterQuantity = new JTextField(10);
		top.add(enterQuantity);					//creates text field labelled "Quantity"
		
		price = new JLabel("Price: £ ");
		top.add(price);
		
		enterPrice = new JTextField(5);
		top.add(enterPrice);					//creates field to enter price of a bottle of wine
		
		bottom = new JPanel();
		bottom.setBackground(Color.GREEN);
		transAmt = new JLabel("Amount of Transaction: ");
		bottom.add(transAmt);
		
		enterTransAmt = new JTextField(10);
		bottom.add(enterTransAmt);				//creates field to enter transaction amount
		
		currentBal = new JLabel("Current balance: ");
		bottom.add(currentBal);
		
		enterCurrentBal = new JTextField(10);	//creates field to enter current balance on account
		bottom.add(enterCurrentBal);	
		
		middle1 = new JPanel();
		BorderLayout bl = new BorderLayout();
		middle1.setLayout(bl);					//creates new panel with border layout
		
		winePurchased = new JLabel("Wine purchased: ");
		middle1.add(winePurchased, BorderLayout.SOUTH);
		
		middle2 = new JPanel();
		FlowLayout fl = new FlowLayout();
		middle2.setLayout(fl);					//creates new panel with flow layout
		
		processSale = new JButton("Process Sale");
		processReturn = new JButton("Process Return");
				
		middle1.add(middle2, BorderLayout.NORTH);		//adds flow layout panel to top of border layout panel
		
		middle2.add(processSale);
		middle2.add(processReturn);
		
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
		add(middle1, BorderLayout.CENTER);		//adds panels to JFrame

	
}
	
	
	
	public void printCurrentBal() {
	
		enterCurrentBal.setText("" + (custAcc.getbPnce() / 100));
	}

	
		
	public void actionPerformed(ActionEvent e) {
		
		String wineName = enterWineName.getText();
		
		if (e.getSource() == processSale) { 
			Wine w = new Wine();				
			if (wineName != "") {				//if user clicks processSale and has entered text,
				w.setWineName(wineName);   /*set the wine name to what they have 
											entered in the text field*/
				
				getQuantity(w);				//calls helper method to get number of bottles
				System.out.println(w.getWineName());		//for
				System.out.println(w.getNumBottles()); 		//testing
				getPriceOne(w);				//calls helper method to get price of one bottle
				System.out.println(w.getPriceBottle()); 
				
				CustomerAccount c = new CustomerAccount(w);
				c.wineSale(w);
				enterTransAmt.setText("" + c.wineSale(w));
				
				enterCurrentBal.setText("" + c.getbPnce());
			}
			
			else 
				{w.resetFields();}			//if no text entered, reset fields
			
		}
	}
			
			
			
		
			
		
			
//
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == processSale) 
//		{
//			System.out.print("You pressed processSale");
//		}
//		else
//			System.out.print("You pressed processReturn");
//	}
//}
//	
	
	
	
		
//	}
	
	
	
	private void getQuantity(Wine w) {
			
		String Quantity = enterQuantity.getText().trim();
		
		try {
				
		int num = Integer.parseInt(Quantity);
		if ((num >= 1) && (num <= 5000))
		{
			w.setNumBottles(num);
		}
		else 
		{ 		JOptionPane.showMessageDialog(this, "Minimum order is 1 bottle and maximum order "
				+ "is 5000 bottles", "Error", JOptionPane.ERROR_MESSAGE);
				this.enterQuantity.setText("");
				
				w.resetFields();
		}
		}		
		catch (NumberFormatException nfx) {
			JOptionPane.showMessageDialog(this, "Enter a whole number", "Error", JOptionPane.ERROR_MESSAGE);
			this.enterQuantity.setText("");
			
			w.resetFields();
		}
		
	}
	
	
	private void getPriceOne(Wine w) {
		
		String pOne = this.enterPrice.getText().trim();
	
		try {
			
			double priceOne = Double.parseDouble(pOne);
			
			if (priceOne > 0)
			{
				w.setPriceBottle(priceOne);
			}
		
			else {
				
				
				JOptionPane.showMessageDialog(this, "Price cannot be 0 or less! "
				, "Error", JOptionPane.ERROR_MESSAGE);
				this.enterQuantity.setText("");
				
				w.resetFields();
			}
			}
			
		catch (NumberFormatException nfx) {
				JOptionPane.showMessageDialog(this, "Enter a number", "Result summary", JOptionPane.ERROR_MESSAGE);
				this.enterQuantity.setText("");
				
				w.resetFields();
			
		}

		

			
		
	}
}

		
		