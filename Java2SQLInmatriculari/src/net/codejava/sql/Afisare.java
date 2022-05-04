package net.codejava.sql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.sql.ResultSet;

public class Afisare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afisare frame = new Afisare();
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
	public Afisare() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
        JFrame f= new JFrame();
		
		JavaToSQLInmatriculari nou = new JavaToSQLInmatriculari();
        
        nou.main(null);
        
        int i;
        JTextArea area = new JTextArea();
        area.setBounds(10,30, 950,950);
        contentPane.add(area);
        contentPane.setSize(800,800);
        contentPane.setLayout(null);
        contentPane.setVisible(true);
        
        area.setText("");
		for(i=0; i<nou.columns; i++){
			area.append(nou.columnsName[i]);
			if(i!=nou.columns-1) area.append("-");
		}
		area.append("\n");
        
        for(i = 0; i < nou.strdim; i++){
        	if(i%nou.columns==0 && i!=0) area.append("\n");
               area.append(nou.columnValue[i]+", ");
        }
	}

}