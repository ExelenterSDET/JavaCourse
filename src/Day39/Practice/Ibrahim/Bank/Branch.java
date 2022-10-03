package Day39.Practice.Ibrahim.Bank;

public class Branch {
    String branchId;
    String zipCode;

    public Branch() {
    }

    public Branch(String branchId){
        this.branchId = branchId;
    }

    public Branch(String branchId, String zipCode) {
        this(branchId);
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId = '" + branchId + '\'' +
                ", zipCode = '" + zipCode + '\'' +
                '}';
    }
}
