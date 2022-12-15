package vezba5a;
import java.util.Set;
import java.util.TreeSet;
public class main {

	public static void main(String[] args) {
		Set<String> mn1=new TreeSet<String>();
		mn1.add("Crna");
		mn1.add("Crvena");	
		mn1.add("Portokalova");
		mn1.add("Bela");
		mn1.add("Zolta");
		Set<String> mn2=new TreeSet<String>();
		mn2.add("Lilava");
		mn2.add("Zelena");
		mn2.add("Kafeava");
		mn2.add("Crvena");
		mn2.add("Zolta");
		System.out.println("Presekot na dvete mnozestva se ovie elementi: ");
		mn1.retainAll(mn2);
		System.out.println(mn1);
	}
}
