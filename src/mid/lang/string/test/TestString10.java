package mid.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mongo";

        // 분리하기
        String[] arr = fruits.split(",");
        for (String s : arr) {
            System.out.println(s);
        }

        // 합치기
        String join = String.join("->", arr);
        System.out.println(join);
    }
}
