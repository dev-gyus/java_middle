package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        // 생성된 로또 번호 출력
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }
}
