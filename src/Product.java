public abstract class Product {
   private int id;
    private String name;
    private int price;
    private int discount;
    private int stockAmount;
    private String mark;
    private int memory;
    private double screenSize;
    private int ram;
    private String color;

    public Product(int id, String name, int price, int discount, int stockAmount, String mark, int memory, double screenSize, int ram, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stockAmount = stockAmount;
        this.mark = mark;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
