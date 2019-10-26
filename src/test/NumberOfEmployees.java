package test;



public class NumberOfEmployees {
	
	int iloscPracownikow;
	int iloscBezMajstra = 0;
	String iloscBezMajstraText = "nikt nie pracuje";
	String ilosc;
	
	public NumberOfEmployees(int iloscPracownikow) {
		
		this.iloscPracownikow = iloscPracownikow;
		ilosc = ("- Ile pracownikow pracuje ?" + "\n" + "- " + iloscPracownikow +"\n"
				 + "- To znaczy ze bez majstra " + (iloscPracownikow-1) + "\n" + "- Nie. " + iloscBezMajstra
				 + " To znaczy bez majstra tu " + iloscBezMajstraText);
		
	}
	
	 @Override
	    public String toString() {
	        return String.valueOf(this.ilosc);
	    }

}
