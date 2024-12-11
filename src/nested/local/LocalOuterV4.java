package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;   // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                // 인스턴스 변수는 지역 변수보다 더 오래 살아 남는다
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        Printer localPrinter = new LocalPrinter();
//        localPrinter.print(); 를 여기서 실행하지 않고 Printer만 반환

        // 만약 localVar의 값을 변경한다면? 다시 캡쳐 해야 하나??
//        localVar = 10;
//        paramVar = 10;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV3 = new LocalOuterV4();
        Printer printer = localOuterV3.process(2);
        // printer.print()를 나중에 실행한다. process의 stack 프레임이 사라진 이후에 실행
        printer.print();

        // 내부 클래스에서 외부 클래스의 인스턴스 변수, 지역변수, 메소드 매개변수에 접근하기 위한 캡쳐 정보 확인
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
