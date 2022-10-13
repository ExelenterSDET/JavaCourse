package Day47.Practice.Andrea.Practice;

public class JavaEnum {

    public static void main(String[] args) {
        HTTP_STATUS_CODE ok = HTTP_STATUS_CODE.OK;
        System.out.println(ok);

        switch(ok){
            case OK:
                System.out.println("Status code is OK. Code is 200");
                break;
            case CREATED:
                System.out.println("Status code is created. Code is 201");
                break;
            case BAD_REQUEST:
                System.out.println("Status error is bad request. Code is 400");
        }
    }
}
