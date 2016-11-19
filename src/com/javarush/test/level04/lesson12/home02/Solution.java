package com.javarush.test.level04.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //напишите тут ваш код

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(r.readLine());
        int M = Integer.parseInt(r.readLine());

        for (int i=0; i<N;i++){
            int a = Integer.parseInt(r.readLine());
            list.add(a);
        }

        for(int i = 0; i < M; i++){
            list.add(list.remove(0));
        }

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
