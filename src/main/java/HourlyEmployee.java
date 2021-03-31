import java.util.ArrayList;

public class HourlyEmployee extends Employee implements IDiscountable {


    public HourlyEmployee(Clothing[] clothingItems, char size, String name) {
        super(clothingItems, size, name);
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * getDiscount();
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - clothing.getPrice() * getDiscount());
    }

    @Override
    public void printEmpPriceAfterDisc() {

    }
}
