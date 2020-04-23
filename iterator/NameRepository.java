package iterator;


public class NameRepository implements Container
{
	public String names[] = {"Nishit","Vivaan","Shashank","Rhea","Goteya"};
	@Override
	public Iterator getIterator() 
	{
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	
	private class NameIterator implements Iterator
	{
		int index;
		@Override
		public boolean hasNext() 
		{
			if(index < names.length)
			{
				return true;
			}// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() 
		{
			if(this.hasNext())
			{
				return names[index++];
			}// TODO Auto-generated method stub
			return null;
		}
		
	}
}
