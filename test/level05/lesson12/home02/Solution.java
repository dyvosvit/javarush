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
        //создай по два объекта каждого класса тут
        Woman wmn1=new Woman("Tracy",33,"Raspberry Lane");
        Woman wmn2=new Woman("Lucy",22,"Mulberry Lane");
        Man mn1=new Man("Tramp",11,"Berry Lane");
        Man mn2=new Man("Luke",44,"Wisteria Lane");
        //выведи их на экран тут
        System.out.println(wmn1);
        System.out.println(wmn2);
        System.out.println(mn1);
        System.out.println(mn2);
    }

    //добавьте тут ваши классы
    public static class Man {
        private String name=null, address=null;
        private int age=33;

        public Man(){
        }

        public Man(String name){
            this.name=name;
        }

        public Man(String name, int age){
            this.name=name;
            this.age=age;
        }

        public Man(String name, String address){
            this.name=name;
            this.address=address;
        }

        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
    public static class Woman {
        private String name=null, address=null;
        private int age=33;

        public Woman (){
        }

        public Woman (String name){
            this.name=name;
        }

        public Woman (String name, int age){
            this.name=name;
            this.age=age;
        }

        public Woman (String name, String address){
            this.name=name;
            this.address=address;
        }

        public Woman (String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}

