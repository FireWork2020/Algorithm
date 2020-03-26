package per.gyx;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> list = new ArrayList<>(50);
        list.add(1);
        for (int i = 6; i <= num; i++) {
            int temp = 0;
            for (int j = 0; j < list.size(); j++) {
                int t = list.get(j);
                t *= i;
                t += temp;
                temp = t / 10;
                list.set(j, t % 10);
            }
            if (temp != 0) {
                list.add(temp);
            }
        }
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            int t = list.get(i);
            t *= 2;
            t += temp;
            temp = t / 10;
            list.set(i, t % 10);
        }
        if (temp != 0) {
            list.add(temp);
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j));
        }
    }

}
