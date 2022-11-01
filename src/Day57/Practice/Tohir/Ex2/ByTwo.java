package Day57.Tohir.Ex2;

import Day57.Java.Ex2.Series2;

public class ByTwo implements AllSeries{

    int val;

    public ByTwo(int val) {
        this.val = val;
    }


    @Override
    public void getNext() {

        if(val+2>maxLimit){
            throw new RuntimeException(Series.errorMessage);
        }else {
            val+=2;
        }

    }

    @Override
    public void getPrev() {
        if(val-2<0){
            throw new RuntimeException(Series2.errorMessage);
        }else {
            val-=2;
        }
    }
}
