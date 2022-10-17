package Day46;

public class JavaEnum {
    public static void main(String[] args) {
        HTTP_STATUS_CODES ok = HTTP_STATUS_CODES.OK;
        System.out.println(ok);
        System.out.println(HTTP_STATUS_CODES.REQUEST);
        switch (ok)
        {
            case OK -> {System.out.println("Status error is ok, and the code is 200"); break;}
            case CREATED -> {System.out.println("Status error is created, and the code is 201"); break;}
            case REQUEST -> {System.out.println("Status error is created, and the code is 401"); break;}
        }
    }
}
