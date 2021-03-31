import java.util.ArrayList;

public class Manger extends Employee implements IDiscountable{


    private final double discount = .25;

    public Manger(Clothing[] clothingItems, char size, String name) {
        super(clothingItems, size, name);
    }


    @Override
    public double getDiscount() {
       return this.discount;
    }

    @Override
    public void printEmpPriceAfterDisc() {

    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * getDiscount();
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - clothing.getPrice() * getDiscount());

    }



}
