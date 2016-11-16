package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String filename = null;

    public Friend(String name)
    {
        this.filename = name;
    }

    public Friend(String folder, String name)
    {
        this.filename = folder + name;
    }

    public Friend(String folder, String name, String w)
    {
        this.filename = folder + name + w;
    }

}