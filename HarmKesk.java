public class HarmKesk {

    public double KeskmineKiirus(double kiirus1, double kiirus2) {
        return (kiirus1 + kiirus2) / 2;
    }
	
	 public static void main(String[] args) {
        HarmKesk keskm = new HarmKesk();
        System.out.println("Keskmine kiirus kahe km lõigu pikkuse peale on " + keskm.KeskmineKiirus(12, 8));
	 }
}