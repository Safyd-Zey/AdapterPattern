public class AdapterForProductFromUSA extends GetProductFromUSA implements GetProduct{
    @Override
    public void getCement(double n) {
        getCementFromUSA(n* 2.205);
    }

    @Override
    public void getWallpaper(double n) {
        getWallpaperFromUSA(n*3.281);
    }

    @Override
    public void getDye(double n) {
        getDyeFromUSA(n/3.785);
    }
}
