package site.syso.other;

import java.util.stream.IntStream;

/**
 * 使用递归打印斐波那契数列
 */
public class Recursive {


    static int fibonacci(int i) {
        if (i <= 0) return 0;
        if (i == 1) return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }


    public static void main(String[] args) {
        IntStream.range(1, 40).forEach(i -> System.out.print(fibonacci(i) + ", "));
    }


}
