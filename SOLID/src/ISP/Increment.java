package ISP;

public class Increment {
	/*
	 * public double getIncrement(double afection, Covid19Pacient p) { // 45 eta
	 * 65-en arteko pazientei ere %30 inkrementua double increment = 0; if
	 * (p.getYears() > 65) increment = afection * 0.5; if (p.getYears() >= 45 &&
	 * p.getYears() <= 65) increment = afection * 0.3;
	 * 
	 * return increment; }
	 */
	// adin eta afection indize bat emanda, afekzio indizea adinaren arabera
	// inkrementatzen du
	public double getIncrement(double afection, YearAble y) {
		if (y.getAdina() > 65)
			return afection * 0.5;
		else
			return 0;
	}

}
