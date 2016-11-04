package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,+
- Имя, вес, возраст+
- Имя, возраст (вес стандартный)+
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)+
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name=null;
    private int age=5;
    private int weight=5;
    private String address=null;
    private String color="black";

    //напишите тут ваш код
    //- Имя,+
    public void initialize(String name){
        this.name=name;
    }

    //- Имя, вес, возраст+
    public void initialize(String name, int weight, int age){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
//        - Имя, возраст (вес стандартный)+
    public void initialize(String name, int age){
        this.name=name;
        this.age=age;
    }
//        - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)+
    public void initialize(int weight, String color){
        this.weight=weight;
        this.color=color;
    }
//        - вес, цвет, адрес ( чужой домашний кот)
    public void initialize(int weight, String color, String address){
        this.weight=weight;
        this.color=color;
        this.address=address;
    }

}
