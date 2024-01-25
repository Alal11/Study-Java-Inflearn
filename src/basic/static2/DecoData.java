package basic.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 인스턴스 변수는 인스턴스를 생성해야 알 수 있음. 그리고 인스턴스 참조값을 알아야 접근 가능하니까 클래스 소속에서는 접근 불가
//        instanceValue++;  // 인스턴스 변수 접근, 컴파일 에러
//        instanceMethod();  // 인스턴스 메서드 접근, 컴파일 에러

        staticValue++;  // 정적 변수 접근
        staticMethod();  // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;  // 인스턴스 변수 접근
        instanceMethod();  // 인스턴스 메서드 접근

        staticValue++;  // 정적 변수 접근
        staticMethod();  // 정적 메서드 접근
    }

    // 정적 메서드라도 외부에서 참조값을 넘겨받아서 인스턴스 변수나 메서드에 접근하는건 가능!
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
