package mid.lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();  // 가변 String -> 내부 값을 바로 변경하면 되기 때문에 새로운 객체 생성 x
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder -> String 변환
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
