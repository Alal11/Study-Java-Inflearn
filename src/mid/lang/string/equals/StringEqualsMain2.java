package mid.lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("메서드 호출 비교: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));

    }

    // 문자열 비교는 항상 equals로 해줘야 함.
    // 개발자 입장에서 new String이 넘어올지, 리터럴로 해서 문자열 풀이 넘어올지 모르기 때문에
    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y);
    }
}
