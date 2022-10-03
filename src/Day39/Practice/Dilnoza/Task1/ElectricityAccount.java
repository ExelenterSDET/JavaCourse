package Day39.Practice.Dilnoza.Task1;

public class ElectricityAccount {
   static double  totalWph;
   double rate =0.7;
   double bill;


   public double calculateBill(){
      return bill+=rate*totalWph;
   }


   public String toString() {
      return "ElectricityAccount{" +
              "rate=" + rate +
              ", bill=" + bill +
              '}';
   }
}
