package com.example.simple;

import com.example.simple.impl.People;

public class SimpleDemoApplication {


    // format:ctrl + alt + L
    // alt+ enter    import package /auto fix
    // alt  + shift  + space ： auto complete code
    // alt + 7 / ctrl + F12  show  current file structure
    // alt + F7 / ctrl + alt + F7  find all  usages
    // shift * 2 :  find keywords
    // ctrl + F  find text in current file
    // ctrl + shift + F  find text  anywhere
    // ctrl + R  replace text in current file
    // ctrl + shift + R  replace text  anywhere
    // F4   show  variable definition
    // ctrl + alt + <-/->    go back/go ahead
    // ctrl + H ： show   class hierarchy
    // ctrl + Q ： show  comments document

    public static void main(String[] args) {// psvm + tab

        try { //ctrl + alt + T
            for (int i = 0; i < 10; i++) {// fori + tab
                System.out.println();
            }
            Math.abs(10);
            Math.abs(10);
            People p = new People();
            p.season = SeasonEnum.SPRING;
            p.eat();   //  alt + F8    evaluate  in debug

            Integer test = 999;
            Integer test2 = 999;
            int test3 = 999; // no  toString()
            System.out.println(test2.equals(test)); // 包装类对象之间值的比较，全部使用 equals 方法比较
            p.eat();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello world");  // sout + tab
        System.out.println("HELLO WORLD"); // Upper/Lower：ctrl + shift +  U

        ParameterMethod("abc", 9, 8, 7, 6);
    }

    @Override //Override： ctrl + O         Implement：ctrl + I   Implement
    public String toString() {
        return super.toString();

    }

    @Deprecated
    public static void ParameterMethod(String str, int... nums) {

        for (int num : nums) {
            System.out.println(str + num);
        }

    }
}
