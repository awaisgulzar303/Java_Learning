package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Student s1 =new Student("Awais",27,"Lahore","2121sds","A");
   Student s2=new Student("Bilal",27,"Lahore","2121sdsss","A");
   Student s3=new Student("Farhad",27,"Lahore","2121sxsds","A");


  Teacher t1=new Teacher("Waqas",33,"lahore","PF","eew222");
  Teacher t2=new Teacher("Aizaz",33,"lahore","OOP","eew222");
  Teacher t3=new Teacher("Waqas",33,"lahore","Math","eew222");
  Teacher t4=new Teacher("Aizaz",33,"lahore","DSA","eew222");


  Subject sb1=new Subject("PF","PF1");
  Subject sb2=new Subject("OOP","OOP1");
  Subject sb3=new Subject("DSA","DSA1");
  Subject sb4=new Subject("MATH","MATH1");


  List<Student> studentList= Arrays.asList(s1,s2,s3);
  List<Teacher> teachersList=Arrays.asList(t1,t2,t3,t4);
  List<Subject> subjectList = Arrays.asList(sb1, sb2, sb3, sb4);



  Univeristy u1=new Univeristy("UMT","Johar town",studentList,teachersList,subjectList);

 System.out.println( u1.getStudents());

    }

}