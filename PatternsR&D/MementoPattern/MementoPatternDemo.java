package MementoPattern;

public class MementoPatternDemo {
	public static void main(String[] args) {
		Originator originator= new Originator();
		CareTaker caretaker=new CareTaker();
		originator.setState("state 1");
		originator.setState("state 2");
		caretaker.add(originator.saveStateToMemento());
		originator.setState("state 3");
		caretaker.add(originator.saveStateToMemento());
		originator.setState("state 4");
		System.out.println("Current state: "+originator.getState());
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("First saved state:"+originator.getState());
		originator.getStateFromMemento(caretaker.get(1));
		System.out.println("Second saved state:"+originator.getState());
		
		
	}

}
