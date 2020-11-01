package LSK;

import java.util.Map;

public class Afection {
	public double getAfection(Map<Symptoms, Integer> Symptom) {
		int afection = 0;
int elems=0;
		/*for (Symptoms c : Symptom.keySet()) {
			// covidImpact>50 handiagoko sintomak soilik kontuan hartzen badira.
			if (c.getCovidImpact() > 50)
				afection = afection + c.getSeverityIndex() * Symptom.get(c);
		}
		afection = afection / (Symptom.size() + Symptom.size() + Symptom.size());
*/
		
		for (Symptoms s:Symptom.keySet())
			if (s.getCovidImpact()>50) {
			afection = afection +s.getSeverityIndex()*Symptom.get(s);
			elems++;
			}
		if(elems!=0)
			afection = afection /elems;

		return afection;
	}
}
