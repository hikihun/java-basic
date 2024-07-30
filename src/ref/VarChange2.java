package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();    //인스턴스를 생성하고 참조값을 dataA에 저장함
        dataA.value = 10;           //인스턴스의 value 값에 10을 저장
        Data dataB = dataA;         //dataA에 저장된 인스턴스의 참조 값을 복사해서 dataB에 저장함
                                    //여기서 중요한 점은 인스턴스 그 자체를 복사해서 넘기는게 아니라 참조하고있는 메모리 주소값을 복사해서 넘긴다는 것!!!!
                                    //결론적으로 dataA와 dataB는 같은 참조값을 가지게 되고, 두 변수는 같은 객체 인스턴스를 참조한다.

        System.out.println("dataA 참조값 = " + dataA);           //인스턴스의 참조값 @682a0b20가 출력
        System.out.println("dataB 참조값 = " + dataB);           //참조값 @682a0b20를 복사해서 dataB에 저장했기 때문에 같은 값이 출력됨
        System.out.println("dataA.value = " + dataA.value);     //10 출력됨
        System.out.println("dataB.value = " + dataB.value);     //dataA와 같은 참조값을 가지고 있기 때문에 10 출력됨
        System.out.println();

        //dataA 변경
        dataA.value = 20;                                       //dataA의 value를 20으로 변경
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);     //변경된 값 20이 출력됨
        System.out.println("dataB.value = " + dataB.value);     //마찬가지로 dataA와 같은 참조값을 가지고 있기 때문에 dataA에서 변경된 값인 20이 출력됨
        System.out.println();

        //dataB 변경
        dataB.value = 30;                                       //dataB의 value를 30으로 변경
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);     //dataB에서 value값을 30으로 변경했기 때문에 같은 인스턴스를 가리키고 있는 dataA도 30이 출력됨
        System.out.println("dataB.value = " + dataB.value);     //변경된 값 30이 출력됨


    }


}
