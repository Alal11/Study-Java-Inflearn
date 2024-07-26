package mid.lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002

        System.out.println("new String() == 비교: " + (str1 == str2));  // 동일성 비교
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));  // 동등성 비교

        String str3 = "hello";  // x003
        String str4 = "hello";  // x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));  // 왜 true가 나올까???
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

        // str3에서 "hello"와 같이 문자열 리터럴을 사용하면 문자열 풀에서 "hello"라는 문자를 가진 String 인스턴스를 찾는다.
        // str4에서 "hello" 문자열 리터럴을 사용하므로 문자열 풀에서 str3과 같은 x003 참조를 사용한다.
        // 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용과 문자 만드는 시간도 줄어들어 성능 최적화가 가능하다.

    }
}
