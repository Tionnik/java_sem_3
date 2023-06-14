package java_sem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class task_01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        int sizeArr =scan.nextInt();
        System.out.printf("Введите максимальное число: ");
        int namberMaxArr =scan.nextInt();
        scan.close();
        ArrayList <Integer>arr = new ArrayList<Integer>();
        Random rand =new Random();
        for (int i = 0; i <sizeArr; i++) {
            arr.add(rand.nextInt(namberMaxArr));
        }
        System.out.println(arr);
        
        //System.out.println(Collections.max(arr));
        //System.out.println(Collections.min(arr));
        //System.out.println(arr.stream().mapToDouble(a->a).average());

        int n = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > n) {
                n = arr.get(i);
            }
        }
        System.out.println(n);

        n = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < n) {
                n = arr.get(i);
            }
        }
        System.out.println(n);

        double sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        double res = sum /(arr.size());
        System.out.println(res);

        for (int i = 0; i <arr.size(); i++) {
            if (arr.get(i)%2==0) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}
