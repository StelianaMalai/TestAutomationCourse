package md.tekwill.topic3;

import jdk.dynalink.Operation;

public class ExecuteOperations {
    public static void main(String[] args) {
      Operations.printAritmeticOperations();
      Operations.printRelationalOperations(5,15);
      Operations.printLogicOperations();
      Operations.useForAndWhile();
    }
}
