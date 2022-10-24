package Day54.AccessModifiers.AccessModifiersInhertattributesadnMethods.EX2;

import Day54.AccessModifiers.AccessModifiersInhertattributesadnMethods.EX1.A;

import java.time.LocalDate;

public class C extends A {
    public C(){
       int num= super.num;
       double price = 0.00;
       LocalDate localDate1 = super.localDate;
       super.print();
    }
}
