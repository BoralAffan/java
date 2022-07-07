package com.company;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Affan");
        System.out.println(sb);
        sb.insert(1,2);
        System.out.println(sb);
        sb.delete(1,2);
        System.out.println(sb);
        sb.insert(2,"noob hai");
        System.out.println(sb);
        sb.delete(2,10);
        System.out.println(sb);
        sb.append(' ');
        sb.append('h');
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb);
        sb.setCharAt(0,'s');
        System.out.println(sb);
        sb.insert(1,'a');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
