package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//ввод строк с клавиатуры
            Integer[] list = new Integer[10];
            for (int i = 0; i < list.length; i++)
            {
                int s = Integer.parseInt(reader.readLine());
                list[i] = s;
            }

//вывод содержимого массива на экран
            for (int i = 0; i < list.length; i++)
            {
                int j = list.length - i - 1;
                System.out.println( list[j] );
            }
        }
    }

