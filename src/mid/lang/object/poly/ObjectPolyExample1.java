package mid.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    // Object는 모든 객체의 부모이다. 따라서 어떤 객체든지 인자로 전달할 수 있다.
    private static void action(Object obj){
//        obj.sound();  // 컴파일 오류. Object는 sound()가 없다.
//        obj.move();  // 컴파일 오류. Object는 move()가 없다.
        // Object는 이미 최상위 클래스이기 때문에 밑으로 내려갈 순 없다. 그래서 하위 클래스 모름

        // 객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog){
            dog.sound();
        }else if (obj instanceof Car car){
            car.move();
        }
    }
}
