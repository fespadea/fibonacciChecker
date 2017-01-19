package com.company;

/**
 * Created by fs279 on 1/19/17.
 */
public class fib {
    public static boolean checker(int pi, int start, int other){
        try {
            if (pi == start) {
                return true;
            } else {
                if(start == 0){
                if(checker(pi, start + other, 1)){
                    return true;
                }}
                else{
                    if(checker(pi, start + other, start)){
                        return true;
                    }
                }
            }
        }catch(StackOverflowError e){
            return false;
        }
        return false;
    }
    public static void sequence(int pi, int start, int other){
        if (pi != start) {
            if(start == 0){
                if(checker(pi, start + other, 1)){
                    System.out.print(0);
                    sequence(pi, start + other, 1);
                }}
            else{
                if(checker(pi, start + other, start)) {
                    System.out.print(", " + start);
                    sequence(pi, start + other, start);
                }
                }
            }
        }
    }
