import java.lang.management.ManagementFactory;
import java.util.ArrayList;

public class ShopApp {


    static double calcTotal(Clothing[] clothing){
        double sum = 0;
        for(int i=0; i<clothing.length; i++) {
            sum = clothing[i].getPrice() + sum;
        } return sum;
    }

    static boolean isAFit(Customer customer, Clothing clothing){
        if(customer.getSize() == clothing.getSize()){
            return true;
        }else return false;
    }

    static void sortAndPriceClothingByPrice(ArrayList<Clothing> clothing1){
        System.out.println("After sorting clothing by price...");
        double sum = 0;
        for(int i=0; i<clothing1.size(); i++){
            sum = clothing1.get(i).getPrice() + sum;
            System.out.println();
        }


        //        clothing1.sort(Clothing::compareTo);
    }
    static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }
    static void printDiscAmtOff(IDiscountable[] discount, Clothing clothing){
        double sum = 0;
        for(int i =0; i< discount.length; i++){
           sum = (discount[i].calcDiscount(clothing) + sum);
        }
        System.out.println(sum);
    }






    public static void main(String[] args) {


        Clothing clothing1 = new Clothing("Short Sleeve Shirt", 12.99, 'L');
        Clothing clothing2 = new Clothing("Long Sleeve Shirt", 20.99, 'L');
        Clothing clothing3 = new Clothing("Basketball Shorts", 10, 'M');

       Clothing[] managerCart = new Clothing[3];
        managerCart[0] = clothing1;
        managerCart[1] = clothing2;
        managerCart[2] = clothing3;

        Manger Devon = new Manger(managerCart, 'S', "Devon");



        Clothing[] employeeCart = new Clothing[3];
        employeeCart[0] = clothing1;
        employeeCart[1] = clothing2;
        employeeCart[2] = clothing3;

        HourlyEmployee Jordan = new HourlyEmployee(employeeCart,'L',"Jordan");


        System.out.println(isAFit(Jordan,clothing2));

        Jordan.printEmpPriceAfterDisc(clothing3);
        Jordan.printEmpPriceAfterDisc(clothing1);

        Devon.printEmpPriceAfterDisc(clothing3);

        ArrayList<Clothing> arrayOfClothing = new ArrayList<Clothing>();
        arrayOfClothing.add(clothing1);
        arrayOfClothing.add(clothing2);
        arrayOfClothing.add(clothing3);

        for (int i =0; i<arrayOfClothing.size(); i++){
            System.out.println(arrayOfClothing.get(i));
        }
        printEmployeeName(Jordan);
        printEmployeeName(Devon);
        sortAndPriceClothingByPrice(arrayOfClothing);

    }


}



