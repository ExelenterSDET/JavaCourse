package Day57.Java.Ex2;

public class ByTwo implements AllSeries{
    int val;

    public ByTwo() {
        val = 0;
    }

    @Override
    public void getNext() {
        if(val + 2 > maxLimit){
            throw new RuntimeException(Series.errorMessage);
        } else{
            val += 2;
        }

    }

    @Override
    public void getPrev() {
       if(val - 2 < 0){
           throw new RuntimeException(Series2.errorMessage);
       }else{
           val -= 2;
       }

    }
}
