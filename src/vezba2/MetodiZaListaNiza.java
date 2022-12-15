package vezba2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodiZaListaNiza {
public void listToArray(List<String> lista) {
	String [] niza= new String [lista.size()];
	//koga e od lista vo niza se raboti so string
	
	lista.toArray(niza);
	
	System.out.println("Listata pretvorena vo niza e: ");
	
	for(String s:niza) {
		System.out.println(s);
	}//pechatenje na niza
}
public void arrayToList(String[]niza) {
	List<String>lista=new ArrayList<String>();
	//koga e od niza vo lista se raboti so List/ArrayList

	lista=Arrays.asList(niza);
	
	System.out.println("Nizata pretvorena vo lista e: ");
	
	for(String s:lista) {
		System.out.println(s);
	}//pechatenje na lista
}
}
