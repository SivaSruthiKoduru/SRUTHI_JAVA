package MementoPattern;

import java.util.ArrayList;
import java.util.List;

class CareTaker
{
	private List<MementoPattern> mementoList=new ArrayList<MementoPattern>();
	public void add(MementoPattern state)
	{
		mementoList.add(state);
	}
	public MementoPattern get(int index)
	{
		return mementoList.get(index);
	}
	
}