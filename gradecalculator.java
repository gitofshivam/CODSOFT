package internship.java;
import java.util.*;

class Main {
  public static void main(String[] args) {
    float total = 0;
    float average;
    System.out.println("enter the number of subjects");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] grade = new String[n];
    int[] subjectMarks = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("enter the marks of subject " + (i + 1));
      subjectMarks[i] = sc.nextInt();
      if (subjectMarks[i] > 90) {
        grade[i] = "A";
      } else if (subjectMarks[i] > 80 && subjectMarks[i ] <= 90) {
        grade[i] = "B";
      } else if (subjectMarks[i] > 70 && subjectMarks[i] <= 80) {
        grade[i] = "C";
      } else if (subjectMarks[i] > 60 && subjectMarks[i] <= 70) {
        grade[i] = "D";
      } else if (subjectMarks[i] > 50 && subjectMarks[i] <= 60) {
        grade[i] = "E";
      } else if (subjectMarks[i] > 40 && subjectMarks[i] <= 50) {
        grade[i] = "F";
      } else {
        grade[i] = "fail";
      }
    }
    System.out.println("report card");
    System.out.println("subject\tmarks\tgrade");

    for (int i = 0; i < n; i++) {
      System.out.println(i + 1 + "\t" + subjectMarks[i] + "\t" + grade[i]);
    }
    for (int i = 0; i < n; i++) {
      total += subjectMarks[i];
    }
    average = total / n;
    if (average > 90) {
      System.out.println("overall grade A");
    } else if (average > 80 && average <= 90) {
      System.out.println("overall grade B");
    } else if (average > 70 && average <= 80) {
      System.out.println("overall grade c");
    } else if (average > 60 && average <= 70) {
      System.out.println("overall grade D");
    } else if (average > 50 && average <= 60) {
      System.out.println("overall grade E");
    } else if (average > 40 && average <= 50) {
      System.out.println("overall grade F");
    } else {
      System.out.println("fail");
    }
    System.out.println("percentage is "+average);
  }
}