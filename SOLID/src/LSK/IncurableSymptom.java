package LSK;

public class IncurableSymptom extends Symptoms {
	public IncurableSymptom(int covidImpact, int severityIndex, int affectedDays,String name) {
		super(covidImpact, severityIndex, affectedDays, name);		
	}

	public void cure() {
		System.out.println("ERROR, can not be treated");
	}

	

	public int getSeverityIndex() {
		return severityIndex;
	}

	public int getAffectedDays() {
		return affectedDays;
	}

	public int getCovidImpact() {
		return covidImpact;
	}
}