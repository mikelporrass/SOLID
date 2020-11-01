package ISP;

public class Impact {
	public double getImpact(double afection, double increment, Covid19Pacient p) {
		// 10 baino gazteagoko pazientei beti 0 inpaktua
		if (p.getAdina() < 10)
			return 0;
		double impact;
		impact = afection + increment;
		return impact;
	}
}
