abstract public class Employee extends Customer{

    private double discount = .1;

    public Employee(Clothing[] clothingItems, char size, String name) {
        super(clothingItems, size);
        setName(name);
    }


    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public abstract void printEmpPriceAfterDisc();

}
