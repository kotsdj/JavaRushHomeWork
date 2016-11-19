package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        String s1 = "мама";
        String s2 = "мыла";
        String s3 = "раму";

        ArrayList<String> listNew = new ArrayList<String>();

        //String s11 = list.get(0);
        //String s22 = list.get(1);
        //String s33 = list.get(2);

        String ss="именно";

        listNew.add(s1);
        listNew.add(ss);
        listNew.add(s2);
        listNew.add(ss);
        listNew.add(s3);
        listNew.add(ss);

        for (int i=0; i<listNew.size();i++){
            System.out.println(listNew.get(i));
        }
    }
}
