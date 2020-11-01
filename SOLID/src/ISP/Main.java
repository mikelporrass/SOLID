package ISP;

public class Main {

	public static void main(String[] args) {
		Pertsona p = new Pertsona("Mikel", 88);
		Increment i = new Increment();
		System.out.println(i.getIncrement(40, p));
	}

}
