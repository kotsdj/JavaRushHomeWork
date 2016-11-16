package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String sa1 = r.readLine();
        int a1 = Integer.parseInt(sa1);
        String sa2 = r.readLine();
        int a2 = Integer.parseInt(sa2);
        String sa3 = r.readLine();
        int a3 = Integer.parseInt(sa3);


        if ((a1>a2)&(a1<a3)||(a1<a2)&(a1>a3))
            System.out.println(a1);
        else if ((a2>a1)&(a2<a3)||(a2<a1)&(a2>a3))
            System.out.println(a2);
        else
            System.out.println(a3);

    }
}
