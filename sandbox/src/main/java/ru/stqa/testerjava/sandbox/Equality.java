package ru.stqa.testerjava.sandbox;

public class Equality
{
  public static void main(String[] args)
  {
    String s1 = "firefox";
    String s2 = "firefox";

    System.out.print(s1 == s2);
    System.out.print(s1.equals(s2));

  }
}
