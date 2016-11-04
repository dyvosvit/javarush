package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dayofweek = Integer.parseInt(reader.readLine());
        String sdayofweek;
        switch (dayofweek) {
            case 1:
                sdayofweek = "понедельник";
                break;
            case 2:
                sdayofweek = "вторник";
                break;
            case 3:
                sdayofweek = "среда";
                break;
            case 4:
                sdayofweek = "четверг";
                break;
            case 5:
                sdayofweek = "пятница";
                break;
            case 6:
                sdayofweek = "суббота";
                break;
            case 7:
                sdayofweek = "воскресенье";
            default:
                sdayofweek = "такого дня недели не существует";
        }
        System.out.println(sdayofweek);
    }
}