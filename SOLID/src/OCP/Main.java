package OCP;

public class Main {

	public static void main(String[] args) {
		Symptoms s1 = new RespiratorySymptom(1, 1,10);
		Symptoms s2 = new NeuroMuscularSymptom(2, 2,20);
		Symptoms s3 = new CardioVascularSymptom(3, 3,30);

		Covid19Pacient p = new Covid19Pacient();
		p.addSymptom(s1, 1);
		p.addSymptom(s2, 2);
		p.addSymptom(s3, 2);
		p.calcCovid19Impact();
System.out.println(p.sanatedDays().getAffectedDays());
	}

}
