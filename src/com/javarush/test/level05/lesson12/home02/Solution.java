package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("A", 21, "dssds");
        Man man2 = new Man("S", 34, "dssdfs");

        Woman woman1 = new Woman("Z", 14, "fffff");
        Woman woman2 = new Woman("B", 54, "dsaaaasdfs");


        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man
    {
        private String name;
        private int age;
        private String address;

        public Man (String name1, int age1, String address1)
        {
            this.name = name1;
            this.age = age1;
            this.address = address1;
        }
    }

    public static class Woman
    {
        private String name;
        private int age;
        private String address;

        public Woman (String name1, int age1, String address1)
        {
            this.name = name1;
            this.age = age1;
            this.address = address1;
        }
    }
}
