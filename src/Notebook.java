public class Notebook extends Product{
    String keyboardType;

    public Notebook(int id, String name, int price, int discount, int stockAmount, String mark, int memory, double screenSize, int ram, String color,String keyboardType) {
        super(id, name, price, discount, stockAmount, mark, memory, screenSize, ram, color);
            this.keyboardType=keyboardType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }
}
