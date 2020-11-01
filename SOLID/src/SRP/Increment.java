package SRP;

public class Increment {
	public double getIncrement(double afection, Covid19Pacient p) {
		// 45 eta 65-en arteko pazientei ere %30 inkrementua
		double increment = 0;
		if (p.getYears() > 65)
			increment = afection * 0.5;
		if (p.getYears() >= 45 && p.getYears() <= 65)
			increment = afection * 0.3;

		return increment;
	}
}
