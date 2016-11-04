package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int t;
        if (a<b){t=b;b=a;a=t;}
        if (b<c){t=b;b=c;c=t;}
        if (a<b){t=b;b=a;a=t;}
        System.out.println(a+" "+b+" "+c);
    }
}
