import entity.Operation;
import entity.impl.OperationAdd;
import entity.impl.OperationSub;

public class OperationFactory {
    public static Operation createOperation(String operationType) {
        Operation operation;
        switch (operationType) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            default:
                throw new IllegalStateException("不支持的计算器类型: " + operationType);
        }
        return operation;
    }
}
