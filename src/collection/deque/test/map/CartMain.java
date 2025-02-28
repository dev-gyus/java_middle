package collection.deque.test.map;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("사과", 1000), 2);
        cart.add(new Product("사과", 1000), 3);
        cart.printAll();

        cart.add(new Product("바나나", 1000), 2);
        cart.add(new Product("바나나", 1000), 1);
        cart.add(new Product("배", 500), 3);
        System.out.println();
        cart.printAll();

        // 카트 수량 감소
        cart.minus(new Product("사과", 1000), 3);
        System.out.println();
        cart.printAll();
        // 카트에서 상품 삭제
        cart.minus(new Product("배", 500), 3);
        System.out.println();
        cart.printAll();
    }
}
