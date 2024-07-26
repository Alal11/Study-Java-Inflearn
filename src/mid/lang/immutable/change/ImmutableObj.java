package mid.lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    // 불변을 유지하면서 새로운 결과도 만들 수 있다.
    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
