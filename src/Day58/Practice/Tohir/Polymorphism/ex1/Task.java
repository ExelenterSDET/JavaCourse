package Day58.Practice.Tohir.Polymorphism.ex1;

public class Task {
    public static void main(String[] args) {
        b obj = new c();

        obj.read();
        obj.write();
        //obj.run();

    }
}

class a{

    void read(){
        System.out.println("read in a");
    }
    void print(){
        System.out.println("Class a");
    }
}

class b extends a{

    void write(){
        System.out.println("write in b");
    }
    void print(){
        System.out.println("Class b");
    }
}

class c extends b{
    void print(){
        System.out.println("Class c");
    }
    void run(){
        System.out.println("Run c");
    }
}