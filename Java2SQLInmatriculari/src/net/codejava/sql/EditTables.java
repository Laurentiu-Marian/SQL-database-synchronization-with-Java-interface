package net.codejava.sql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JButton;

public class EditTables extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static String Nume;
	public static String Prenume;
	public static String CNP;
	public static String Adresa;
	public static String Telefon;
	public static String CNP_search;
	
	public static String CNPv;
	public static String Marca;
	public static String Model;
	public static String CodTaxa;
	public static String NumarInmatriculare;
	public static String NumarInmatriculare_search;
	
	public static String PropID[];
	public static String TaxeID[];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditTables frame = new EditTables();
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
	
	public EditTables() {
		setBackground(new Color(255, 240, 245));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JavaToSQLInmatriculari nou = new JavaToSQLInmatriculari();
		
		
		JLabel lblEditareTabelProprietari = new JLabel("Editare Tabel Proprietari");
		lblEditareTabelProprietari.setFont(new Font("Garamond", Font.ITALIC, 18));
		
		JLabel lblEditareTabelVehicule = new JLabel("Editare Tabel Vehicule");
		lblEditareTabelVehicule.setFont(new Font("Garamond", Font.ITALIC, 18));
		
		JTextArea txtNumeProp = new JTextArea();
		
		JTextArea txtPrenumeProp = new JTextArea();
		
		JTextArea txtCnpProp = new JTextArea();
		
		JTextArea txtAdresaProp = new JTextArea();
		
		JTextArea txtTelefonProp = new JTextArea();
		
		JLabel lblNume = new JLabel("Nume:");
		
		JLabel lblPrenume = new JLabel("Prenume:");
		
		JLabel lblCnp = new JLabel("CNP:");
		
		JLabel lblAdresa = new JLabel("Adresa:");
		
		JLabel lblTelefon = new JLabel("Telefon:");
		
		JRadioButton rdbtnNume = new JRadioButton("Nume");
		rdbtnNume.setBackground(new Color(255, 240, 245));
		rdbtnNume.setActionCommand("Nume");
		
		JRadioButton rdbtnPrenume = new JRadioButton("Prenume");
		rdbtnPrenume.setBackground(new Color(255, 240, 245));
		rdbtnPrenume.setActionCommand("Prenume");
		
		JRadioButton rdbtnCnp = new JRadioButton("CNP");
		rdbtnCnp.setBackground(new Color(255, 240, 245));
		rdbtnCnp.setActionCommand("CNP");
		
		JRadioButton rdbtnAdresa = new JRadioButton("Adresa");
		rdbtnAdresa.setBackground(new Color(255, 240, 245));
		rdbtnAdresa.setActionCommand("Adresa");
		
		JRadioButton rdbtnTelefon = new JRadioButton("Telefon");
		rdbtnTelefon.setBackground(new Color(255, 240, 245));
		rdbtnTelefon.setActionCommand("Telefon");
		
		ButtonGroup buttongroupP = new ButtonGroup();
		buttongroupP.add(rdbtnNume);
		buttongroupP.add(rdbtnPrenume);
		buttongroupP.add(rdbtnCnp);
		buttongroupP.add(rdbtnAdresa);
		buttongroupP.add(rdbtnTelefon);
		
		JButton btnInsertP = new JButton("Insert");
		
		JButton btnUpdateP = new JButton("Update");
		
		JButton btnDeleteP = new JButton("Delete");
		
		JLabel lbldeleteIncludeToate = new JLabel("*delete include toate tabelele ascoiate (TaxeProprietari+Vehicule)");
		
		JLabel lblAdicaToateInformatiile = new JLabel("adica toate informatiile despre persoana stearsa vor disparea");
		
		JLabel lblCnpProprietar = new JLabel("CNP Proprietar:");
		
		JLabel lblMarca = new JLabel("Marca:");
		
		JLabel lblModel = new JLabel("Model");
		
		JLabel lblCodTaxa = new JLabel("Cod Taxa:");
		
		JLabel lblNumarInmatriculare = new JLabel("Numar Inmatriculare:");
		
		JLabel lblTipInmatriculare = new JLabel("Tip Inmatriculare:");
		
		JRadioButton rdbtnProvizoriiTermenScurt = new JRadioButton("Provizorii termen scurt");
		rdbtnProvizoriiTermenScurt.setBackground(new Color(255, 240, 245));
		rdbtnProvizoriiTermenScurt.setActionCommand("PTS");
		
		JRadioButton rdbtnProvizoriiTermenLung = new JRadioButton("Provizorii termen lung");
		rdbtnProvizoriiTermenLung.setBackground(new Color(255, 240, 245));
		rdbtnProvizoriiTermenLung.setActionCommand("PTL");
		
		JRadioButton rdbtnDefinitiveLaIntamplare = new JRadioButton("Definitive la intamplare");
		rdbtnDefinitiveLaIntamplare.setBackground(new Color(255, 240, 245));
		rdbtnDefinitiveLaIntamplare.setActionCommand("DLI");
		
		JRadioButton rdbtnDefinitiveLaAlegere = new JRadioButton("Definitive la alegere");
		rdbtnDefinitiveLaAlegere.setBackground(new Color(255, 240, 245));
		rdbtnDefinitiveLaAlegere.setActionCommand("DLA");
		
		ButtonGroup buttongroupTip = new ButtonGroup();
		buttongroupTip.add(rdbtnProvizoriiTermenScurt);
		buttongroupTip.add(rdbtnProvizoriiTermenLung);
		buttongroupTip.add(rdbtnDefinitiveLaIntamplare);
		buttongroupTip.add(rdbtnDefinitiveLaAlegere);
		
		JTextArea txtCnpPV = new JTextArea();
		
		JTextArea txtMarcaV = new JTextArea();
		
		JTextArea txtModelV = new JTextArea();
		
		JTextArea txtCodTaxaV = new JTextArea();
		
		JTextArea txtNrInmatrV = new JTextArea();
		
		JRadioButton rdbtnMarca = new JRadioButton("Marca");
		rdbtnMarca.setBackground(new Color(255, 240, 245));
		rdbtnMarca.setActionCommand("Marca");
		
		JRadioButton rdbtnModel = new JRadioButton("Model");
		rdbtnModel.setBackground(new Color(255, 240, 245));
		rdbtnModel.setActionCommand("Model");
		
		JRadioButton rdbtnCodtaxa = new JRadioButton("CodTaxa");
		rdbtnCodtaxa.setBackground(new Color(255, 240, 245));
		rdbtnCodtaxa.setActionCommand("Cod");
		
		JRadioButton rdbtnNumarinmatriculare = new JRadioButton("NumarInmatriculare");
		rdbtnNumarinmatriculare.setBackground(new Color(255, 240, 245));
		rdbtnNumarinmatriculare.setActionCommand("Numar");
		
		ButtonGroup buttongroupV = new ButtonGroup();
		buttongroupV.add(rdbtnMarca);
		buttongroupV.add(rdbtnModel);
		buttongroupV.add(rdbtnCodtaxa);
		buttongroupV.add(rdbtnNumarinmatriculare);
		
		JButton btnInsertV = new JButton("Insert");
		
		JButton btnUpdateV = new JButton("Update");
		
		JButton btnDeleteV = new JButton("Delete");
		
		JTextArea txtUpdateProp = new JTextArea();
		
		JLabel lblPentruUpdateCautarea = new JLabel("Pentru Update/Delete cautarea se face dupa CNP");
		
		JLabel lblIntroducetiMaiJos = new JLabel("introduceti mai jos CNP-ul persoanei cautate");
			
		JTextArea txtUpdateVeh = new JTextArea();
		
		JLabel lblIntroducetiMaiJos_1 = new JLabel("introduceti mai jos Numarul de Inmatriculare al masinii cautate");
		
		JLabel lblPlatitiTaxaAcum = new JLabel("Platiti Taxa acum?");
		
		JRadioButton rdbtnDa = new JRadioButton("Da");
		rdbtnDa.setBackground(new Color(255, 240, 245));
		rdbtnDa.setActionCommand("Da");
		
		JRadioButton rdbtnNu = new JRadioButton("Nu");
		rdbtnNu.setBackground(new Color(255, 240, 245));
		rdbtnNu.setActionCommand("Nu");
		
		ButtonGroup buttongroupDaNu = new ButtonGroup();
		buttongroupDaNu.add(rdbtnDa);
		buttongroupDaNu.add(rdbtnNu);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblEditareTabelProprietari, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(370)
					.addComponent(lblEditareTabelVehicule, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(289))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbldeleteIncludeToate)
					.addContainerGap(655, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPentruUpdateCautarea)
					.addContainerGap(733, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNume)
								.addComponent(lblPrenume)
								.addComponent(lblCnp)
								.addComponent(lblAdresa)
								.addComponent(lblTelefon))
							.addGap(51)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtTelefonProp, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAdresaProp, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCnpProp, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPrenumeProp, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNumeProp, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNume)
								.addComponent(rdbtnPrenume)
								.addComponent(rdbtnCnp)
								.addComponent(rdbtnAdresa)
								.addComponent(rdbtnTelefon)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnInsertP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpdateP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDeleteP))
						.addComponent(lblAdicaToateInformatiile)
						.addComponent(txtUpdateProp, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIntroducetiMaiJos))
					.addGap(128)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIntroducetiMaiJos_1)
						.addComponent(txtUpdateVeh, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblModel)
						.addComponent(lblCodTaxa)
						.addComponent(lblNumarInmatriculare)
						.addComponent(lblTipInmatriculare)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnProvizoriiTermenScurt)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnProvizoriiTermenLung))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCnpProprietar)
								.addComponent(lblMarca))
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtMarcaV, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnMarca))
								.addComponent(txtCnpPV, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtModelV, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnModel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtCodTaxaV, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnCodtaxa))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtNrInmatrV, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblPlatitiTaxaAcum)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnNu)
												.addComponent(rdbtnDa)))
										.addComponent(rdbtnNumarinmatriculare)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnInsertV, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpdateV, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDeleteV, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnDefinitiveLaIntamplare)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnDefinitiveLaAlegere)))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEditareTabelProprietari)
						.addComponent(lblEditareTabelVehicule, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNume)
						.addComponent(txtNumeProp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNume)
						.addComponent(lblCnpProprietar)
						.addComponent(txtCnpPV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrenume)
						.addComponent(rdbtnPrenume)
						.addComponent(txtPrenumeProp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMarcaV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnMarca)
						.addComponent(lblMarca))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCnp)
						.addComponent(rdbtnCnp)
						.addComponent(txtCnpProp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblModel)
						.addComponent(txtModelV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnModel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdresa)
						.addComponent(rdbtnAdresa)
						.addComponent(txtAdresaProp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodTaxa)
						.addComponent(txtCodTaxaV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnCodtaxa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefon)
						.addComponent(rdbtnTelefon)
						.addComponent(txtTelefonProp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumarInmatriculare)
						.addComponent(txtNrInmatrV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNumarinmatriculare))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnInsertP)
								.addComponent(btnUpdateP)
								.addComponent(btnDeleteP)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTipInmatriculare)
								.addComponent(lblPlatitiTaxaAcum)
								.addComponent(rdbtnDa))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(rdbtnProvizoriiTermenLung)
									.addComponent(rdbtnNu))
								.addComponent(rdbtnProvizoriiTermenScurt))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnDefinitiveLaAlegere)
								.addComponent(rdbtnDefinitiveLaIntamplare))))
					.addGap(6)
					.addComponent(lbldeleteIncludeToate)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInsertV)
						.addComponent(btnUpdateV)
						.addComponent(btnDeleteV)
						.addComponent(lblAdicaToateInformatiile))
					.addGap(27)
					.addComponent(lblPentruUpdateCautarea)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIntroducetiMaiJos)
						.addComponent(lblIntroducetiMaiJos_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtUpdateProp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUpdateVeh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(239, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
		
		
		
		btnInsertP.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(txtNumeProp.getText().trim().length()>1
					&& txtPrenumeProp.getText().trim().length()>1
					&& txtCnpProp.getText().trim().length()>1
					&& txtAdresaProp.getText().trim().length()>1
					&& txtTelefonProp.getText().trim().length()>1
					)
				{
					Nume=txtNumeProp.getText();

					Prenume=txtPrenumeProp.getText();
					
					CNP=txtCnpProp.getText();
					
					Adresa=txtAdresaProp.getText();
					
					Telefon=txtTelefonProp.getText();
					
					nou.sqlQuery="insert into Proprietari (Nume, Prenume, CNP, Adresa, Telefon) "+
									" values('"+Nume+"','"+Prenume+"',"+CNP+", '"+Adresa+"','"+Telefon+"')"	;
					nou.main(null);
										
				}
								
			}
		});
		
		btnUpdateP.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(txtUpdateProp.getText().trim().length()>1)
				{
					CNP_search=txtUpdateProp.getText();
										
					System.out.print(buttongroupP.getSelection().getActionCommand());
					
					switch(buttongroupP.getSelection().getActionCommand()){
					case "Nume":
						System.out.print("n\n");
						if(txtNumeProp.getText().trim().length()>1){
							System.out.print(Nume);
							Nume=txtNumeProp.getText();
							nou.sqlQuery="update Proprietari set Nume= '"+Nume
											+"' where CNP="+CNP_search;
							nou.main(null);
						}
						break;
					case "Prenume":
						System.out.print("p\n");
						if(txtPrenumeProp.getText().trim().length()>1){
							System.out.print("\n update prenume \n");
							Prenume=txtPrenumeProp.getText();
							nou.sqlQuery="update Proprietari set Prenume= '"+Prenume
											+"' where CNP="+CNP_search;
							nou.main(null);
						}
						break;
					case "CNP":
						System.out.print("c\n");
						if(txtCnpProp.getText().trim().length()>1){
							System.out.print("\n update cnp \n");
							CNP=txtCnpProp.getText();
							nou.sqlQuery="update Proprietari set CNP= '"+CNP
											+"' where CNP="+CNP_search;
							nou.main(null);
						}
						break;
					case "Adresa":
						System.out.print("a\n");
						if(txtAdresaProp.getText().trim().length()>1){
							System.out.print("\n update adresa \n");
							Adresa=txtAdresaProp.getText();
							nou.sqlQuery="update Proprietari set Adresa= '"+Adresa
											+"' where CNP="+CNP_search;
							nou.main(null);
						}
						break;
					case "Telefon":
						System.out.print("t\n");
						if(txtTelefonProp.getText().trim().length()>1){
							System.out.print("\n update telefon \n");
							Telefon=txtTelefonProp.getText();
							nou.sqlQuery="update Proprietari set Telefon= '"+Telefon
											+"' where CNP="+CNP_search;
							nou.main(null);
						}
						break;
					default:
						System.out.print("nimic\n");
					}
				}
						
			}
		});
		
		btnDeleteP.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(txtUpdateProp.getText().trim().length()>1)
				{
					CNP_search=txtUpdateProp.getText();
					
					nou.sqlQuery="delete from Proprietari where CNP="+CNP_search ;
				
					nou.main(null);
				}
						
			}
		});
		
		
		
		
		btnInsertV.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(txtCnpPV.getText().trim().length()>1
					&& txtMarcaV.getText().trim().length()>1
					&& txtModelV.getText().trim().length()>1
					&& txtCodTaxaV.getText().trim().length()>1
					&& txtNrInmatrV.getText().trim().length()>1
					&& buttongroupTip.getSelection().getActionCommand()!=null
					&& buttongroupDaNu.getSelection().getActionCommand()!=null
					)
				{
					CNPv=txtCnpPV.getText();

					Marca=txtMarcaV.getText();
					
					Model=txtModelV.getText();
					
					CodTaxa=txtCodTaxaV.getText();
					
					NumarInmatriculare=txtNrInmatrV.getText();
					//////////////////
					String Tip="1";
					String DaNu="NU";
										
					switch(buttongroupTip.getSelection().getActionCommand()){
					case "PTS":
						Tip="1";
						break;
					case "PTL":
						Tip="2";
						break;
					case "DLI":
						Tip="3";
						break;
					case "DLA":
						Tip="4";
						break;
					default:
						System.out.print("nimic\n");
					}
					
					switch(buttongroupDaNu.getSelection().getActionCommand()){
					case "Da":
						DaNu="DA";
						break;
					case "Nu":
						DaNu="NU";
						break;
					default:
						System.out.print("nimic\n");
					}
					/////////////////////	
					nou.sqlQuery="select ProprietarID from Proprietari where CNP="+CNPv+";";
					nou.main(null);
					PropID=new String[1];
					PropID[0]=nou.columnValue[0];
					
					nou.sqlQuery="insert into Vehicul (ProprietarID, Marca, Model, CategorieVehiculID, NumarInmatriculare, InmatriculareID) "+
							" values( "+PropID[0]+", '"+Marca+"', '"+Model+"' ,"+CodTaxa+", '"+NumarInmatriculare+"',"+Tip+");";
					nou.main(null);		
					
					nou.sqlQuery=" insert into TaxeProprietari(ProprietarID, TaxeID, Platit) values ("+PropID[0]+","+CodTaxa+",'"+DaNu+"');";
					nou.main(null);
										
				}
				
					System.out.print(buttongroupTip.getSelection().getActionCommand());
					System.out.print("\n");
					System.out.print(buttongroupDaNu.getSelection().getActionCommand());
					System.out.print("\n");	
												
			}
		});
		
		btnUpdateV.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(txtUpdateVeh.getText().trim().length()>1)
				{
					NumarInmatriculare_search=txtUpdateVeh.getText();
					
					/*nou.sqlQuery="select Nume,Prenume,CNP,Adresa,Telefon "
							+"from Proprietari";
					nou.main(null);
					*/
					//buttongroupP.getSelection().getActionCommand();
					
					System.out.print(buttongroupV.getSelection().getActionCommand());
					
					switch(buttongroupV.getSelection().getActionCommand()){
					case "Marca":
						if(txtMarcaV.getText().trim().length()>1){
							Marca=txtMarcaV.getText();
							
							nou.sqlQuery="update Vehicul set Marca= '"+Marca
											+"' where NumarInmatriculare= '"+NumarInmatriculare_search+"'" ;
							nou.main(null);
						}
						break;
					case "Model":
						if(txtModelV.getText().trim().length()>1){
							Model=txtModelV.getText();
	
							nou.sqlQuery="update Vehicul set Model= '"+Model
									+"' where NumarInmatriculare= '"+NumarInmatriculare_search+"'" ;
							nou.main(null);
						}
						break;
					case "Cod":
						if(txtCodTaxaV.getText().trim().length()>1){
							CodTaxa=txtCodTaxaV.getText();
							
							nou.sqlQuery="update Vehicul set CategorieVehiculID= '"+CodTaxa
									+"' where NumarInmatriculare= '"+NumarInmatriculare_search+"'" ;
							nou.main(null);
						}
						break;
					case "Numar":
						if(txtNrInmatrV.getText().trim().length()>1){
							NumarInmatriculare=txtNrInmatrV.getText();
							
							nou.sqlQuery="update Vehicul set NumarInmatriculare= '"+NumarInmatriculare
									+"' where NumarInmatriculare= '"+NumarInmatriculare_search+"'" ;
							nou.main(null);
						}
						break;
					default:
						System.out.print("nimic\n");
					}
				}
						
			}
		});
		
		btnDeleteV.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(txtUpdateVeh.getText().trim().length()>1)
				{
					NumarInmatriculare_search=txtUpdateVeh.getText();
					
					nou.sqlQuery="select ProprietarID from Vehicul where NumarInmatriculare='"+NumarInmatriculare_search+"' ;";
					nou.main(null);
					PropID=new String[1];
					PropID[0]=nou.columnValue[0];
					nou.sqlQuery="select CategorieVehiculID from Vehicul where NumarInmatriculare='"+NumarInmatriculare_search+"' ;";
					nou.main(null);
					TaxeID=new String[1];
					TaxeID[0]=nou.columnValue[0];
					
					nou.sqlQuery="delete from Vehicul where NumarInmatriculare='"+NumarInmatriculare_search+"' ;"+
									"delete from TaxeProprietari where ProprietarID="+PropID[0]+" AND TaxeID="+TaxeID[0];
					nou.main(null);
				}
						
			}
		});
		
	}
}
