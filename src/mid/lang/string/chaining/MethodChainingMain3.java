package mid.lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();  // 체인처럼 연결되어 있다 -> 메서드 체이닝

        System.out.println("result = " + result);
    }
}