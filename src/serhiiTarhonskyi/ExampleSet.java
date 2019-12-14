import java.util.ArrayList;

public class ExampleSet {
	
	private ArrayList<String> newPole;
	
	public ExampleSet() {
		newPole = new ArrayList<String>();
	}
	
	public boolean hasElement(String el) {
		boolean x = false;
		for (String s : newPole) {
			if (s.equals(el)) {
				x = true;
			}
		}
		return x;
	}
	
	
	public void add(String el) {
		if (!hasElement(el)) {
		  newPole.add(el);
		}
	}
	
	public void remove(String el) {
		if (hasElement(el)) {
			  newPole.remove(el);
			}
		
	}
	
	public String toString() {
		String result = "";
		 for (String s : newPole ) {
			result += s.toString() + "  ";
		}
		 return result;
	}

}
