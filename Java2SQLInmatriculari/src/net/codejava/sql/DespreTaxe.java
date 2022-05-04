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

public class DespreTaxe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DespreTaxe frame = new DespreTaxe();
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
	public DespreTaxe() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JavaToSQLInmatriculari nou = new JavaToSQLInmatriculari();
		
		JTextArea textArea = new JTextArea();
		
		JButton btnListaPlatilor = new JButton("<html>Lista platilor<br>deja facute</html>");
		
		JButton btnBaniiIncasati = new JButton("<html>Banii incasati<br>pana in prezent</html>");
		
		JButton btnSituatiaPeOrase = new JButton("<html>Situatia<br>pe orase</html>");
		
		JLabel lbloraseleCuCel = new JLabel("<html>*Orasele cu cel<br> putin o taxa platita<br>+totalul de vehicule</html>");
		lbloraseleCuCel.setFont(new Font("Tahoma", Font.ITALIC, 10));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(66, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnListaPlatilor)
						.addComponent(btnSituatiaPeOrase)
						.addComponent(lbloraseleCuCel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBaniiIncasati, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
					.addGap(50)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addComponent(btnListaPlatilor)
							.addGap(93)
							.addComponent(btnBaniiIncasati)
							.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
							.addComponent(btnSituatiaPeOrase)
							.addGap(5)
							.addComponent(lbloraseleCuCel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
		
		btnListaPlatilor.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Prop.Nume, Prop.Prenume, Prop.CNP "
				+"from Proprietari Prop, TaxeProprietari TP "
				+"where Prop.ProprietarID=TP.ProprietarID AND TP.TaxeID IN "
				+"(select TP.TaxeID from TaxeProprietari TP "
				+"where TP.Platit='DA')";
				nou.main(null);
				textArea.setText("");
				for(int i=0; i<nou.columns; i++){
					textArea.append(nou.columnsName[i]);
					if(i!=nou.columns-1) textArea.append("-");
				}
				textArea.append("\n");
				for(int i = 0; i < nou.strdim; i++){
			       	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			              textArea.append(nou.columnValue[i]+", ");
			    }
			}
		});
		
		btnBaniiIncasati.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select count(TP.ProprietarID) AS NrProp, SUM(case when TP.Platit='DA' then T.Valoare end) AS Total, "
						+ "count(case when TP.Platit='DA' then 1 end) AS Platite, "
						+ "count(case when TP.Platit='NU' then 1 end) AS Neplatite "
						+"from TaxeProprietari TP "
						+"INNER JOIN Taxe T ON T.TaxeID=TP.TaxeID";
				nou.main(null);
				textArea.setText("");
				for(int i=0; i<nou.columns; i++){
					textArea.append(nou.columnsName[i]);
					if(i!=nou.columns-1) textArea.append("-");
				}
				textArea.append("\n");
				for(int i = 0; i < nou.strdim; i++){
			       	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			              textArea.append(nou.columnValue[i]+", ");
			    }
			}
		});
		
		btnSituatiaPeOrase.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nou.sqlQuery="select Prop.Adresa AS Oras, COUNT(Prop.Adresa) AS VehiculeDinOras "
								+"from Proprietari Prop "
								+"where Prop.ProprietarID IN "
								+"(select TP.ProprietarID from TaxeProprietari TP where TP.Platit='DA') "
								+"group by Prop.Adresa ";
				nou.main(null);
				textArea.setText("");
				for(int i=0; i<nou.columns; i++){
					textArea.append(nou.columnsName[i]);
					if(i!=nou.columns-1) textArea.append("-");
				}
				textArea.append("\n");
				for(int i = 0; i < nou.strdim; i++){
			       	if(i%nou.columns==0 && i!=0) textArea.append("\n");
			              textArea.append(nou.columnValue[i]+", ");
			              //textArea.getText().trim().length();
			    }
			}
		});
		
	
	}
}
