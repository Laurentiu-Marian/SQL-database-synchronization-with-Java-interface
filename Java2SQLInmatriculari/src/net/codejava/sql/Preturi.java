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
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Preturi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preturi frame = new Preturi();
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
	public Preturi() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblListaDePreturi = new JLabel("Lista de preturi pentru fiecare motorizare si norma de poluare");
		lblListaDePreturi.setFont(new Font("Garamond", Font.BOLD, 15));
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblListaDePreturi, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
							.addGap(47))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblListaDePreturi, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
		
		JavaToSQLInmatriculari nou = new JavaToSQLInmatriculari();
		
		nou.sqlQuery="select T.CategorieVehiculID AS CodTaxa, T.Valoare, Cat.Motorizare, Cat.NormaPoluare "
						+"from Taxe T "
						+"INNER JOIN CategorieVehicul Cat ON T.CategorieVehiculID=Cat.CategorieVehiculID "
						+"ORDER BY T.CategorieVehiculID ASC";
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
}
