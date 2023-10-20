public class Main {
    public static void main(String[] args) {
        System.out.println("Order from Europe");
        GetProduct gp1 = new GetProductFromEurope();
        gp1.getCement(100);
        gp1.getWallpaper(20);
        gp1.getDye(15);

        System.out.println("\nOrder from USA");
        GetProduct gp2 = new AdapterForProductFromUSA();
        gp2.getCement(100);
        gp2.getWallpaper(20);
        gp2.getDye(15);
    }
}