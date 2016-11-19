package com.javarush.test.level04.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {


        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String ss = "";
        String end = "end";

        for (int i=0; !ss.equals(end);i++){
            String sa = r.readLine();
            list.add(sa);
            ss = sa;
        }

        list.remove(list.size()-1);

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
