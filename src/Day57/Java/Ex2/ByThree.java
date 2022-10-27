package Day57.Java.Ex2;

public class ByThree implements Series, Series2{
    int val;
    public ByThree(){
        val = 0;
    }

    @Override
    public void getNext() {
        if(val + 3 > maxLimit){
            throw new RuntimeException(Series.errorMessage);
        } else{
            val += 3;
        }

    }

    @Override
    public void getPrev() {
        if(val - 3 < 0){
            throw new RuntimeException(Series2.errorMessage);
        }else{
            val -= 3;
        }

    }
}
