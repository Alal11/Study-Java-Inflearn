package basic.static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int result = 0;
        for (int i : values) {
            result += i;
        }
        return result;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int result = values[0];
        for (int i : values) {
            if (result > i) {
                result = i;
            }
        }
        return result;
    }

    public static int max(int[] values) {
        int result = values[0];
        for (int i : values) {
            if (result < i) {
                result = i;
            }
        }
        return result;
    }
}
