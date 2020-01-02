package zadanie;

import java.util.ArrayList;

public class Set {
	
	private ArrayList<String> assemblage;

	public Set(){
		assemblage = new ArrayList<String>();
	}
	
	public void add(String panties) {
		
		for(int i = 0; i <assemblage.size(); i++) {
			
			if(assemblage.get(i).equals(panties)) {
				
				return;
			}		
		}
		
		assemblage.add(panties);
	}
	
	public void remove(String panties) {
		
		assemblage.remove(panties);
		
	}
	
	public boolean hasElement(String panties) {
		
		for(int i = 0; i < assemblage.size(); i++) {
			
			if(assemblage.get(i).equals(panties)) {
				
				return true;
			}	
		}
		return false;	
	}
	
	public String toString() {
		
		return assemblage.toString();
		
	}

}
