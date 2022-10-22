package Day54.AccessModifiers.AccessModifiersInhertattributesadnMethods.EX1;

import java.time.LocalDate;

public class B extends A {
    public B(){
       int num =  super.num;
       double price = super.price;
        LocalDate localDate1 = super.localDate;
        super.print();
    }
}
