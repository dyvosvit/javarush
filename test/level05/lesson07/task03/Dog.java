package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name=null;
    private String color="black";
    private int height=5;
    //напишите тут ваш код
//- Имя
    public void initialize(String name){
        this.name=name;
    }
//- Имя, рост
    public void initialize(String name, int height){
        this.name=name;
        this.height=height;
    }
//- Имя, рост, цвет
    public void initialize(String name, int height, String color){
        this.name=name;
        this.height=height;
        this.color=color;
    }
}
