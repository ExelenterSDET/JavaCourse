package Day57.Tohir.Ex2;

public class ByThree implements AllSeries{
    int val;

    public ByThree(int val) {
        this.val = val;
    }

    @Override
    public void getNext() {
        if(val+3>maxLimit){
            throw new RuntimeException(AllSeries.errorMessage);
        }else {
            val+=3;
        }
    }

    @Override
    public void getPrev() {
        if (val-3<minLimit){
            throw new RuntimeException(AllSeries.errorMinMessage);
        }else {
            val-=3;
        }
    }
}
