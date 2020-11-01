package DIP;

public abstract class Symptoms {
	int covidImpact;
	int severityIndex;
	int affectedDays;
	String name;
	public Symptoms(int covidImpact, int severityIndex, int affectedDays,String name) {
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays = affectedDays;
		this.name=name;
	}

	
	

	public void show(){
	System.out.println("symptom value :"+name+" severityIndex :"+
	severityIndex+" covidImpact:"+covidImpact);
	}

	public void cure() {
		System.out.println("treatment applied to: " + name);
	}

	public abstract int getCovidImpact();

	public abstract int getSeverityIndex();

	public abstract int getAffectedDays();

}
