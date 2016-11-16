package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg = new Zerg();
        zerg.name = "ddd";
        Zerg zerg2 = new Zerg();
        zerg2.name = "dfdgfdvdd";
        Zerg zerg3 = new Zerg();
        zerg3.name = "dvfddd";
        Zerg zerg4 = new Zerg();
        zerg4.name = "dddvdsd";
        Zerg zerg5 = new Zerg();
        zerg5.name = "dsvvsdd";
        Zerg zerg6 = new Zerg();
        zerg6.name = "ddsvsvvd";
        Zerg zerg7 = new Zerg();
        zerg7.name = "ddsvsssd";
        Zerg zerg8 = new Zerg();
        zerg8.name = "dddfff";
        Zerg zerg9 = new Zerg();
        zerg9.name = "deeedd";
        Zerg zerg10 = new Zerg();
        zerg10.name = "ddffd";

        Protos protos = new Protos();
        protos.name = "llssslll";
        Protos protos2 = new Protos();
        protos2.name = "lllqqqll";
        Protos protos3 = new Protos();
        protos3.name = "llwwlll";
        Protos protos4 = new Protos();
        protos4.name = "lll3ll";
        Protos protos5 = new Protos();
        protos5.name = "llllkkkkkkkl";

        Terran terran = new Terran();
        terran.name = "pppp";
        Terran terran2 = new Terran();
        terran2.name = "pppp";
        Terran terran3 = new Terran();
        terran3.name = "pppp";
        Terran terran4 = new Terran();
        terran4.name = "pppp";
        Terran terran5 = new Terran();
        terran5.name = "pppp";
        Terran terran6 = new Terran();
        terran6.name = "pppp";
        Terran terran7 = new Terran();
        terran7.name = "pppp";
        Terran terran8 = new Terran();
        terran8.name = "pppp";
        Terran terran9 = new Terran();
        terran9.name = "pppp";
        Terran terran10 = new Terran();
        terran10.name = "pppp";
        Terran terran11 = new Terran();
        terran11.name = "pppp";
        Terran terran12 = new Terran();
        terran12.name = "pppp";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}