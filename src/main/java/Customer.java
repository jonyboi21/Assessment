import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends Person{

    private Clothing[] clothingItems;
    private char size;

    public Customer(Clothing[] clothingItems, char size) {
        this.clothingItems = clothingItems;
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothingItems=" + clothingItems +
                ", size=" + size +
                '}';
    }


    //    @Override
//    public String toString() {
//        return "Customer{" +
//                "clothingItems=" + Arrays.toString(new ArrayList[]{clothingItems}) +
//                ", size=" + size +
//                '}';
//    }
}
