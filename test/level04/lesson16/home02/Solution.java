package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int mint=0,maxt=0;
        if (a<b && a<c) mint=a;
        else if (b<a && b<c) mint=b;
        else if (c<a && c<b) mint=c;
        if (a>b && a>c) maxt=a;
        else if (b>a && b>c) maxt=b;
        else if (c>a && c>b) maxt=c;
        System.out.println(a+b+c-maxt-mint);
    }
}
