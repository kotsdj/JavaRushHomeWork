package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String sa = r.readLine();
        int a = Integer.parseInt(sa);
        String sb = r.readLine();
        int b = Integer.parseInt(sb);
        String sc = r.readLine();
        int c = Integer.parseInt(sc);

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        if (a>b & a>c)
            a1=a;
        else if (b>a & b>c)
            a2=b;
        else
            a3=c;

        System.out.println(a1);
    }
}
