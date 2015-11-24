package vector;
import java.util.*;

public class Vector {
	private ArrayList<Double> vectorCoordinate = new ArrayList<Double>();
	
	public Vector(double...args)
	{
		for(double item:args)
		{
			add(item);
		}
	}

	public void add(double num)
	{
		vectorCoordinate.add(num);
	}
	public int lenght()
	{
		return vectorCoordinate.size();
	}
	
	public double get(int index)
	{
		return vectorCoordinate.get(index);
	}
	
	public void clear()
	{
		vectorCoordinate.clear();
	}
	
	@Override public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		for(int i=0;i<this.lenght();i++)
		{
			sb.append(this.get(i));
			if(i<this.lenght()-1)sb.append(", ");
		}
		sb.append(")");
		return sb.toString();
	}

}
