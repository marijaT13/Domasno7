package vezba3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<SportskiKlub> sklist=new ArrayList<SportskiKlub>();
		sklist.add(new SportskiKlub("Milan","Fudbal",30));
		sklist.add(new SportskiKlub("Barcelona","Fudbal",28));
		sklist.add(new SportskiKlub("Inter Milan","Fudbal",32));
		Collections.sort(sklist);
		for(SportskiKlub a:sklist) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrojnaClenovi());
			System.out.println();
		}
	}
}
