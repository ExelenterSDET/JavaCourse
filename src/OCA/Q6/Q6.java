package OCA.Q6;

import java.io.IOException;

public class Q6 {
    public static void main(String[] args) throws IOException { 	// line n3
        X xobj = new X();
        xobj.printFileContent();
        // line n4

    }

}


class X {
    public void printFileContent() throws IOException {     		// line n1
        /* Code goes here */
        throw new IOException();					// line n2
    }
}
