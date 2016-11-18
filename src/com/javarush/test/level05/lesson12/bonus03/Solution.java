package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int c;
        int N = Integer.parseInt(r.readLine());

        if (N>0){
            c = Integer.parseInt(r.readLine());
            maximum = c;
            for (int i=1; i<N; i++){

                int b = Integer.parseInt(r.readLine());
                if (maximum < b)
                    maximum = b;
            }
        }


        System.out.println(maximum);
    }
}
