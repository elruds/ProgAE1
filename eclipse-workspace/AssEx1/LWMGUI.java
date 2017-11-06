import sun.awt.CausedFocusEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LWMGUI extends JFrame implements ActionListener
{
	private JPanel top, middle1, middle2, bottom;
	private JTextField enterWineName, enterQuantity, enterPrice, enterTransAmt, enterCurrentBal;
	private JLabel name, quantity, price, winePurchased, transAmt, currentBal;
	private JButton processSale, processReturn;
	private Wine wine;
	private CustomerAccount custAcc;
	private String cname;



	public LWMGUI(CustomerAccount custAcc) {
		this.custAcc = custAcc;
		this.wine = new Wine();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,300);
		setLocation(700,300);
		setTitle("Lilybank Wine Merchants: " + this.custAcc.getCname()); //creates JFrame object


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
		transAmt = new JLabel("Amount of Transaction: £");
		bottom.add(transAmt);

		enterTransAmt = new JTextField(10);
		enterTransAmt.setEditable(false);
		bottom.add(enterTransAmt);				//creates field to enter transaction amount

		currentBal = new JLabel("Current balance: £");
		bottom.add(currentBal);

		enterCurrentBal = new JTextField(10);	//creates field to enter current balance on account
		enterCurrentBal.setEditable(false);
		bottom.add(enterCurrentBal);

		middle1 = new JPanel();
		BorderLayout bl = new BorderLayout();
		middle1.setLayout(bl);					//creates new panel with border layout

		winePurchased = new JLabel("Wine purchased: " );
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



	public void printCurrentBal() {		//method to print initial balance in text field
		
		double initialBalance = custAcc.getBalanceInPounds();
		String initialBal = String.format("%6.2f", initialBalance);
		enterCurrentBal.setText(initialBal);
	}



	public void actionPerformed(ActionEvent e) {

		String wineName = enterWineName.getText();
		
        if (!wineName.equals("")) {	//if user has entered text in wineName field
        	winePurchased.setText("Wine purchased: " + wineName);	
        	
        	wine.setWineName(wineName);  //set wineName in Wine
        
        setQuantity();				//calls helper method to set number of bottles in Wine
        setPriceOne();				//calls helper method to set price of one bottle in Wine

        double totalCost = custAcc.wineTransaction(wine); 
        String transAmt = String.format("%6.2f", totalCost/100); //displays to two dec. places
        							
				if (e.getSource() == processSale) {
					
					enterTransAmt.setText(transAmt);
					custAcc.updateBalanceSale(totalCost);
					
				}
				
				else if  (e.getSource() == processReturn) {
					
					enterTransAmt.setText("CR " + transAmt);
					custAcc.updateBalanceReturn(totalCost);
					
				}
						           
				
				double currentBalance = custAcc.getBalanceInPounds();
				String displayCurrBal = String.format("%6.2f", currentBalance);
				enterCurrentBal.setText(displayCurrBal);
				this.clearFields();
			}
			else {
				wine.resetFields();
				this.clearFields();
			}			//if no text entered in for wine name, reset fields

		}

	private void clearFields() {
		
		enterWineName.setText("");
		enterQuantity.setText("");
		enterPrice.setText("");
	}


	private void setQuantity() {			//helper method

		String Quantity = enterQuantity.getText().trim();

		try {

			int num = Integer.parseInt(Quantity);
			if ((num >= 1) && (num <= 5000)) {
				wine.setNumBottles(num);
			}
			else {
			    JOptionPane.showMessageDialog(this, "Minimum order is 1 bottle and maximum order "
					+ "is 5000 bottles", "Error", JOptionPane.ERROR_MESSAGE);
				enterQuantity.setText("");
				wine.resetFields();
				this.clearFields();
			}
		}
		catch (NumberFormatException nfx) {
			JOptionPane.showMessageDialog(this, "Enter whole number of bottles", "Error", JOptionPane.ERROR_MESSAGE);
			enterQuantity.setText("");

			wine.resetFields();
			this.clearFields();
		}

	}


	private void setPriceOne() {	//helper method

		String pOne = this.enterPrice.getText().trim();

		try {

			double priceOne = Double.parseDouble(pOne);

			if (priceOne > 0)
			{
				wine.setPriceBottle(priceOne);
			}

			else {


				JOptionPane.showMessageDialog(this, "Price cannot be 0 or less! "
						, "Error", JOptionPane.ERROR_MESSAGE);
				this.enterQuantity.setText("");

				wine.resetFields();
			}
		}

		catch (NumberFormatException nfx) {
			JOptionPane.showMessageDialog(this, "Enter price", "Error", JOptionPane.ERROR_MESSAGE);
			this.enterQuantity.setText("");

			wine.resetFields();

		}

			
			
			
		}




	}


		
		