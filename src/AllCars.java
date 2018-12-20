import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;

public class AllCars {

	private JFrame frmAllCars;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllCars window = new AllCars();
					window.frmAllCars.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AllCars() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAllCars = new JFrame();
		frmAllCars.getContentPane().setFont(new Font("Calibri", Font.BOLD, 24));
		frmAllCars.setTitle("All Cars");
		frmAllCars.setBounds(100, 100, 647, 415);
		frmAllCars.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmAllCars.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblAllcars = new JLabel("2017 Volkswagen Polo 1.2 TSi Comfortline Manual");
		lblAllcars.setForeground(Color.DARK_GRAY);
		lblAllcars.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars = new GridBagConstraints();
		gbc_lblAllcars.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAllcars.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars.gridx = 1;
		gbc_lblAllcars.gridy = 0;
		frmAllCars.getContentPane().add(lblAllcars, gbc_lblAllcars);
		
		JLabel lblAllcars_1 = new JLabel("2017 Volkswagen Passat 1.4 TSi Highline Manual");
		lblAllcars_1.setForeground(Color.DARK_GRAY);
		lblAllcars_1.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_1 = new GridBagConstraints();
		gbc_lblAllcars_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars_1.gridx = 1;
		gbc_lblAllcars_1.gridy = 1;
		frmAllCars.getContentPane().add(lblAllcars_1, gbc_lblAllcars_1);
		
		JLabel lblAllcars_2 = new JLabel("2017 Volkswagen Scirocco R 2.0 TSi DSG");
		lblAllcars_2.setForeground(Color.DARK_GRAY);
		lblAllcars_2.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_2 = new GridBagConstraints();
		gbc_lblAllcars_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars_2.gridx = 1;
		gbc_lblAllcars_2.gridy = 2;
		frmAllCars.getContentPane().add(lblAllcars_2, gbc_lblAllcars_2);
		
		JLabel lblAllcars_3 = new JLabel("2017 Seat Ibiza 1.4 TDi Style Manual ");
		lblAllcars_3.setForeground(Color.DARK_GRAY);
		lblAllcars_3.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_3 = new GridBagConstraints();
		gbc_lblAllcars_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars_3.gridx = 1;
		gbc_lblAllcars_3.gridy = 3;
		frmAllCars.getContentPane().add(lblAllcars_3, gbc_lblAllcars_3);
		
		JLabel lblAllcars_4 = new JLabel("2017 Seat Leon 1.4 TSi ACT FR Manual");
		lblAllcars_4.setForeground(Color.DARK_GRAY);
		lblAllcars_4.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_4 = new GridBagConstraints();
		gbc_lblAllcars_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars_4.gridx = 1;
		gbc_lblAllcars_4.gridy = 4;
		frmAllCars.getContentPane().add(lblAllcars_4, gbc_lblAllcars_4);
		
		JLabel lblAllcars_5 = new JLabel("2017 Skoda Superb 1.6 TDi Style DSG");
		lblAllcars_5.setForeground(Color.DARK_GRAY);
		lblAllcars_5.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_5 = new GridBagConstraints();
		gbc_lblAllcars_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars_5.gridx = 1;
		gbc_lblAllcars_5.gridy = 5;
		frmAllCars.getContentPane().add(lblAllcars_5, gbc_lblAllcars_5);
		
		JLabel label = new JLabel(" ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 6;
		frmAllCars.getContentPane().add(label, gbc_label);
		
		JLabel lblAllcars_6 = new JLabel("2017 Audi A3 Cabrio 1.4 TFSi Attraction S-Tronic");
		lblAllcars_6.setForeground(Color.DARK_GRAY);
		lblAllcars_6.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_6 = new GridBagConstraints();
		gbc_lblAllcars_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars_6.gridx = 1;
		gbc_lblAllcars_6.gridy = 6;
		frmAllCars.getContentPane().add(lblAllcars_6, gbc_lblAllcars_6);
		
		JLabel lblAllcars_7 = new JLabel("2017 Audi Q5 2.0 TDi Dynamic S-Tronic");
		lblAllcars_7.setForeground(Color.DARK_GRAY);
		lblAllcars_7.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_7 = new GridBagConstraints();
		gbc_lblAllcars_7.insets = new Insets(0, 0, 5, 0);
		gbc_lblAllcars_7.gridx = 1;
		gbc_lblAllcars_7.gridy = 7;
		frmAllCars.getContentPane().add(lblAllcars_7, gbc_lblAllcars_7);
		
		JLabel lblAllcars_8 = new JLabel("2017 Audi A6 Allroad 3.0 TDi Quattro S-Tronic");
		lblAllcars_8.setForeground(Color.DARK_GRAY);
		lblAllcars_8.setFont(new Font("Calibri", Font.ITALIC, 28));
		GridBagConstraints gbc_lblAllcars_8 = new GridBagConstraints();
		gbc_lblAllcars_8.gridx = 1;
		gbc_lblAllcars_8.gridy = 8;
		frmAllCars.getContentPane().add(lblAllcars_8, gbc_lblAllcars_8);
	}

}
