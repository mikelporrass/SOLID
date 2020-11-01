package DIP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	Map<Symptoms, Integer> Symptom = new HashMap<Symptoms, Integer>();

	public void addSymptom(Symptoms s, Integer w) {
		Symptom.put(s, w);
	}

	public Symptoms sanatedDays() {
		Symptoms lag = new NeuroMuscularSymptom(1, 1, 0, "neumonia");

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
		// calculate afection
		CalcAfection ca = new Afection();
		afection = ca.getAfection(this);
		// calculate increment
		CalcIncrement incr = new Increment();
		increment = incr.getIncrement(afection, this);
		// calculate impact
		impact = afection + increment;
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