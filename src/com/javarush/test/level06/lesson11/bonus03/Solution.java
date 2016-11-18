package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0;i<5;i++)
        {
            BufferedReader r  = new BufferedReader(new InputStreamReader(System.in));

            String sa = r.readLine();
            int a = Integer.parseInt(sa);

            list.add(a);
        }

        String listName = "";



        for (int i = 0; i < list.size(); i++) {
            listName = listName + list.get(i) + "\n";
        }
        System.out.println(listName);
    }
}
