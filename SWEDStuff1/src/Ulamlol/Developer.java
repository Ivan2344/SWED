package Ulamlol;

public class Developer extends Mitarbeiter
{
	String name;
	int alter;
	int erf; 
	boolean absch; 
	String lang;
	String arriv;
	String lef;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getErf() {
		return erf;
	}

	public void setErf(int erf) {
		this.erf = erf;
	}

	public boolean isAbsch() {
		return absch;
	}

	public void setAbsch(boolean absch) {
		this.absch = absch;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getArriv() {
		return arriv;
	}

	public void setArriv(String arriv) {
		this.arriv = arriv;
	}

	public String getLef() {
		return lef;
	}

	public void setLef(String lef) {
		this.lef = lef;
	}

	public Developer() 
	{
		super();
	}

	public Developer(String name, int alter, int erf, boolean absch, String lang, String arriv, String lef, String rolle) {
		super(rolle);
		this.name = name;
		this.alter = alter;
		this.erf = erf;
		this.absch = absch;
		this.lang = lang;
		this.arriv = arriv;
		this.lef = lef;
	}

	public Developer(String Rolle) {
		super(Rolle);
		// TODO Auto-generated constructor stub
	}
	
}
