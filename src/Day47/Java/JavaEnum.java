package Day47.Java;

import Day47.Java.Tasks.Drink;

public class JavaEnum {
    public static void main(String[] args) {
        HTTP_STATUS_CODE ok = HTTP_STATUS_CODE.BAD_REQUEST;
        System.out.println(ok);

        switch(ok){
            case OK:
                System.out.println("status error is ok, and the code is 200");
                break;
            case CREATED:
                System.out.println("status error is created, and the code is 201");
                break;
            case BAD_REQUEST:
                System.out.println("status erro is bad request, and the code is 400");
        }



    }
}
