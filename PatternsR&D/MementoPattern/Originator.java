package MementoPattern;

class Originator {
	private String state;
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	public MementoPattern saveStateToMemento()
	{
		return new MementoPattern(state);
	}
	public void getStateFromMemento(MementoPattern memento)
	{
		state=memento.getState();
	}

}