package LSK;

public class CardioVascularSymptom extends Symptoms {
	public CardioVascularSymptom(int covidImpact, int severityIndex,int affectedDays,String name) {
		super(covidImpact,severityIndex,affectedDays, name);
		
	}
	
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	
	public int getAffectedDays() {
		return affectedDays;
	}
	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}
}