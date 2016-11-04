package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private int top=0;
    private int left=0;
    private int width=0;
    private int height=0;

    public Rectangle (int left){
        this.left=left;
        this.top=0;
        this.width=0;
        this.height=0;
    }

    public Rectangle(int left, int top){
        this.left=left;
        this.top=top;
        this.width=0;
        this.height=0;
    }

    public Rectangle (int left, int top, int width){
        this.left=left;
        this.top=0;
        this.width=width;
        this.height=width;
    }
    public Rectangle(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }

    public Rectangle(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }//напишите тут ваш код

}
