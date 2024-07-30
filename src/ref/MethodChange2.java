package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {    //파라미터 dataX에 dataA의 참조값이 복사되서 전달됨, 즉 dataX와 dataA는 같은 객체 인스턴스를 가리킴
        //dataX.value 값을 변경하면 dataA에도 영향을 준다.
        dataX.value = 20;
        System.out.println("dataX = " + dataX);  //dataA와 같은 참조값이 출력됨
    }

}
