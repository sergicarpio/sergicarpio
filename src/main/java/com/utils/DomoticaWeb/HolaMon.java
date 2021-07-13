package com.utils.DomoticaWeb;

public class HolaMon {
    private static int a; /* Variable numerica */
    private static int actualizar(int x) {
        x=1;
        return x;
    }
    public static void main(String[] args){
        a=actualizar(a);
        if (a==1 || a==3) System.out.println("Hola Mon");
    }


}
