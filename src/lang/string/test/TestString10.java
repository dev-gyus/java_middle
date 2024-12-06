package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        
        // 분리
        String[] splitFruits = fruits.split(",");
        for(String fruit : splitFruits) {
            System.out.println(fruit);
        }

        // 합치기
        String joinFruits = String.join(",", splitFruits);
        System.out.println(joinFruits);
    }
}
