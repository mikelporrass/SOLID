package LSK;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	Map<Symptoms, Integer> Symptom = new HashMap<Symptoms, Integer>();

	public void addSymptom(Symptoms s, Integer w) {
		Symptom.put(s, w);
	}

	public Symptoms sanatedDays() {
		Symptoms lag = new NeuroMuscularSymptom(1, 1, 0,"neumonia");

		for (Symptoms s : Symptom.keySet()) {
			if (s.getAffectedDays() > lag.getAffectedDays())
				lag = s;
		}
		return lag;

	}

	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;
//calculate afection
		Afection af = new Afection();
		afection = af.getAfection(Symptom);

//calculate increment
		Increment inc = new Increment();
		increment = inc.getIncrement(afection, this);
//calculate impact
		Impact imp = new Impact();
		impact = imp.getImpact(afection, increment, this);

		return impact;
	}

	public void showSymptoms() {
		for (Symptoms s : Symptom.keySet())
			s.show();
	}

	public void cure() {
		for (Symptoms s : Symptom.keySet())
			s.cure();
	}

}