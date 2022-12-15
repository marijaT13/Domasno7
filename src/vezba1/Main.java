package vezba1;
import java.util.ArrayList; 
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> lekovi=new ArrayList<String>();
		lekovi.add("Diazepam");
		lekovi.add("Nalgesin");
		lekovi.add("Brufen");
		lekovi.add("Paracetamol");
		lekovi.add("Analgin");
		lekovi.add("Naklofen");
		
		if(lekovi.get(lekovi.size()-1).equals("Paracetamol"))
		{
			System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura");
			
		}
		else
			System.out.println("Namenata na lekot ne e poznata.");
	}
}
