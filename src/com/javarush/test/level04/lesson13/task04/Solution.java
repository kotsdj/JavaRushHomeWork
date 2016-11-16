package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int v = 8;
        for (int i=1; i<10; i++){
            System.out.print(v);

        }
        for (int i=1; i<12; i++){

            System.out.println(v);
        }

    }
}
