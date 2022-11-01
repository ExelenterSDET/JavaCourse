package OCA.Q25;
interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {		// line n1
    public void readBook();
}

abstract class Book implements Readable {		// line n2
    public void readBook(){

    }
}

class EBook extends Book {						// line n3


    public void readBook() {

    }

    @Override
    public void download() {

    }
}

public class Q25 {
    Book book = new EBook();
}
