package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String filename = null;

    public Dog(String name)
    {
        this.filename = name;
    }

    public Dog(String folder, String name)
    {
        this.filename = folder + name;
    }

    public Dog(String folder, String name, String w)
    {
        this.filename = folder + name + w;
    }

}
