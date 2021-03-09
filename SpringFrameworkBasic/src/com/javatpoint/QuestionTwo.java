package com.javatpoint;


import java.util.Iterator;  
import java.util.List;  
  
public class QuestionTwo {  
private int id;  
private String name;  
private List<Answer> answers;  
  
public QuestionTwo() {}  
public QuestionTwo(int id, String name, List<Answer> answers) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
}  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    Iterator<Answer> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}  
  
}  