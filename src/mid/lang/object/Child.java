package mid.lang.object;

// 자식은 부모를 명시적으로 상속받았다.
public class Child extends Parent{
    public void childMethod(){
        System.out.println("Child.childMethod");
    }
}

// 묵시적 : 시스템 또는 컴파일러에 의해 자동으로 수행되는 것
// 명시적 : 개발자가 코드에 직접 기술해서 작동하는 것