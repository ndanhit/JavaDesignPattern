package patterns.creational.objectpool.taxi;

public class TaxiNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -6670953536653728443L;

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
