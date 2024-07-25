package mid.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("동일성 identity = "+ (user1 == user2));
        System.out.println("동등성 equality = "+ (user1.equals(user2)));  // 오브젝트가 기본으로 제공하는 equals는 ==으로 동일성 비교를 제공함
        // 이유 : 동등성이라는 개념은 각각 클래스마다 다르다!
        // 어떤 클래스는 주민번호를 기반으로, 연락처를 기반으로, 회원 번호를 기반으로 동등성을 처리할 수 있다.
        // 따라서 동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의해야 한다. 그렇지 않으면 Object는 동일성 비교를 기본으로 제공한다.

    }
}
