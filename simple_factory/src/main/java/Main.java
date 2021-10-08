import entity.Operation;

/**
 * 注意和策略模式的异同
 */
public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("-");
        System.out.println(operation.getResult(3, 5));
    }
}
