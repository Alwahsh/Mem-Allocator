import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;


public class Gui extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 12, 311, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAddNewHole = new JLabel("Add New Hole:");
		lblAddNewHole.setBounds(12, 12, 183, 15);
		panel.add(lblAddNewHole);
		
		JLabel lblStartAddress = new JLabel("Start Address:");
		lblStartAddress.setBounds(12, 50, 125, 15);
		panel.add(lblStartAddress);
		
		JSpinner holeStartAddress = new JSpinner();
		holeStartAddress.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		holeStartAddress.setBounds(12, 70, 125, 34);
		panel.add(holeStartAddress);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(149, 50, 125, 15);
		panel.add(lblSize);
		
		JSpinner holeSize = new JSpinner();
		holeSize.setBounds(149, 70, 125, 34);
		panel.add(holeSize);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(22, 143, 311, 143);
		contentPane.add(panel_1);
		
		JLabel lblChoose = new JLabel("Choose Allocation Method:");
		lblChoose.setBounds(12, 12, 202, 15);
		panel_1.add(lblChoose);
		
		JList allocationMethod = new JList();
		allocationMethod.setModel(new AbstractListModel() {
			String[] values = new String[] {"First Fit", "Best Fit", "Worst Fit"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		allocationMethod.setBounds(22, 40, 251, 91);
		panel_1.add(allocationMethod);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(22, 298, 311, 116);
		contentPane.add(panel_2);
		
		JLabel lblAddNewProcess = new JLabel("Add New Process:");
		lblAddNewProcess.setBounds(12, 12, 139, 15);
		panel_2.add(lblAddNewProcess);
		
		JLabel lblSize_1 = new JLabel("Size");
		lblSize_1.setBounds(12, 50, 125, 15);
		panel_2.add(lblSize_1);
		
		JSpinner processSize = new JSpinner();
		processSize.setBounds(12, 70, 125, 34);
		panel_2.add(processSize);
		
		JLabel lblPNumber = new JLabel("P0");
		lblPNumber.setBounds(145, 12, 70, 15);
		panel_2.add(lblPNumber);
		
		DrawerPanel panel_3 = new DrawerPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(345, 12, 376, 458);
		contentPane.add(panel_3);
	}
}
