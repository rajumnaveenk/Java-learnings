package classMedthods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ----- BankAccount Class -----
class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	public String getAccountInfo() {
		return "Account Number: " + accountNumber + "\n" + "Account Holder: " + accountHolderName + "\n" + "Balance: "
				+ balance + "\n";
	}

	public double getBalance() {
		return balance;
	}
}

// ----- GUI Class -----
public class BankAppGUI extends JFrame {
	private BankAccount account;
	private JTextField amountField;
	private JTextArea outputArea;

	public BankAppGUI() {
		// Create a demo account
		account = new BankAccount(1001, "Alice", 5000);

		// Frame settings
		setTitle("Bank Account System");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Top panel (amount input + buttons)
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("Enter Amount:"));
		amountField = new JTextField(10);
		topPanel.add(amountField);

		JButton depositBtn = new JButton("Deposit");
		JButton withdrawBtn = new JButton("Withdraw");
		JButton infoBtn = new JButton("Show Info");

		topPanel.add(depositBtn);
		topPanel.add(withdrawBtn);
		topPanel.add(infoBtn);

		// Output area
		outputArea = new JTextArea();
		outputArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(outputArea);

		// Add components
		add(topPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);

		// Button Actions
		depositBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double amount = Double.parseDouble(amountField.getText());
					account.deposit(amount);
					outputArea.setText("Deposited: " + amount + "\n\n" + account.getAccountInfo());
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Invalid input!");
				}
			}
		});

		withdrawBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double amount = Double.parseDouble(amountField.getText());
					if (amount <= account.getBalance()) {
						account.withdraw(amount);
						outputArea.setText("Withdrawn: " + amount + "\n\n" + account.getAccountInfo());
					} else {
						JOptionPane.showMessageDialog(null, "Insufficient Balance!");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Invalid input!");
				}
			}
		});

		infoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.setText(account.getAccountInfo());
			}
		});
	}

	// Main Method
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new BankAppGUI().setVisible(true);
		});
	}
}
