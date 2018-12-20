import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AEK {

	private JFrame frmCarCenter;
	private JTextField txtTry;
	private static int x1,x2,x3,x4,x5,x6=0;
	private static String carname;
	private JFrame frmOptions;
	private JTextField total;
	private JFrame frmInformation;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtAdres;
	private JTextField txtColor;
	private JFrame frmReceipt;
	private JTextField txtTname;
	private JTextField txtTphone;
	private JTextField txtTaddress;
	private JTextField txtTcarmodel;
	private JTextField txtTcarcolour;
	private JTextField txtTcarprice;
	private JTextField txtToptions;
	private JTextField txtTkdv;
	private JTextField txtTtotal;
	private JFrame frmAllCars;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AEK window = new AEK();
					window.frmCarCenter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AEK() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarCenter = new JFrame();
		frmCarCenter.getContentPane().setForeground(Color.BLUE);
		frmCarCenter.setTitle("Car Center");
		frmCarCenter.setBounds(100, 100, 550, 500);
		frmCarCenter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarCenter.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblWelcome = new JLabel("Welcome to AEK Car Center");
		lblWelcome.setForeground(Color.BLUE);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Calibri", Font.BOLD, 30));
		frmCarCenter.getContentPane().add(lblWelcome, BorderLayout.NORTH);
		
		JButton btnBuyACar = new JButton("Buy A Car");
		btnBuyACar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame buycar = new JFrame ("Buy A Car");
				buycar.setVisible(true);
				buycar.setSize(950, 600);
				
	
				GridBagLayout gridBagLayout = new GridBagLayout();
				gridBagLayout.columnWidths = new int[]{45, 155, 5, 68, 51, 45, 45, 45, 0};
				gridBagLayout.rowHeights = new int[]{23, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				buycar.getContentPane().setLayout(gridBagLayout);
				
				JLabel lblNewLabel = new JLabel("Welcome. These are our new cars.");
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 25));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 0;
				buycar.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
				
				JLabel lblForShowingPrices = new JLabel("For showing prices, click the car name.");
				lblForShowingPrices.setFont(new Font("Calibri Light", Font.ITALIC, 12));
				GridBagConstraints gbc_lblForShowingPrices = new GridBagConstraints();
				gbc_lblForShowingPrices.anchor = GridBagConstraints.WEST;
				gbc_lblForShowingPrices.insets = new Insets(0, 0, 5, 5);
				gbc_lblForShowingPrices.gridx = 0;
				gbc_lblForShowingPrices.gridy = 1;
				buycar.getContentPane().add(lblForShowingPrices, gbc_lblForShowingPrices);
				
				JButton btnA = new JButton("2017 Volkswagen Polo 1.2 TSi Comfortline Manual");
				btnA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("61600");
						AEK.carname = "2017 Volkswagen Polo 1.2 TSi Comfortline Manual";
					}
				});
				GridBagConstraints gbc_btnA = new GridBagConstraints();
				gbc_btnA.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA.insets = new Insets(0, 0, 5, 5);
				gbc_btnA.gridx = 0;
				gbc_btnA.gridy = 2;
				buycar.getContentPane().add(btnA, gbc_btnA);
				
				
				JButton btnA_1 = new JButton("2017 Volkswagen Passat 1.4 TSi Highline Manual");
				btnA_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("161600");
						AEK.carname = "2017 Volkswagen Passat 1.4 TSi Highline Manual";
					}
				});
				GridBagConstraints gbc_btnA_1 = new GridBagConstraints();
				gbc_btnA_1.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_1.gridx = 0;
				gbc_btnA_1.gridy = 3;
				buycar.getContentPane().add(btnA_1, gbc_btnA_1);
				
				JButton btnA_2 = new JButton("2017 Volkswagen Scirocco R 2.0 TSi DSG");
				btnA_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						txtTry.setText("261600");
						AEK.carname = "2017 Volkswagen Scirocco R 2.0 TSi DSG";
					}
				});
				GridBagConstraints gbc_btnA_2 = new GridBagConstraints();
				gbc_btnA_2.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_2.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_2.gridx = 0;
				gbc_btnA_2.gridy = 4;
				buycar.getContentPane().add(btnA_2, gbc_btnA_2);
				
				JButton btnA_3 = new JButton("2017 Seat Ibiza 1.4 TDi Style Manual ");
				btnA_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("71600");
						AEK.carname = "2017 Seat Ibiza 1.4 TDi Style Manual";
					}
				});
				GridBagConstraints gbc_btnA_3 = new GridBagConstraints();
				gbc_btnA_3.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_3.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_3.gridx = 0;
				gbc_btnA_3.gridy = 5;
				buycar.getContentPane().add(btnA_3, gbc_btnA_3);
				
				JButton btnA_4 = new JButton("2017 Seat Leon 1.4 TSi ACT FR Manual");
				btnA_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("99600");
						AEK.carname = "2017 Seat Leon 1.4 TSi ACT FR Manual";
					}
				});
				GridBagConstraints gbc_btnA_4 = new GridBagConstraints();
				gbc_btnA_4.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_4.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_4.gridx = 0;
				gbc_btnA_4.gridy = 6;
				buycar.getContentPane().add(btnA_4, gbc_btnA_4);
				
				JButton btnA_5 = new JButton("2017 Skoda Superb 1.6 TDi Style DSG");
				btnA_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("121600");
						AEK.carname = "2017 Skoda Superb 1.6 TDi Style DSG";
					}
				});
				GridBagConstraints gbc_btnA_5 = new GridBagConstraints();
				gbc_btnA_5.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_5.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_5.gridx = 0;
				gbc_btnA_5.gridy = 7;
				buycar.getContentPane().add(btnA_5, gbc_btnA_5);
				
				JButton btnA_6 = new JButton("2017 Audi A3 Cabrio 1.4 TFSi Attraction S-Tronic");
				btnA_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("120600");
						AEK.carname = "2017 Audi A3 Cabrio 1.4 TFSi Attraction S-Tronic";
					}
				});
				GridBagConstraints gbc_btnA_6 = new GridBagConstraints();
				gbc_btnA_6.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_6.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_6.gridx = 0;
				gbc_btnA_6.gridy = 8;
				buycar.getContentPane().add(btnA_6, gbc_btnA_6);
				
				JButton btnA_7 = new JButton("2017 Audi Q5 2.0 TDi Dynamic S-Tronic");
				btnA_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("361900");
						AEK.carname = "2017 Audi Q5 2.0 TDi Dynamic S-Tronic";
					}
				});
				GridBagConstraints gbc_btnA_7 = new GridBagConstraints();
				gbc_btnA_7.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_7.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_7.gridx = 0;
				gbc_btnA_7.gridy = 9;
				buycar.getContentPane().add(btnA_7, gbc_btnA_7);
				
				JButton btnA_8 = new JButton("2017 Audi A6 Allroad 3.0 TDi Quattro S-Tronic");
				btnA_8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTry.setText("561600");
						AEK.carname = "2017 Audi A6 Allroad 3.0 TDi Quattro S-Tronic";
					}
				});
				GridBagConstraints gbc_btnA_8 = new GridBagConstraints();
				gbc_btnA_8.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnA_8.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_8.gridx = 0;
				gbc_btnA_8.gridy = 10;
				buycar.getContentPane().add(btnA_8, gbc_btnA_8);
				
				
				txtTry = new JTextField();
				txtTry.setBorder(null);
				txtTry.setFont(new Font("Calibri", Font.ITALIC, 18));
				txtTry.setOpaque(false);
				txtTry.setVisible(true);
				
				JLabel lblPrice = new JLabel("Price:");
				lblPrice.setFont(new Font("Calibri", Font.ITALIC, 18));
				GridBagConstraints gbc_lblPrice = new GridBagConstraints();
				gbc_lblPrice.insets = new Insets(0, 0, 0, 5);
				gbc_lblPrice.anchor = GridBagConstraints.EAST;
				gbc_lblPrice.gridx = 2;
				gbc_lblPrice.gridy = 12;
				buycar.getContentPane().add(lblPrice, gbc_lblPrice);
				
				
				txtTry.setSelectionColor(SystemColor.inactiveCaption);
				txtTry.setPreferredSize(new Dimension(5, 30));
				txtTry.setText(" ");
				txtTry.setEditable(false);
				txtTry.setBackground(null);
				GridBagConstraints gbc_txtTry = new GridBagConstraints();
				gbc_txtTry.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtTry.insets = new Insets(0, 0, 0, 5);
				gbc_txtTry.gridx = 3;
				gbc_txtTry.gridy = 12;
				buycar.getContentPane().add(txtTry, gbc_txtTry);
				txtTry.setColumns(10);
				
				
				
				JLabel lblTl = new JLabel("TL");
				lblTl.setFont(new Font("Calibri", Font.ITALIC, 18));
				GridBagConstraints gbc_lblTl = new GridBagConstraints();
				gbc_lblTl.anchor = GridBagConstraints.WEST;
				gbc_lblTl.insets = new Insets(0, 0, 0, 5);
				gbc_lblTl.gridx = 4;
				gbc_lblTl.gridy = 12;
				buycar.getContentPane().add(lblTl, gbc_lblTl);
				

				JButton btnForward = new JButton("Continue >");
				btnForward.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						buycar.setVisible(false);
						
						frmOptions = new JFrame();
						frmOptions.setVisible(true);
						frmOptions.setTitle("Options");
						frmOptions.setBounds(100, 100, 746, 401);
						frmOptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						GridBagLayout gridBagLayout = new GridBagLayout();
						gridBagLayout.columnWidths = new int[]{234, 70, 0, -40, 0, 112, 0, 0};
						gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
						gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
						gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
						frmOptions.getContentPane().setLayout(gridBagLayout);
						
						JLabel lblOpsiyonSemeEkran = new JLabel("Please select the options if you want.          ");
						lblOpsiyonSemeEkran.setFont(new Font("Dialog", Font.ITALIC, 12));
						GridBagConstraints gbc_lblOpsiyonSemeEkran = new GridBagConstraints();
						gbc_lblOpsiyonSemeEkran.insets = new Insets(0, 0, 5, 5);
						gbc_lblOpsiyonSemeEkran.gridx = 0;
						gbc_lblOpsiyonSemeEkran.gridy = 0;
						frmOptions.getContentPane().add(lblOpsiyonSemeEkran, gbc_lblOpsiyonSemeEkran);
						
						JCheckBox o1 = new JCheckBox("Sunroof");
						o1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								if (o1.isSelected() == true ) {
									x1=3250; //Option1 is selected.
								}
								
								else {
									x1=0;
								}
								
							}


						});
						
						JLabel label_11 = new JLabel(" ");
						GridBagConstraints gbc_label_11 = new GridBagConstraints();
						gbc_label_11.insets = new Insets(0, 0, 5, 5);
						gbc_label_11.gridx = 0;
						gbc_label_11.gridy = 1;
						frmOptions.getContentPane().add(label_11, gbc_label_11);
						GridBagConstraints gbc_o1 = new GridBagConstraints();
						gbc_o1.fill = GridBagConstraints.HORIZONTAL;
						gbc_o1.insets = new Insets(0, 0, 5, 5);
						gbc_o1.gridx = 0;
						gbc_o1.gridy = 2;
						frmOptions.getContentPane().add(o1, gbc_o1);
						
						
						
						JLabel label = new JLabel("3250");
						GridBagConstraints gbc_label = new GridBagConstraints();
						gbc_label.anchor = GridBagConstraints.EAST;
						gbc_label.insets = new Insets(0, 0, 5, 5);
						gbc_label.gridx = 1;
						gbc_label.gridy = 2;
						frmOptions.getContentPane().add(label, gbc_label);
						
						JLabel lblTl = new JLabel("TL");
						GridBagConstraints gbc_lblTl = new GridBagConstraints();
						gbc_lblTl.anchor = GridBagConstraints.WEST;
						gbc_lblTl.insets = new Insets(0, 0, 5, 5);
						gbc_lblTl.gridx = 2;
						gbc_lblTl.gridy = 2;
						frmOptions.getContentPane().add(lblTl, gbc_lblTl);
						
						
						
						JCheckBox o2 = new JCheckBox("Cruise Control");
						o2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if (o2.isSelected() == true ) {
									x2=2400;
								}
								
								else {
									x2=0;
								}
							}
						});
						GridBagConstraints gbc_o2 = new GridBagConstraints();
						gbc_o2.fill = GridBagConstraints.HORIZONTAL;
						gbc_o2.insets = new Insets(0, 0, 5, 5);
						gbc_o2.gridx = 0;
						gbc_o2.gridy = 3;
						frmOptions.getContentPane().add(o2, gbc_o2);
						
						
						JLabel label_1 = new JLabel("2400");
						GridBagConstraints gbc_label_1 = new GridBagConstraints();
						gbc_label_1.anchor = GridBagConstraints.EAST;
						gbc_label_1.insets = new Insets(0, 0, 5, 5);
						gbc_label_1.gridx = 1;
						gbc_label_1.gridy = 3;
						frmOptions.getContentPane().add(label_1, gbc_label_1);
						
						JLabel label_6 = new JLabel("TL");
						GridBagConstraints gbc_label_6 = new GridBagConstraints();
						gbc_label_6.anchor = GridBagConstraints.WEST;
						gbc_label_6.insets = new Insets(0, 0, 5, 5);
						gbc_label_6.gridx = 2;
						gbc_label_6.gridy = 3;
						frmOptions.getContentPane().add(label_6, gbc_label_6);
						
						JCheckBox o3 = new JCheckBox("LED Headlights");
						o3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if (o3.isSelected() == true ) {
									x3=4200;
								}
								
								else {
									x3=0;
								}
							}
						});
						GridBagConstraints gbc_o3 = new GridBagConstraints();
						gbc_o3.fill = GridBagConstraints.HORIZONTAL;
						gbc_o3.insets = new Insets(0, 0, 5, 5);
						gbc_o3.gridx = 0;
						gbc_o3.gridy = 4;
						frmOptions.getContentPane().add(o3, gbc_o3);
						
						JLabel label_2 = new JLabel("4200");
						GridBagConstraints gbc_label_2 = new GridBagConstraints();
						gbc_label_2.anchor = GridBagConstraints.EAST;
						gbc_label_2.insets = new Insets(0, 0, 5, 5);
						gbc_label_2.gridx = 1;
						gbc_label_2.gridy = 4;
						frmOptions.getContentPane().add(label_2, gbc_label_2);
						
						JLabel label_7 = new JLabel("TL");
						GridBagConstraints gbc_label_7 = new GridBagConstraints();
						gbc_label_7.anchor = GridBagConstraints.WEST;
						gbc_label_7.insets = new Insets(0, 0, 5, 5);
						gbc_label_7.gridx = 2;
						gbc_label_7.gridy = 4;
						frmOptions.getContentPane().add(label_7, gbc_label_7);
						
						JCheckBox o4 = new JCheckBox("Sport Suspension");
						o4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if (o4.isSelected() == true ) {
									x4=1400;
								}
								
								else {
									x4=0;
								}
							}
						});
						GridBagConstraints gbc_o4 = new GridBagConstraints();
						gbc_o4.fill = GridBagConstraints.HORIZONTAL;
						gbc_o4.insets = new Insets(0, 0, 5, 5);
						gbc_o4.gridx = 0;
						gbc_o4.gridy = 5;
						frmOptions.getContentPane().add(o4, gbc_o4);
						
						JLabel label_3 = new JLabel("1400");
						GridBagConstraints gbc_label_3 = new GridBagConstraints();
						gbc_label_3.anchor = GridBagConstraints.EAST;
						gbc_label_3.insets = new Insets(0, 0, 5, 5);
						gbc_label_3.gridx = 1;
						gbc_label_3.gridy = 5;
						frmOptions.getContentPane().add(label_3, gbc_label_3);
						
						JLabel label_8 = new JLabel("TL");
						GridBagConstraints gbc_label_8 = new GridBagConstraints();
						gbc_label_8.anchor = GridBagConstraints.WEST;
						gbc_label_8.insets = new Insets(0, 0, 5, 5);
						gbc_label_8.gridx = 2;
						gbc_label_8.gridy = 5;
						frmOptions.getContentPane().add(label_8, gbc_label_8);
						
						JCheckBox o5 = new JCheckBox("Digital Infotainment System");
						o5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if (o5.isSelected() == true ) {
									x5=7500;
								}
								
								else {
									x5=0;
								}
							}
						});
						GridBagConstraints gbc_o5 = new GridBagConstraints();
						gbc_o5.fill = GridBagConstraints.HORIZONTAL;
						gbc_o5.insets = new Insets(0, 0, 5, 5);
						gbc_o5.gridx = 0;
						gbc_o5.gridy = 6;
						frmOptions.getContentPane().add(o5, gbc_o5);
						
						JLabel label_4 = new JLabel("7500");
						GridBagConstraints gbc_label_4 = new GridBagConstraints();
						gbc_label_4.anchor = GridBagConstraints.EAST;
						gbc_label_4.insets = new Insets(0, 0, 5, 5);
						gbc_label_4.gridx = 1;
						gbc_label_4.gridy = 6;
						frmOptions.getContentPane().add(label_4, gbc_label_4);
						
						JLabel label_9 = new JLabel("TL");
						GridBagConstraints gbc_label_9 = new GridBagConstraints();
						gbc_label_9.anchor = GridBagConstraints.WEST;
						gbc_label_9.insets = new Insets(0, 0, 5, 5);
						gbc_label_9.gridx = 2;
						gbc_label_9.gridy = 6;
						frmOptions.getContentPane().add(label_9, gbc_label_9);
						
						JCheckBox o6 = new JCheckBox("Keyless Entry");
						o6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if (o6.isSelected() == true ) {
									x6=1800;
								}
								
								else {
									x6=0;
								}
							}
						});
						GridBagConstraints gbc_o6 = new GridBagConstraints();
						gbc_o6.fill = GridBagConstraints.HORIZONTAL;
						gbc_o6.insets = new Insets(0, 0, 5, 5);
						gbc_o6.gridx = 0;
						gbc_o6.gridy = 7;
						frmOptions.getContentPane().add(o6, gbc_o6);
						
						JLabel label_5 = new JLabel("1800");
						GridBagConstraints gbc_label_5 = new GridBagConstraints();
						gbc_label_5.insets = new Insets(0, 0, 5, 5);
						gbc_label_5.anchor = GridBagConstraints.EAST;
						gbc_label_5.gridx = 1;
						gbc_label_5.gridy = 7;
						frmOptions.getContentPane().add(label_5, gbc_label_5);
						
						
						
						JLabel label_10 = new JLabel("TL");
						GridBagConstraints gbc_label_10 = new GridBagConstraints();
						gbc_label_10.anchor = GridBagConstraints.WEST;
						gbc_label_10.insets = new Insets(0, 0, 5, 5);
						gbc_label_10.gridx = 2;
						gbc_label_10.gridy = 7;
						frmOptions.getContentPane().add(label_10, gbc_label_10);
						
						JLabel lblNewLabel = new JLabel(" ");
						GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
						gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel.gridx = 0;
						gbc_lblNewLabel.gridy = 8;
						frmOptions.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
						
						
						
						total = new JTextField();
						GridBagConstraints gbc_total = new GridBagConstraints();
						gbc_total.gridwidth = 2;
						gbc_total.insets = new Insets(0, 0, 5, 5);
						gbc_total.anchor = GridBagConstraints.WEST;
						gbc_total.gridx = 1;
						gbc_total.gridy = 10;
						frmOptions.getContentPane().add(total, gbc_total);
						total.setColumns(10);
						
						JButton btnCalculate = new JButton("Calculate");
						btnCalculate.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int x;
								x=AEK.x1+AEK.x2+AEK.x3+AEK.x4+AEK.x5+AEK.x6;
								String S = String.valueOf(x); //int olan x, setText 'te kullanýlabilmesi için string'e çevriliyor.
								
								total.setText(S);
								
								
							}
						});
						GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
						gbc_btnCalculate.insets = new Insets(0, 0, 5, 5);
						gbc_btnCalculate.gridx = 0;
						gbc_btnCalculate.gridy = 10;
						frmOptions.getContentPane().add(btnCalculate, gbc_btnCalculate);
						
						JLabel label_12 = new JLabel(" ");
						GridBagConstraints gbc_label_12 = new GridBagConstraints();
						gbc_label_12.insets = new Insets(0, 0, 5, 5);
						gbc_label_12.gridx = 5;
						gbc_label_12.gridy = 10;
						frmOptions.getContentPane().add(label_12, gbc_label_12);
						
						JButton btnContinue = new JButton("Continue >");
						btnContinue.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								
								
								
								
								frmOptions.setVisible(false);
								frmInformation = new JFrame();
								frmInformation.setVisible(true);
								frmInformation.setTitle("Information");
								frmInformation.setBounds(100, 100, 500, 320);
								frmInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								GridBagLayout gridBagLayout = new GridBagLayout();
								gridBagLayout.columnWidths = new int[]{0, 215, 0};
								gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
								gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
								gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
								frmInformation.getContentPane().setLayout(gridBagLayout);
								
								JLabel lblPleaseFillThe = new JLabel("Please fill the following spaces.");
								lblPleaseFillThe.setFont(new Font("Calibri", Font.ITALIC, 14));
								GridBagConstraints gbc_lblPleaseFillThe = new GridBagConstraints();
								gbc_lblPleaseFillThe.insets = new Insets(0, 0, 5, 5);
								gbc_lblPleaseFillThe.gridx = 0;
								gbc_lblPleaseFillThe.gridy = 0;
								frmInformation.getContentPane().add(lblPleaseFillThe, gbc_lblPleaseFillThe);
								
								JLabel lblName = new JLabel("Name");
								lblName.setFont(new Font("Calibri", Font.PLAIN, 18));
								GridBagConstraints gbc_lblName = new GridBagConstraints();
								gbc_lblName.fill = GridBagConstraints.HORIZONTAL;
								gbc_lblName.insets = new Insets(0, 0, 5, 5);
								gbc_lblName.gridx = 0;
								gbc_lblName.gridy = 1;
								frmInformation.getContentPane().add(lblName, gbc_lblName);
								
								txtName = new JTextField();
								GridBagConstraints gbc_txtName = new GridBagConstraints();
								gbc_txtName.insets = new Insets(0, 0, 5, 0);
								gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtName.gridx = 1;
								gbc_txtName.gridy = 1;
								frmInformation.getContentPane().add(txtName, gbc_txtName);
								txtName.setColumns(10);
								
								JLabel lblPhoneNumber = new JLabel("Phone Number");
								lblPhoneNumber.setFont(new Font("Calibri", Font.PLAIN, 18));
								GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
								gbc_lblPhoneNumber.fill = GridBagConstraints.HORIZONTAL;
								gbc_lblPhoneNumber.insets = new Insets(0, 0, 5, 5);
								gbc_lblPhoneNumber.gridx = 0;
								gbc_lblPhoneNumber.gridy = 2;
								frmInformation.getContentPane().add(lblPhoneNumber, gbc_lblPhoneNumber);
								
								txtPhone = new JTextField();
								GridBagConstraints gbc_txtPhone = new GridBagConstraints();
								gbc_txtPhone.insets = new Insets(0, 0, 5, 0);
								gbc_txtPhone.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtPhone.gridx = 1;
								gbc_txtPhone.gridy = 2;
								frmInformation.getContentPane().add(txtPhone, gbc_txtPhone);
								txtPhone.setColumns(10);
								
								JLabel lblAddress = new JLabel("Address");
								lblAddress.setFont(new Font("Calibri", Font.PLAIN, 18));
								GridBagConstraints gbc_lblAddress = new GridBagConstraints();
								gbc_lblAddress.fill = GridBagConstraints.HORIZONTAL;
								gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
								gbc_lblAddress.gridx = 0;
								gbc_lblAddress.gridy = 3;
								frmInformation.getContentPane().add(lblAddress, gbc_lblAddress);
								
								txtAdres = new JTextField();
								GridBagConstraints gbc_txtAdres = new GridBagConstraints();
								gbc_txtAdres.insets = new Insets(0, 0, 5, 0);
								gbc_txtAdres.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtAdres.gridx = 1;
								gbc_txtAdres.gridy = 3;
								frmInformation.getContentPane().add(txtAdres, gbc_txtAdres);
								txtAdres.setColumns(10);
								
								JLabel lblCarColour = new JLabel("Car Colour");
								lblCarColour.setFont(new Font("Calibri", Font.PLAIN, 18));
								GridBagConstraints gbc_lblCarColour = new GridBagConstraints();
								gbc_lblCarColour.fill = GridBagConstraints.HORIZONTAL;
								gbc_lblCarColour.insets = new Insets(0, 0, 5, 5);
								gbc_lblCarColour.gridx = 0;
								gbc_lblCarColour.gridy = 4;
								frmInformation.getContentPane().add(lblCarColour, gbc_lblCarColour);
								
								txtColor = new JTextField();
								GridBagConstraints gbc_txtColor = new GridBagConstraints();
								gbc_txtColor.insets = new Insets(0, 0, 5, 0);
								gbc_txtColor.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtColor.gridx = 1;
								gbc_txtColor.gridy = 4;
								frmInformation.getContentPane().add(txtColor, gbc_txtColor);
								txtColor.setColumns(10);
								
								JButton btnContinue = new JButton("Continue >");
								btnContinue.setFont(new Font("Calibri", Font.BOLD, 12));
								btnContinue.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										
										
										
										
										
										
										frmInformation.setVisible(false);
										frmReceipt = new JFrame();
										frmReceipt.setVisible(true);
										frmReceipt.setTitle("Receipt");
										frmReceipt.setBounds(100, 100, 650, 450);
										frmReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										GridBagLayout gridBagLayout = new GridBagLayout();
										gridBagLayout.columnWidths = new int[]{0, 122, 0, 0};
										gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
										gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
										gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
										frmReceipt.getContentPane().setLayout(gridBagLayout);
										
										JLabel lblReceipt = new JLabel("AEK Car Center Receipt");
										lblReceipt.setFont(new Font("Calibri", Font.PLAIN, 24));
										GridBagConstraints gbc_lblReceipt = new GridBagConstraints();
										gbc_lblReceipt.insets = new Insets(0, 0, 5, 5);
										gbc_lblReceipt.gridx = 1;
										gbc_lblReceipt.gridy = 0;
										frmReceipt.getContentPane().add(lblReceipt, gbc_lblReceipt);
										
										JLabel label = new JLabel(" ");
										GridBagConstraints gbc_label = new GridBagConstraints();
										gbc_label.insets = new Insets(0, 0, 5, 5);
										gbc_label.gridx = 1;
										gbc_label.gridy = 1;
										frmReceipt.getContentPane().add(label, gbc_label);
										
										JLabel lblName2 = new JLabel("Name");
										GridBagConstraints gbc_lblName2 = new GridBagConstraints();
										gbc_lblName2.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblName2.insets = new Insets(0, 0, 5, 5);
										gbc_lblName2.gridx = 1;
										gbc_lblName2.gridy = 2;
										frmReceipt.getContentPane().add(lblName2, gbc_lblName2);
										
										txtTname = new JTextField();
										txtTname.setBorder(null);
										txtTname.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtTname.setEditable(false);
				
										txtTname.setText(txtName.getText());
										
										GridBagConstraints gbc_txtTname = new GridBagConstraints();
										gbc_txtTname.anchor = GridBagConstraints.WEST;
										gbc_txtTname.insets = new Insets(0, 0, 5, 0);
										gbc_txtTname.gridx = 2;
										gbc_txtTname.gridy = 2;
										frmReceipt.getContentPane().add(txtTname, gbc_txtTname);
										txtTname.setColumns(10);
										
										JLabel lblPhone2 = new JLabel("Phone");
										GridBagConstraints gbc_lblPhone2 = new GridBagConstraints();
										gbc_lblPhone2.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblPhone2.insets = new Insets(0, 0, 5, 5);
										gbc_lblPhone2.gridx = 1;
										gbc_lblPhone2.gridy = 3;
										frmReceipt.getContentPane().add(lblPhone2, gbc_lblPhone2);
										
										txtTphone = new JTextField();
										txtTphone.setBorder(null);
										txtTphone.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtTphone.setEditable(false);
										
										txtTphone.setText(txtPhone.getText());
										
										GridBagConstraints gbc_txtTphone = new GridBagConstraints();
										gbc_txtTphone.anchor = GridBagConstraints.WEST;
										gbc_txtTphone.insets = new Insets(0, 0, 5, 0);
										gbc_txtTphone.gridx = 2;
										gbc_txtTphone.gridy = 3;
										frmReceipt.getContentPane().add(txtTphone, gbc_txtTphone);
										txtTphone.setColumns(10);
										
										JLabel lblAddress2 = new JLabel("Address");
										GridBagConstraints gbc_lblAddress2 = new GridBagConstraints();
										gbc_lblAddress2.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblAddress2.insets = new Insets(0, 0, 5, 5);
										gbc_lblAddress2.gridx = 1;
										gbc_lblAddress2.gridy = 4;
										frmReceipt.getContentPane().add(lblAddress2, gbc_lblAddress2);
										
										txtTaddress = new JTextField();
										txtTaddress.setBorder(null);
										txtTaddress.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtTaddress.setEditable(false);
										
										txtTaddress.setText(txtAdres.getText());
										
										GridBagConstraints gbc_txtTaddress = new GridBagConstraints();
										gbc_txtTaddress.anchor = GridBagConstraints.WEST;
										gbc_txtTaddress.insets = new Insets(0, 0, 5, 0);
										gbc_txtTaddress.gridx = 2;
										gbc_txtTaddress.gridy = 4;
										frmReceipt.getContentPane().add(txtTaddress, gbc_txtTaddress);
										txtTaddress.setColumns(10);
										
										JLabel lblCarModel2 = new JLabel("Car Model");
										GridBagConstraints gbc_lblCarModel2 = new GridBagConstraints();
										gbc_lblCarModel2.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblCarModel2.insets = new Insets(0, 0, 5, 5);
										gbc_lblCarModel2.gridx = 1;
										gbc_lblCarModel2.gridy = 5;
										frmReceipt.getContentPane().add(lblCarModel2, gbc_lblCarModel2);
										
										txtTcarmodel = new JTextField();
										txtTcarmodel.setBorder(null);
										txtTcarmodel.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtTcarmodel.setEditable(false);
										
	/* car model */						txtTcarmodel.setText(AEK.carname);
										
										GridBagConstraints gbc_txtTcarmodel = new GridBagConstraints();
										gbc_txtTcarmodel.fill = GridBagConstraints.HORIZONTAL;
										gbc_txtTcarmodel.insets = new Insets(0, 0, 5, 5);
										gbc_txtTcarmodel.gridx = 2;
										gbc_txtTcarmodel.gridy = 5;
										frmReceipt.getContentPane().add(txtTcarmodel, gbc_txtTcarmodel);
										txtTcarmodel.setColumns(10);
										
										
										JLabel lblCarColour2 = new JLabel("Car Colour");
										GridBagConstraints gbc_lblCarColour2 = new GridBagConstraints();
										gbc_lblCarColour2.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblCarColour2.insets = new Insets(0, 0, 5, 5);
										gbc_lblCarColour2.gridx = 1;
										gbc_lblCarColour2.gridy = 6;
										frmReceipt.getContentPane().add(lblCarColour2, gbc_lblCarColour2);
										
										txtTcarcolour = new JTextField();
										txtTcarcolour.setBorder(null);
										txtTcarcolour.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtTcarcolour.setEditable(false);
										
										txtTcarcolour.setText(txtColor.getText());
										
										GridBagConstraints gbc_txtTcarcolour = new GridBagConstraints();
										gbc_txtTcarcolour.anchor = GridBagConstraints.WEST;
										gbc_txtTcarcolour.insets = new Insets(0, 0, 5, 0);
										gbc_txtTcarcolour.gridx = 2;
										gbc_txtTcarcolour.gridy = 6;
										frmReceipt.getContentPane().add(txtTcarcolour, gbc_txtTcarcolour);
										txtTcarcolour.setColumns(10);
										
										JLabel label_1 = new JLabel("  ");
										GridBagConstraints gbc_label_1 = new GridBagConstraints();
										gbc_label_1.insets = new Insets(0, 0, 5, 5);
										gbc_label_1.gridx = 0;
										gbc_label_1.gridy = 7;
										frmReceipt.getContentPane().add(label_1, gbc_label_1);
										
										JLabel lblEmpty_1 = new JLabel(" ");
										GridBagConstraints gbc_lblEmpty_1 = new GridBagConstraints();
										gbc_lblEmpty_1.insets = new Insets(0, 0, 5, 5);
										gbc_lblEmpty_1.gridx = 1;
										gbc_lblEmpty_1.gridy = 8;
										frmReceipt.getContentPane().add(lblEmpty_1, gbc_lblEmpty_1);
										
										JLabel lblCarPrice = new JLabel("Car Price");
										GridBagConstraints gbc_lblCarPrice = new GridBagConstraints();
										gbc_lblCarPrice.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblCarPrice.insets = new Insets(0, 0, 5, 5);
										gbc_lblCarPrice.gridx = 1;
										gbc_lblCarPrice.gridy = 9;
										frmReceipt.getContentPane().add(lblCarPrice, gbc_lblCarPrice);
										
										txtTcarprice = new JTextField();
										txtTcarprice.setBorder(null);
										txtTcarprice.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtTcarprice.setEditable(false);
										
										txtTcarprice.setText(txtTry.getText() + " TL");
										
										GridBagConstraints gbc_txtTcarprice = new GridBagConstraints();
										gbc_txtTcarprice.anchor = GridBagConstraints.WEST;
										gbc_txtTcarprice.insets = new Insets(0, 0, 5, 0);
										gbc_txtTcarprice.gridx = 2;
										gbc_txtTcarprice.gridy = 9;
										frmReceipt.getContentPane().add(txtTcarprice, gbc_txtTcarprice);
										txtTcarprice.setColumns(10);
										
										JLabel lblOptions2 = new JLabel("Options");
										GridBagConstraints gbc_lblOptions2 = new GridBagConstraints();
										gbc_lblOptions2.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblOptions2.insets = new Insets(0, 0, 5, 5);
										gbc_lblOptions2.gridx = 1;
										gbc_lblOptions2.gridy = 10;
										frmReceipt.getContentPane().add(lblOptions2, gbc_lblOptions2);
										
										txtToptions = new JTextField();
										txtToptions.setBorder(null);
										txtToptions.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtToptions.setEditable(false);
										
										txtToptions.setText(total.getText() + " TL");
										
										GridBagConstraints gbc_txtToptions = new GridBagConstraints();
										gbc_txtToptions.anchor = GridBagConstraints.WEST;
										gbc_txtToptions.insets = new Insets(0, 0, 5, 0);
										gbc_txtToptions.gridx = 2;
										gbc_txtToptions.gridy = 10;
										frmReceipt.getContentPane().add(txtToptions, gbc_txtToptions);
										txtToptions.setColumns(10);
										
										JLabel lblEmpty_2 = new JLabel(" ");
										GridBagConstraints gbc_lblEmpty_2 = new GridBagConstraints();
										gbc_lblEmpty_2.insets = new Insets(0, 0, 5, 5);
										gbc_lblEmpty_2.gridx = 1;
										gbc_lblEmpty_2.gridy = 11;
										frmReceipt.getContentPane().add(lblEmpty_2, gbc_lblEmpty_2);
										
										JLabel lblKdv = new JLabel("KDV");
										GridBagConstraints gbc_lblKdv = new GridBagConstraints();
										gbc_lblKdv.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblKdv.insets = new Insets(0, 0, 5, 5);
										gbc_lblKdv.gridx = 1;
										gbc_lblKdv.gridy = 12;
										frmReceipt.getContentPane().add(lblKdv, gbc_lblKdv);
										
										txtTkdv = new JTextField();
										txtTkdv.setBorder(null);
										txtTkdv.setFont(new Font("Calibri", Font.PLAIN, 16));
										txtTkdv.setEditable(false);
										
										int int_options = Integer.parseInt(total.getText());
										int int_carprice = Integer.parseInt(txtTry.getText());
										
										int int_kdv = 0;
										
									
										int_kdv = ((int_options)+(int_carprice))*(18)/100;
										
										String SS = String.valueOf(int_kdv);
										
										
										txtTkdv.setText(SS + " TL");
										
										GridBagConstraints gbc_txtTkdv = new GridBagConstraints();
										gbc_txtTkdv.anchor = GridBagConstraints.WEST;
										gbc_txtTkdv.insets = new Insets(0, 0, 5, 0);
										gbc_txtTkdv.gridx = 2;
										gbc_txtTkdv.gridy = 12;
										frmReceipt.getContentPane().add(txtTkdv, gbc_txtTkdv);
										txtTkdv.setColumns(10);
										
										JLabel lblTotalPrice = new JLabel("TOTAL");
										GridBagConstraints gbc_lblTotalPrice = new GridBagConstraints();
										gbc_lblTotalPrice.fill = GridBagConstraints.HORIZONTAL;
										gbc_lblTotalPrice.insets = new Insets(0, 0, 0, 5);
										gbc_lblTotalPrice.gridx = 1;
										gbc_lblTotalPrice.gridy = 13;
										frmReceipt.getContentPane().add(lblTotalPrice, gbc_lblTotalPrice);
										
										txtTtotal = new JTextField();
										txtTtotal.setBorder(null);
										txtTtotal.setFont(new Font("Calibri", Font.BOLD, 18));
										txtTtotal.setEditable(false);
										
										int grandtotal;
										
										grandtotal = int_carprice + int_options + int_kdv;
										
										String S_total = String.valueOf(grandtotal);
										
										
										txtTtotal.setText(S_total + " TL");
										
										
										GridBagConstraints gbc_txtTtotal = new GridBagConstraints();
										gbc_txtTtotal.anchor = GridBagConstraints.WEST;
										gbc_txtTtotal.gridx = 2;
										gbc_txtTtotal.gridy = 13;
										frmReceipt.getContentPane().add(txtTtotal, gbc_txtTtotal);
										txtTtotal.setColumns(10);
										
										
										
										
										
										
										
										
										
									}
								});
								GridBagConstraints gbc_btnContinue = new GridBagConstraints();
								gbc_btnContinue.gridx = 1;
								gbc_btnContinue.gridy = 7;
								frmInformation.getContentPane().add(btnContinue, gbc_btnContinue);
								
								
								
								
								
								
								
							}
						});
						GridBagConstraints gbc_btnContinue = new GridBagConstraints();
						gbc_btnContinue.gridx = 6;
						gbc_btnContinue.gridy = 11;
						frmOptions.getContentPane().add(btnContinue, gbc_btnContinue);
						
						
					} // opsiyon actionperformed
				});
				
				GridBagConstraints gbc_btnForward = new GridBagConstraints();
				gbc_btnForward.insets = new Insets(0, 0, 0, 5);
				gbc_btnForward.gridx = 6;
				gbc_btnForward.gridy = 12;
				buycar.getContentPane().add(btnForward, gbc_btnForward);
	
			
			}
		});
		btnBuyACar.setFont(new Font("Calibri", Font.BOLD, 24));
		btnBuyACar.setPreferredSize(new Dimension(267, 23));
		frmCarCenter.getContentPane().add(btnBuyACar, BorderLayout.CENTER);
		
		JButton btnViewAllCars = new JButton("View All Cars");
		btnViewAllCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmAllCars = new JFrame();
				frmAllCars.setVisible(true);
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
		});
		btnViewAllCars.setFont(new Font("Calibri", Font.BOLD, 24));
		btnViewAllCars.setPreferredSize(new Dimension(93, 150));
		frmCarCenter.getContentPane().add(btnViewAllCars, BorderLayout.SOUTH);
		
		
	
		JMenuBar menuBar = new JMenuBar();
		frmCarCenter.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		
		
		JMenuItem mntmSave = new JMenuItem("Exit");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCarCenter.setVisible(false);
				frmOptions.setVisible(false);
				frmInformation.setVisible(false);
				frmReceipt.setVisible(false);
				frmAllCars.setVisible(false);
			}
		});
		mnFile.add(mntmSave);
		
	
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame about = new JFrame("About");
				about.setVisible(true);
				about.setSize(300, 100);
				JLabel developer = new JLabel (" Developer: Ali Erkan Kýzgýn ");
				about.getContentPane().add(developer);
				
			}
		});
		mntmAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		mnHelp.add(mntmAbout);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
