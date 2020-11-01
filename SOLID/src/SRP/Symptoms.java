package SRP;

public abstract class Symptoms {
	int covidImpact;
	int severityIndex;
	int affectedDays;
	public Symptoms(int covidImpact,int severityIndex,int affectedDays ) {		
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays =affectedDays;
	}
	public abstract int getCovidImpact();
	public abstract int getSeverityIndex();
	public abstract int getAffectedDays();
	
}
