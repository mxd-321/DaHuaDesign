package com.xawl.mxd.strategy;

import com.xawl.mxd.strategy.context.CashContext;

import java.util.Scanner;

/**
 * @Author mxd
 * @Date 2021/4/26 11:08
 * 策略模式
 */

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        while(!"exit".equals(type)){

            CashContext context = new CashContext(type);

            double result = context.getResult(600);

            System.out.println(result);
            type = scanner.next();
        }

    }
}
