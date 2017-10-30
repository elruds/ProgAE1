import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LWMGUI extends JFrame implements ActionListener
{
	private JPanel top, middle1, middle2, bottom;
	private JTextField enterName, enterQuantity, enterPrice, enterTransAmt, enterCurrentBal;
	private JLabel name, quantity, price, winePurchased, transAmt, currentBal;
	private JButton processSale, processReturn;
	private Wine modelObject;
	private LWMGUI viewObject;
	private LWMGUI controllerObject;
	private String custName;
	
//	Wine wineModel, LWMGUI controller, LWMGUI view, String custName
	
	
	public LWMGUI(String custName)	
	{	 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(700,300);
		 setLocation(700,300);
		 setTitle("Lilybank Wine Merchants: " + custName); //creates JFrame object
//		 modelObject = wineModel;
//		 controllerObject = controller;
//		 viewObject = view;
//		 
		 
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
		
		enterName = new JTextField(20); 
		top.add(enterName);						//creates text field labelled "Name"
		
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


	/*public void actionPerformed(ActionEvent e) {
		if (e.getSource() == processSale) 
		{
			System.out.print("You pressed processSale");
		}
		else
			System.out.print("You pressed processReturn");
	}*/
	
	private void getWineName() {
		String getName = viewObject.enterName.getText();
	}
	
	private void getQuantity() {
		String getQuant = viewObject.enterQuantity.getText().trim();
		try {
		int num = Integer.parseInt(getQuant);
		modelObject.numBottles(num);
		}
		catch (NumberFormatException nfx) {
			JOptionPane.showMessageDialog(viewObject, "Enter a number", "Result summary", JOptionPane.ERROR_MESSAGE);
			viewObject.enterQuantity.setText("");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == processSale) {
			this.getWineName();
			this.getQuantity();
		}
		
	}
	

	public void setView(LWMGUI view) {
		viewObject = view;
	}
}
