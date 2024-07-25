package mid.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);

    }
}

/*
자바에서 모든 객체의 최종 부모는 Object이다.

child.toString()을 호출한다.
본인의 타입인 Child에서 toString()을 찾는다. 없으니까 부모 타입으로 올라가서 찾는다.
부모 타입인 Parent에서 찾는데, 없으니까 또 부모 타입으로 올라간다.
부모 타입인 Object에서 찾는데, toString()에 있으므로 해당 메서드를 호출한다.
*/