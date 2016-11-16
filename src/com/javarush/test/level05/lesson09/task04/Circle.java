package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String filename = null;

    public Circle(String name)
    {
        this.filename = name;
    }

    public Circle(String folder, String name)
    {
        this.filename = folder + name;
    }

    public Circle(String folder, String name, String w)
    {
        this.filename = folder + name + w;
    }

}
