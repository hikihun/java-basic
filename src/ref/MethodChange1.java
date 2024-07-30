package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {    //파라미터 x에 a의 값인 10을 복사해서 대입, 값을 복사해서 넘겼기 때문에 a와 x는 서로 영향을 주지 않음
        // x의 값만 20으로 변경되고 메서드가 종료되면 x는 제거
        x = 20;
    }

}
