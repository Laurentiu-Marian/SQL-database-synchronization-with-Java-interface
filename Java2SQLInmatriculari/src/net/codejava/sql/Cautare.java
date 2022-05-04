package net.codejava.sql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Cautare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cautare frame = new Cautare();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cautare() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 875, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JavaToSQLInmatriculari nou = new JavaToSQLInmatriculari();
		
		JLabel lblCautareDupaNorma = new JLabel("Cautare dupa Norma Euro de Poluare");
		lblCautareDupaNorma.setFont(new Font("Garamond", Font.BOLD, 15));
		
		JButton button_1 = new JButton("1");
		
		JButton button_2 = new JButton("2");
		
		JButton button_3 = new JButton("3");
		
		JButton button_4 = new JButton("4");
		
		JButton button_5 = new JButton("5");
		
		JButton button_6 = new JButton("6");
		
		JButton btnEco = new JButton("ECO");
		
		JTextArea textArea = new JTextArea();
		
		JTextArea textArea_1 = new JTextArea();
		
		JLabel lblCautareDupaMotorizare = new JLabel("Cautare dupa Motorizare");
		lblCautareDupaMotorizare.setFont(new Font("Garamond", Font.BOLD, 15));
		
		JButton btnBenzina = new JButton("Benzina");
		
		JButton btnDiesel = new JButton("Diesel");
		
		JButton btnElectric = new JButton("Electric");
		
		JButton btnHibrid = new JButton("Hibrid");
		
		JTextArea textArea_2 = new JTextArea();
		
		JLabel lblCautareDupaTipul = new JLabel("Cautare dupa Tipul de Inmatriculare");
		lblCautareDupaTipul.setFont(new Font("Garamond", Font.BOLD, 15));
		
		JButton btnProvizoriiShort = new JButton("Provizorii o luna");
		
		JButton btnProvizoriiLong = new JButton("Provizorii 3 luna");
		
		JButton btnDefinitiveRandom = new JButton("Definitive random");
		
		JButton btnDefinitiveAlegere = new JButton("Definitive alegere");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblCautareDupaNorma, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnEco)))
								.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(28)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(btnProvizoriiShort, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnDefinitiveRandom, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
								.addGap(38)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(btnDefinitiveAlegere, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnProvizoriiLong, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
								.addGap(84)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addComponent(lblCautareDupaTipul, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCautareDupaMotorizare, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnBenzina, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDiesel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnElectric, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnHibrid, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCautareDupaNorma, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCautareDupaMotorizare, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEco, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnBenzina, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnDiesel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnElectric, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnHibrid, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
							.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
							.addGap(26))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblCautareDupaTipul, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnProvizoriiShort, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnProvizoriiLong, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDefinitiveRandom, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDefinitiveAlegere, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(125))))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
		
		
		button_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//normaPoluare=1;
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+" from Vehicul Veh "
						+" INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+" WHERE Cat.NormaPoluare=1 "
						+" ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea.setText("");
				for(int i = 0; i < nou.strdim; i++){
			       	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			              textArea.append(nou.columnValue[i]+", ");
			    }
				System.out.println("norma1");
			}
		});
		
		button_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//normaPoluare=2;
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+" from Vehicul Veh "
						+" INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+" WHERE Cat.NormaPoluare=2 "
						+" ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea.setText("");
				for(int i = 0; i < nou.strdim; i++){
			       	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			              textArea.append(nou.columnValue[i]+", ");
			    }
				System.out.println("norma2");
			}
		});
		
		button_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//normaPoluare=3;
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+" from Vehicul Veh "
						+" INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+" WHERE Cat.NormaPoluare=3 "
						+" ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea.setText("");
				for(int i = 0; i < nou.strdim; i++){
			       	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			              textArea.append(nou.columnValue[i]+", ");
			    }
				System.out.println("norma3");
			}
		});
		
		button_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//normaPoluare=4;
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+" from Vehicul Veh "
						+" INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+" WHERE Cat.NormaPoluare=4 "
						+" ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea.setText("");
				for(int i = 0; i < nou.strdim; i++){
			       	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			              textArea.append(nou.columnValue[i]+", ");
			    }
				System.out.println("norma4");
			}
		});
		
		button_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//normaPoluare=5;
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+" from Vehicul Veh "
						+" INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+" WHERE Cat.NormaPoluare=5 "
						+" ORDER BY Cat.NormaPoluare ASC";
				 nou.main(null);
				 textArea.setText("");
				 for(int i = 0; i < nou.strdim; i++){
			        	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			               textArea.append(nou.columnValue[i]+", ");
			    }
				System.out.println("norma5");
			}
		});
		
		button_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//normaPoluare=6;
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+" from Vehicul Veh "
						+" INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+" WHERE Cat.NormaPoluare=6 "
						+" ORDER BY Cat.NormaPoluare ASC";
				 nou.main(null);
				 textArea.setText("");
				 for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea.append("\n");
		               textArea.append(nou.columnValue[i]+", ");
		        }
				System.out.println("norma6");
			}
		});
		
		btnEco.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
					+" from Vehicul Veh "
					+" INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
					+" WHERE Cat.NormaPoluare IS NULL "
					+" ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea.append("\n");
		               textArea.append(nou.columnValue[i]+", ");
		        }
				System.out.println("normaEco");
			}
		});
		
		btnBenzina.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
								+"from Vehicul Veh "
								+"INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
								+"WHERE Cat.Motorizare='benzina' "
								+"ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea_1.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_1.append("\n");
		               textArea_1.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
		btnDiesel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+"from Vehicul Veh "
						+"INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+"WHERE Cat.Motorizare='diesel' "
						+"ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea_1.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_1.append("\n");
		               textArea_1.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
		btnElectric.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+"from Vehicul Veh "
						+"INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+"WHERE Cat.Motorizare='electric' "
						+"ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea_1.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_1.append("\n");
		               textArea_1.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
		btnHibrid.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare, Cat.NormaPoluare "
						+"from Vehicul Veh "
						+"INNER JOIN CategorieVehicul Cat ON Veh.CategorieVehiculID=Cat.CategorieVehiculID "
						+"WHERE Cat.Motorizare='hibrid' "
						+"ORDER BY Cat.NormaPoluare ASC";
				nou.main(null);
				textArea_1.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_1.append("\n");
		               textArea_1.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
		btnProvizoriiShort.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare "
						+"from Vehicul Veh "
						+"INNER JOIN Inmatriculare Inm ON Veh.InmatriculareID=Inm.InmatriculareID "
						+"Where Inm.Caracteristici='Provizorii short'";
				nou.main(null);
				textArea_2.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_2.append("\n");
		               textArea_2.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
		btnProvizoriiLong.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare "
						+"from Vehicul Veh "
						+"INNER JOIN Inmatriculare Inm ON Veh.InmatriculareID=Inm.InmatriculareID "
						+"Where Inm.Caracteristici='Provizorii long'";
				nou.main(null);
				textArea_2.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_2.append("\n");
		               textArea_2.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
		btnDefinitiveRandom.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare "
						+"from Vehicul Veh "
						+"INNER JOIN Inmatriculare Inm ON Veh.InmatriculareID=Inm.InmatriculareID "
						+"Where Inm.Caracteristici='Definitive random'";
				nou.main(null);
				textArea_2.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_2.append("\n");
		               textArea_2.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
		btnDefinitiveAlegere.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare "
								+"from Vehicul Veh "
								+"INNER JOIN Inmatriculare Inm ON Veh.InmatriculareID=Inm.InmatriculareID "
								+"Where Inm.Caracteristici='Definitive alegere'";
				nou.main(null);
				textArea_2.setText("");
				for(int i = 0; i < nou.strdim; i++){
		        	if(i%nou.columns==0 && i!=0) textArea_2.append("\n");
		               textArea_2.append(nou.columnValue[i]+", ");
		        }
			}
		});
		
	}

}
