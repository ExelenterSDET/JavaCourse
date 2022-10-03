package Day39.Java.JavaConstructors;

public class Branch {
    int branchId;
    int zipCode;
    public Branch() {
    }
    public Branch(int branchId) {
        this.branchId = branchId;
    }
    public Branch(int branchId, int zipCode) {
        this(branchId);
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", zipCode=" + zipCode +
                '}';
    }

}
