public class Phone extends Product{
    int batterySize;
    int camera;

    public Phone(int id, String name, int price, int discount, int stockAmount, String mark, int memory, double screenSize, int ram, String color,int batterySize,int camera) {
        super(id, name, price, discount, stockAmount, mark, memory, screenSize, ram, color);
        this.batterySize=batterySize;
        this.camera=camera;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }


}
