package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5;i++){
            String sa = r.readLine();
            list.add(sa);
        }

        int max = list.get(0).length();
        for (int i = 1; i < list.size(); i++){
            if (list.get(i).length() > max)
                max = list.get(i).length();
        }
        ArrayList<String> listNew = new ArrayList<String>();

        String w = " ";

        for (int j=0; j<list.size();j++){
            if (list.get(j).length() == max){
                w = list.get(j);
                listNew.add(w);
            }
        }

        for (int i=0; i<listNew.size();i++){
            System.out.println(listNew.get(i));
        }

    }
}
