package DIP;


public class Afection extends CalcAfection {
	public double getAfection(Covid19Pacient p) {
		int afection = 0;
int elems=0;
		/*for (Symptoms c : Symptom.keySet()) {
			// covidImpact>50 handiagoko sintomak soilik kontuan hartzen badira.
			if (c.getCovidImpact() > 50)
				afection = afection + c.getSeverityIndex() * Symptom.get(c);
		}
		afection = afection / (Symptom.size() + Symptom.size() + Symptom.size());
*/
		
		for (Symptoms s:p.Symptom.keySet())
			if (s.getCovidImpact()>50) {
			afection = afection +s.getSeverityIndex()*p.Symptom.get(s);
			elems++;
			}
		if(elems!=0)
			afection = afection /elems;

		return afection;
	}
}
