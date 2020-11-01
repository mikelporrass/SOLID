package DIP;

public class Main {

	public static void main(String[] args) {
		Symptoms s1 = new RespiratorySymptom(1, 1, 10, "tos");
		Symptoms s2 = new NeuroMuscularSymptom(2, 2, 20, "diarrea");
		Symptoms s3 = new CardioVascularSymptom(3, 3, 30, "nauseas");

		Covid19Pacient p = new Covid19Pacient();
		p.addSymptom(s1, 1);
		p.addSymptom(s2, 2);
		p.addSymptom(s3, 2);
		p.calcCovid19Impact();
		p.cure();
		p.showSymptoms();
		CalcAfection a =new Afection();
		a.getAfection(p);
		System.out.println(p.sanatedDays().getAffectedDays());
	}

}
