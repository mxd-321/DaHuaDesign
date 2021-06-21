package com.xawl.mxd.SimpleFactory.factory;

import com.xawl.mxd.SimpleFactory.calculation.*;

/**
 * @Author mxd
 * @Date 2021/4/25 12:35
 */

public class OperationFactory {

    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationExc();
                break;
            default:
                System.out.println("您的运算不支持");
                break;
        }

        return operation;
    }

}
