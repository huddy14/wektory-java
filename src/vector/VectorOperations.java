package vector;

public class VectorOperations {

	public Vector addition(Vector v1,Vector v2)
	{
		Vector result = new Vector();
		if(v1.lenght()==v2.lenght())
		{
			
			for (int i = 0; i < v1.lenght(); i++)
			{
				result.add(v1.get(i)+v2.get(i));
			}
			return result;
		}
		else 
		{
			System.out.println("wektory nie maja tej samej dlugosci \n nie mozna dodac");
			return result;
		}
	}
	
	public Vector substraction(Vector v1, Vector v2)
	{
		Vector result = new Vector();
		if(v1.lenght()==v2.lenght())
		{
			
			for (int i = 0; i < v1.lenght(); i++)
			{
				result.add(v1.get(i)-v2.get(i));
			}
			return result;
		}
		else 
		{
			System.out.println("wektory nie maja tej samej dlugosci \n nie mozna odjac");
			return result;
		}
	}
	public Vector multiplicationByVector(Vector v1, Vector v2)
	{
		Vector result = new Vector();
		if(v1.lenght()==v2.lenght())
		{
			
			for (int i = 0; i < v1.lenght(); i++)
			{
				result.add(v1.get(i)*v2.get(i));
			}
			return result;
		}
		else 
		{
			System.out.println("wektory nie maja tej samej dlugosci \n nie mozna pomnozyc");
			return result;
		}
	}
	
	public Vector multiplicationByNumber(Vector v1, double number)
	{
		Vector result = new Vector();
		for(int i = 0; i < v1.lenght();i++)
		{
			result.add(v1.get(i)*number);
			
		}
		return result;
	}
}
