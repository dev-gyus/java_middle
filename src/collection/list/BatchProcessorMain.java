package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(50_000);

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        BatchProcessor batchProcessor2 = new BatchProcessor(list2);
        batchProcessor2.logic(50_000);
    }
}
