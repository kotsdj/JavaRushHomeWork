package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    //public static void main(String[] args) throws Exception
    //{
        //BufferedReader r = new BufferedReader(new InputStreamReader(System.in));


        //String sum = "сумма";
        //int s = 0;
        //int a;

         //for (String sa = r.readLine();!sa.equals(sum);s+=a){
        //    a = Integer.parseInt(sa);
      //      BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
    //        sa = rr.readLine();
  //      }
//
        //System.out.println(s);



        public static void main(String[] args) throws Exception
        {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum;
            String s = reader.readLine();

            for (sum = 0; !s.equals("сумма"); s = reader.readLine()) {
                int num = Integer.parseInt(s);
                sum = sum + num;
            }

            System.out.print(sum);



        }

    }

