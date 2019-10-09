package site.syso.chapter2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 选择排序
 */
public class SelectionSort extends BaseSort {

    @Override
    public void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        Integer[] arr = list.toArray(new Integer[0]);
        show(arr);
        new SelectionSort().sort(arr);
        show(arr);
    }

}
