package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();  //인스턴스가 생성되고 참조값 할당
        System.out.println("2. data = " + data);
        data = null;        //null로 다시 할당
        System.out.println("3. data = " + data);
    }

}
