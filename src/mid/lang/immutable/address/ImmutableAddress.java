package mid.lang.immutable.address;

public class ImmutableAddress {
    private final String value;  // final로 불변 객체 도입

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
