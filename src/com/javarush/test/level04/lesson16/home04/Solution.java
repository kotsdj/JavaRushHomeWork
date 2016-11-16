package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String sa = r.readLine();
        String sa1 = r.readLine();
        String sa2 = r.readLine();
        String sa3 = r.readLine();
        System.out.println("Меня зовут "+sa+"\nЯ родился "+ sa3+"."+sa2+"."+sa1);


    }
}
