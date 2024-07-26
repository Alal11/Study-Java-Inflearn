package mid.lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java");  // concat은 반환값이 있음
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        // String은 불변 객체이기 때문에 변경이 필요한 경우 기존 값을 변경하지 않고, 새로운 결과를 만들어서 반환한다.
    }
}
