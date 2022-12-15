package vezba2;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		MetodiZaListaNiza ml=new MetodiZaListaNiza();
		List<String> boi=new ArrayList<String>();
		boi.add("Crvena");
		boi.add("Crna");
		boi.add("Zelena");
		boi.add("Lilava");
		ml.listToArray(boi);
		String[] Niza= {"crvena","crna","zelena","lilava"};
		ml.arrayToList(Niza);
	}
}
