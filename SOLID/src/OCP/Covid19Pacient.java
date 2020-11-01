package OCP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	Map<Symptoms, Integer> Symptom = new HashMap<Symptoms, Integer>();
	
	public void addSymptom(Symptoms s, Integer w) {
		Symptom.put(s, w);
	}
	public Symptoms sanatedDays() {
		Symptoms lag =new NeuroMuscularSymptom(1, 1, 0);
		
		
		for(Symptoms s:Symptom.keySet()) {			
			if(s.getAffectedDays()> lag.getAffectedDays())				
				lag=s;			
		}
		return lag;
		
	}

	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;
//calculate afection
		for (Symptoms c : Symptom.keySet())
			afection = afection + c.getSeverityIndex() * Symptom.get(c);
		afection = afection / (Symptom.size() + Symptom.size() + Symptom.size());
//calculate increment
		if (getYears() > 65)
			increment = afection * 0.5;
//calculate impact
		impact = afection + increment;
		return impact;
	}
}