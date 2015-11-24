package main;
import java.util.Scanner;
//import java.util.InputMismatchException;
//import java.util.NoSuchElementException;
import vector.*;


public class Main {
	
	public static double getCoordinate(int j,int i,Scanner read)
	{
		
		while(true)
		{
			try
			{
				System.out.println("podaj "+(j+1) +". wspolrzedna "+i+". wektora: ");
				double c = read.nextDouble();
				return c;
				
			}
			catch(Exception e)
			{
				System.out.println("wprowadziles bledne dane!"+e.getMessage());
				read.next();
			}
			
		}
		
	}
	
	public static int getDim(Scanner read)
	{
		while(true)
		{
			try
			{
				System.out.println("podaj wymiar wektora: ");
				int i = read.nextInt();
				if(i>0 && i<9)
					return i;
				else 
					throw new Exception("Proszę podać liczbę z przedziału 1-8");
				
			}
			catch(Exception e)
			{
				System.out.println("Proszę podać liczbę całkowitą!");
				read.next();
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readChooice = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		String chooice;
		do
		{
			
			System.out.println("########################");
			System.out.println("DZIALANIA NA WEKTORACH");
			System.out.println("########################");
			System.out.println("Wybierz jaka operacje chcesz wykonac");
			System.out.println("1: dodawanie wektorow");
			System.out.println("2: odjemowanie wekorow");
			System.out.println("3: mnozenie wektorow");
			System.out.println("4: mnozenie wektora przez skalar");
			System.out.println("q: wyjscie");
			
			chooice = readChooice.nextLine();
			VectorOperations vO = new VectorOperations();
			int i;
			double c;
			Vector v1 = new Vector();
			Vector v2 = new Vector();
			
			switch(chooice)
			{
			case "1":
				//System.out.println("podaj wymiar wektora: ");
				i = getDim(read);
				
				for (int j = 0 ; j < i; j++)
				{
					v1.add(getCoordinate(j,1,read));
					
				}
				
				for (int j = 0 ; j < i; j++)
				{
					v2.add(getCoordinate(j,2,read));
					
				}
				System.out.println("Wynik dodania wektora "+ v2.toString() + " do wektora"+ v1.toString()+
						" wynosi:" + vO.addition(v1, v2).toString());
				v1.clear();
				v2.clear();
				break;
			case "2":
				//System.out.println("podaj wymiar wektora: ");
				i = getDim(read);
				
				for (int j = 0 ; j < i; j++)
				{
					v1.add(getCoordinate(j,1,read));
				}
				
				for (int j = 0 ; j < i; j++)
				{
					v2.add(getCoordinate(j,2,read));
				}
				System.out.println("Wynik odjecia wektora "+ v2.toString() + " od wektora"+ v1.toString()+
						" wynosi:" + vO.substraction(v1, v2).toString());
				v1.clear();
				v2.clear();
				break;
			case "3":
				i = getDim(read);
				
				for (int j = 0 ; j < i; j++)
				{
					v1.add(getCoordinate(j,1,read));
					
				}
				
				for (int j = 0 ; j < i; j++)
				{
					v2.add(getCoordinate(j,2,read));
					
				}
				System.out.println("Wynik mnozenia wektora "+ v2.toString() + 
						" razy wektor"+ v1.toString()+" wynosi:" + vO.multiplicationByVector(v1, v2).toString());
				v1.clear();
				v2.clear();
				break;
			case "4":
				i = getDim(read);
	
				for (int j = 0 ; j < i; j++)
				{
					v1.add(getCoordinate(j,1,read));
					
				}
				System.out.println("podaj liczbe przez jaka chcesz wymnozyc wektor: ");
				c = read.nextDouble();
				
				System.out.println("Wynik mnozenia wektora "+ v1.toString() + " przez liczbe "+ c +
						" wynosi:" + vO.multiplicationByNumber(v1, c).toString());
				v1.clear();
				break;
			
			
			default: System.out.println("zly wybor");
			}
			
		}while(!"q".equals(chooice));
		readChooice.close();
		read.close();
		
	

	}




}
