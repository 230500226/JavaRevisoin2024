/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarevision2024;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ldxt460s
 */
public class Token {
    public static void capitalise() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence🙏, capitalise: ");
        String sentence = input.nextLine();
        StringTokenizer token = new StringTokenizer(sentence);
        while(token.hasMoreTokens()){
            String word = token.nextToken();
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));

        }
    }
    public static void vowel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence🙏, vowel: ");
        String sentence = input.nextLine();
        StringTokenizer token = new StringTokenizer(sentence);
        while(token.hasMoreTokens()){
            String word = token.nextToken();
            if(word.matches("[aeiouAEIOU]\\w*")){
                System.out.println(word);
            }
        }
    }
    public static void countWords() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence🙏, countWords: ");
        String sentence = input.nextLine();
        StringTokenizer token = new StringTokenizer(sentence);
        int count = 0;
        while(token.hasMoreTokens()){
            token.nextToken();
            count++;
        }
        System.out.println("The number of words in the sentence is: " + count);
    }

}
