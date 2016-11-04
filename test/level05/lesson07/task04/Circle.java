package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX=0;
    private int centerY=0;
    private int radius=10;
    private int width=1;
    private String color="black";
    //напишите тут ваш код
//- centerX, centerY, radius
    public void initialize(int centerX, int centerY, int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }
    //- centerX, centerY, radius, width
    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX=centerX;
        this.centerY=centerY;
        this.width=width;
        this.radius=radius;
    }

//- centerX, centerY, radius, width, color
    public void initialize(int centerX, int centerY, int radius, int width, String color){
        this.centerX=centerX;
        this.centerY=centerY;
        this.width=width;
        this.radius=radius;
        this.color=color;
    }
}
