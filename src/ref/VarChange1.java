package ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;                         //a 변수에 10 대입
        int b = a;                          //b 변수에 a에 들어있는 값인 10을 복사해서 b에 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);     //둘다 10이 출력됨

        //a 변경
        a = 20;                             //여기서 a의 값을 20으로 변경
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);     //a의 값을 변경했으니 20이 출력됨
        System.out.println("b = " + b);     //b의 값은 그대로 10이 출력됨 -> 여기서 값이 20으로 변경되지 않은 이유는 a에 들어있는 값을 복사해서 b에 넘겨줬기 때문이다.
                                            //변수 a 자체를 b에 대입하는 것이 아니다! 값을 복사해서 대입했기 때문에 a와 b는 서로 영향을 주지않는다.
        //b 변경
        b = 30;                             //이번엔 b의 값을 30으로 변경
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);     //위에서 변경한 20이 출력됨, 변수 b를 변경해도 변수 a에 영향을 주지 않는다.
        System.out.println("b = " + b);     //변경된 30이 출력됨
    }

}
