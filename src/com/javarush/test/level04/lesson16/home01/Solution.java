package com.javarush.test.level04.lesson16.home01;

/* Я никогда не буду работать за копейки
Используя цикл вывести на экран сто раз надпись:
«Я никогда не буду работать за копейки. Амиго»
*/

public class Solution
{
    public static void main(String[] args)
    {

        String s = "Я никогда не буду работать за копейки. Амиго";

        for (int i=1; i<101; i++){
            System.out.println(s);
        }
    }
}
