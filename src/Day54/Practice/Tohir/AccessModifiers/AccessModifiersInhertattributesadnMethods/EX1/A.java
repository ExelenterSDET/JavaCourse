package Day54.AccessModifiers.AccessModifiersInhertattributesadnMethods.EX1;

import java.time.LocalDate;

public class A {
    private String test;//private not seen by subclass
    protected int num;//seen  by subclass
    double price;
    public LocalDate localDate;
    public void print(){

    }
}
