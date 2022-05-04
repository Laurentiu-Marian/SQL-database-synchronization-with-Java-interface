package net.codejava.sql;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;

public class DesprePersoane extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static String Nume;
	public static String Prenume;
	int ok1=0,ok2=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesprePersoane frame = new DesprePersoane();
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
	public DesprePersoane() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JavaToSQLInmatriculari nou = new JavaToSQLInmatriculari();
		
		JTextArea textArea = new JTextArea();
		
		JTextArea textArea_1 = new JTextArea();
		
		JButton btnOk1 = new JButton("OK");
		
		JButton btnOk2 = new JButton("OK");
		
		JTextArea textArea_2 = new JTextArea();
		
		JButton btnComanda1 = new JButton("De Plata");
		
		JLabel lblNume = new JLabel("Nume:");
		lblNume.setFont(new Font("Garamond", Font.BOLD, 15));
		
		JLabel lblPrenume = new JLabel("Prenume:");
		lblPrenume.setFont(new Font("Garamond", Font.BOLD, 15));
		
		JButton btnComanda2 = new JButton("Masini Detinute");
		
		JButton btnComanda3 = new JButton("Taxe");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNume)
								.addComponent(lblPrenume, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
										.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
									.addGap(56)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnComanda3)
										.addComponent(btnComanda2)
										.addComponent(btnComanda1)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(93)
							.addComponent(btnOk1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(270))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(95)
							.addComponent(btnOk2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(16)
					.addComponent(lblNume)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnComanda1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnOk1, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
						.addComponent(btnComanda2))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblPrenume, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnOk2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addComponent(btnComanda3)))
					.addGap(27))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
		
		
		btnOk1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(textArea.getText().trim().length()>1) {
					System.out.print("ocupat\n");
					Nume=textArea.getText();
					ok1=1;
				}
				else {
					System.out.print("liber\n");
					ok1=0;
				}
				
				System.out.print(Nume);
			}
		});
		//btnComanda3.setEnabled(false);
		btnOk2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(textArea_1.getText().trim().length()>1) {
					System.out.print("ocupat\n");
					Prenume=textArea_1.getText();
					ok2=1;
					//btnComanda3.setEnabled(true);
				}
				else {
					System.out.print("liber\n");
					ok2=0;
					//btnComanda3.setEnabled(false);
				}
				
				System.out.print(Prenume);
			}
		});
		
		btnComanda1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(ok1==1 && ok2==1){
					
					nou.sqlQuery="select Prop.Nume, Prop.Prenume, SUM(T.Valoare) AS Costuri, COUNT(TP.ProprietarID) AS NumarVehicule "
										+"from Proprietari Prop INNER JOIN TaxeProprietari TP ON (Prop.ProprietarID=TP.ProprietarID) "
										+"INNER JOIN Taxe T ON (TP.TaxeID=T.TaxeID) "
										+"where Prop.Nume='" + Nume + "' AND Prop.Prenume= '" + Prenume
										+"' group by Prop.ProprietarID, Prop.Nume, Prop.Prenume "
										+"order by Prop.ProprietarID ASC ";
					nou.main(null);
					
					textArea_2.setText("");
					for(int i=0; i<nou.columns; i++){
						textArea_2.append(nou.columnsName[i]);
						if(i!=nou.columns-1) textArea_2.append("-");
					}
					textArea_2.append("\n");
					for(int i = 0; i < nou.strdim; i++){
				       	if(i%nou.columns==0 && i!=0) textArea_2.append("\n");
				              textArea_2.append(nou.columnValue[i]+", ");
				    }
					//textArea.setText("");
					//textArea_1.setText("");
					ok1=0;
					ok2=0;
				}
				else textArea_2.setText("");
			}
		});
		
		btnComanda2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(ok1==1 && ok2==1){
					
					nou.sqlQuery="select Veh.Marca, Veh.Model, Veh.NumarInmatriculare "
										+"from Vehicul Veh,  "
										+"(select Prop.ProprietarID "
										+"from Proprietari Prop "
										+"where Prop.Nume='" + Nume + "' AND Prop.Prenume= '" + Prenume +"') AS Slc "
										+"where Veh.ProprietarID=Slc.ProprietarID ";
					
					nou.main(null);
					
					textArea_2.setText("");
					for(int i=0; i<nou.columns; i++){
						textArea_2.append(nou.columnsName[i]);
						if(i!=nou.columns-1) textArea_2.append("-");
					}
					textArea_2.append("\n");
					for(int i = 0; i < nou.strdim; i++){
				       	if(i%nou.columns==0 && i!=0) textArea_2.append("\n");
				              textArea_2.append(nou.columnValue[i]+", ");
				    }
					//textArea.setText("");
					//textArea_1.setText("");
					ok1=0;
					ok2=0;
				}
				else textArea_2.setText("");
			}
		});
		
		btnComanda3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(ok1==1 && ok2==1){
					
					nou.sqlQuery="select distinct TP.Platit, Veh.NumarInmatriculare "
										+"from (select Prop.ProprietarID "
										+"from Proprietari Prop "
										+"where Prop.Nume='" + Nume + "' AND Prop.Prenume= '" + Prenume +"') Slc "
										+"INNER JOIN TaxeProprietari TP ON Slc.ProprietarID=TP.ProprietarID "
										+"INNER JOIN Vehicul Veh ON TP.ProprietarID=Veh.ProprietarID";
					nou.main(null);
					
					textArea_2.setText("");
					for(int i=0; i<nou.columns; i++){
						textArea_2.append(nou.columnsName[i]);
						if(i!=nou.columns-1) textArea_2.append("-");
					}
					textArea_2.append("\n");
					for(int i = 0; i < nou.strdim; i++){
				       	if(i%nou.columns==0 && i!=0) textArea_2.append("\n");
				              textArea_2.append(nou.columnValue[i]+", ");
				    }
					//textArea.setText("");
					//textArea_1.setText("");
					ok1=0;
					ok2=0;
				}
				else textArea_2.setText("");
			}
		});
		
		
	}
}
