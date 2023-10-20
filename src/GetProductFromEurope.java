public class GetProductFromEurope implements GetProduct {

    @Override
    public void getCement(double n) {
        System.out.println("Cement: "+n+" kilograms");
    }

    @Override
    public void getWallpaper(double n) {
        System.out.println("Wallpaper: "+n+" meters");
    }

    @Override
    public void getDye(double n) {
        System.out.println("Dye: "+n+" liters");
    }
}
