package net.codejava.sql;

import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaToSQLInmatriculari {
		
		public static int strdim;
		public static int columns;
		public static String[] columnValue;
		public static String sqlQuery;
		public static String[] columnsName;
		
		public static String[] vecProprietarID;
		public static String[] vecNume;
		public static String[] vecPrenume;
		public static String[] vecCNP;
		public static String[] vecAdresa;
		public static String[] vecTelefon;
		
		public static int strdimVehicule;
		public static int[] vecVehiculID;
		public static int[] vecProprietarID2;
		public static String[] vecMarca;
		public static String[] vecModel;
		public static int[] vecCategorie;
		public static String[] vecNumarInm;
		public static int[] vecInmatriculareID2;
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url =  "jdbc:sqlserver://" +"DESKTOP-2QE8A4D\\SQLEXPRESS" + ":1433;DatabaseName=" + "InmatriculariVehicule" + ";encrypt=true;trustServerCertificate=true;";
		String username = "sa";
		String password = "5595";
		try{
			
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexiunea la baza de date s-a realizat cu succes");
			
			Statement statementProprietari = connection.createStatement();
			ResultSet resultQuerry = statementProprietari.executeQuery(sqlQuery);
			
			vecProprietarID= new String[100];
			vecNume = new String[100];
			vecPrenume = new String[100];
			vecCNP = new String[100];
			vecAdresa = new String[100];
			vecTelefon = new String[100];
			columnValue = new String[100];
			columnsName= new String[100];
			
			ResultSetMetaData rsmd = resultQuerry.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			int j=0,row=0,nrCol=1;
			columns=columnsNumber;
			while(resultQuerry.next()){                           // WHILE PENTRU AFISARE
				for(int i=1;i<=columnsNumber;i++){
					if(nrCol<=columnsNumber){
						columnsName[nrCol-1]=rsmd.getColumnName(nrCol);
						nrCol++;
					}
					
					 if (i > 1) System.out.print(",  ");
				        columnValue[j] = resultQuerry.getString(i);
				        System.out.print(columnValue[j]);	
				        j++;
				}
				System.out.println("");
				row++;
				
			}
			int i=0;
			System.out.printf("%d\n%d\n%d\n",j,row,columns);
			strdim=j;
			
		}catch (SQLException e){
			System.out.println("OPA ESTI PROST");
			e.printStackTrace();
			}
		
		
		
	}
	
			
}