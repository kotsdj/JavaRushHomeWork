package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String sa = r.readLine();
        String sb = r.readLine();

        int a = sa.length();
        int b = sb.length();

        if (sa.equals(sb))
            System.out.println("Имена идентичны");
        else if (a==b)
            System.out.println("Длины имен равны");

    }
}
