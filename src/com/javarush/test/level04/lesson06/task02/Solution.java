package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String sd  = r.readLine();
        int d = Integer.parseInt(sd);

        if (a>b & a>c & a>d)
            System.out.println(a);
        else if (a<b & b>c & b>d)
            System.out.println(b);
        else if (c>a & c>b & c>d)
            System.out.println(c);
        else
            System.out.println(d);

    }
}
