package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String st = r.readLine();

        String sa = r.readLine();
        int a = Integer.parseInt(sa);

        int t = 0;
        while (t<a)
        {
            t++;
            System.out.println(st);
        }

    }
}
