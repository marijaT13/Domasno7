package vezba3;

public class SportskiKlub implements Comparable<SportskiKlub>{
private String ime;
private String sport;
private int brojnaClenovi;
public SportskiKlub(String ime, String sport, int brojnaClenovi) {
	this.ime=ime;
	this.sport=sport;
	this.brojnaClenovi=brojnaClenovi;
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	this.ime = ime;
}
public String getSport() {
	return sport;
}
public void setSport(String sport) {
	this.sport = sport;
}
public int getBrojnaClenovi() {
	return brojnaClenovi;
}
public void setBrojnaClenovi(int brojnaClenovi) {
	this.brojnaClenovi = brojnaClenovi;
}
public int compareTo(SportskiKlub obj) {
	SportskiKlub sk=(SportskiKlub) obj;
	if(this.ime.equals(sk.ime))
		return 0;
	else 
		return this.ime.compareTo(sk.ime);
	//podreduvanje, sortiranje na sportski klubovi
	
}
}
