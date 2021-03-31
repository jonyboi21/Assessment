public class Clothing implements Comparable<Clothing> {
    //ivar
    private String description;
    private double price;
    private char size;

    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    @Override
    public int compareTo(Clothing other) {
        return (int)getPrice() - (int)other.getPrice();
    }

//    @Override
//    public int compareTo(Clothing clothing1, Clothing clothing2) {
//        if (clothing1.getPrice() < clothing2.getPrice()) {
//            return -1;
//        } else if (clothing1.getPrice() > clothing2.getPrice()) {
//            return 1;
//        } else return 0;
//    }


//    @Override
//    public int compareTo(Clothing clothing1) {
//        if (clothing1.getPrice() < )
//    }
}
