package com.javarush.test.level04.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();



        for (int i=0; i<10;i++){
            int a = Integer.parseInt(r.readLine());
            list.add(a);
        }
        for (int i=9; i<=list.size() && i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
