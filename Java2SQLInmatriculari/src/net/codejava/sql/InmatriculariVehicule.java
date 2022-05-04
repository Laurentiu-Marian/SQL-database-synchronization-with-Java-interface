package net.codejava.sql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;

public class InmatriculariVehicule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InmatriculariVehicule frame = new InmatriculariVehicule();
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
	public InmatriculariVehicule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		
		JavaToSQLInmatriculari nou = new JavaToSQLInmatriculari();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAllDataTables = new JMenu("All Data Tables");
		menuBar.add(mnAllDataTables);
		
		JMenuItem mntmProprietari = new JMenuItem("Proprietari");
		mntmProprietari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        nou.sqlQuery="SELECT * FROM Proprietari";
				Afisare obj1=new Afisare();
				obj1.main(null);
				
			}
		});
		mnAllDataTables.add(mntmProprietari);
		
		JMenuItem mntmVehicul = new JMenuItem("Vehicule");
		mntmVehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nou.sqlQuery="SELECT * FROM Vehicul";
				Afisare obj2=new Afisare();
				obj2.main(null);
			}
		});
		mnAllDataTables.add(mntmVehicul);
		
		JMenuItem mntmInmatriculare = new JMenuItem("Inmatriculare");
		mntmInmatriculare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nou.sqlQuery="SELECT * FROM Inmatriculare";
				Afisare obj3=new Afisare();
				obj3.main(null);
			}
		});
		mnAllDataTables.add(mntmInmatriculare);
		
		JMenuItem mntmCategorieVehicul = new JMenuItem("CategorieVehicul");
		mntmCategorieVehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nou.sqlQuery="SELECT * FROM CategorieVehicul";
				Afisare obj4=new Afisare();
				obj4.main(null);
			}
		});
		mnAllDataTables.add(mntmCategorieVehicul);
		
		JMenuItem mntmTaxe = new JMenuItem("Taxe");
		mntmTaxe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nou.sqlQuery="SELECT * FROM Taxe";
				Afisare obj5=new Afisare();
				obj5.main(null);
			}
		});
		mnAllDataTables.add(mntmTaxe);
		
		JMenuItem mntmProprietariTaxe = new JMenuItem("ProprietariTaxe");
		mntmProprietariTaxe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nou.sqlQuery="SELECT * FROM TaxeProprietari";
				Afisare obj6=new Afisare();
				obj6.main(null);
			}
		});
		mnAllDataTables.add(mntmProprietariTaxe);
		
		JMenuItem mntmEdittables = new JMenuItem("EditTables");
		mntmEdittables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//nou.sqlQuery=" ";
				EditTables obj6=new EditTables();
				obj6.main(null);
			}
		});
		mnAllDataTables.add(mntmEdittables);
		
		JMenu mnCautare = new JMenu("Cautare");
		menuBar.add(mnCautare);
		
		JMenuItem mntmCautariPentruVehicule = new JMenuItem("Cautari pentru vehicule");
		mntmCautariPentruVehicule.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Cautare obj7=new Cautare();
				obj7.main(null);
				
			}
		});
		mnCautare.add(mntmCautariPentruVehicule);
		
		JMenu mnPreturi = new JMenu("Preturi");
		menuBar.add(mnPreturi);
		
		JMenuItem mntmAfiseazaLista = new JMenuItem("Afiseaza lista");
		mntmAfiseazaLista.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Preturi obj8=new Preturi();
				obj8.main(null);
			}
		});
		mnPreturi.add(mntmAfiseazaLista);
		
		JMenu mnDespreTaxe = new JMenu("Despre Taxe");
		menuBar.add(mnDespreTaxe);
		
		JMenuItem mntmAfiseazaInformatiile = new JMenuItem("Afiseaza informatiile");
		mntmAfiseazaInformatiile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				DespreTaxe obj9=new DespreTaxe();
				obj9.main(null);
			}
		});
		mnDespreTaxe.add(mntmAfiseazaInformatiile);
		
		JMenu mnDesprePersoane = new JMenu("Despre Persoane");
		menuBar.add(mnDesprePersoane);
		
		JMenuItem mntmCautaInformatii = new JMenuItem("Cauta Informatii");
		mntmCautaInformatii.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				DesprePersoane obj10=new DesprePersoane();
				obj10.main(null);
			}
		});
		mnDesprePersoane.add(mntmCautaInformatii);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmInchideTotul = new JMenuItem("Inchide totul");
		mntmInchideTotul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnExit.add(mntmInchideTotul);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblServiculDeInmatriculare = new JLabel("Servicul de Inmatriculare a Vehiculelor");
		lblServiculDeInmatriculare.setFont(new Font("Copperplate Gothic Light", Font.BOLD | Font.ITALIC, 24));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addComponent(lblServiculDeInmatriculare, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(66)
					.addComponent(lblServiculDeInmatriculare, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
