package nested.anonymous.ex;

import java.util.Random;

public class Ex1MainV4 {
    public static void helloDice() {
        System.out.println("프로그램 시작");
        //코드조각시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
        //코드조각종료
        System.out.println("프로그램 종료");
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void hello(Runnable runnable) {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        runnable.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void helloNew(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        helloDice();
        helloSum();

        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });


        helloNew(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        helloNew(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
