package com.project.reference;

public class Main {
  public static void main(String[] args) {
    int intA = 1;
    int intB = intA;
    System.out.println("IntA: " + intA);
    System.out.println("IntB: " + intB);
    intA = 2;
    System.out.println("IntA: " + intA);
    System.out.println("IntB: " + intB);
    MyObject myObjA = new MyObject(1);
    MyObject myObjB = myObjA;
    System.out.println("myObjA: " + myObjA);
    System.out.println("myObjB: " + myObjB);
    myObjA.setNum(2);
    System.out.println("myObjA: " + myObjA);
    System.out.println("myObjB: " + myObjB);
  }
}
