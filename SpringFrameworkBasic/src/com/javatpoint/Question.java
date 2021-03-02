package com.javatpoint;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int question_Number;
	private String problem;
	private List<String> answers;
	

	public Question() {
		// TODO Auto-generated constructor stub
	}
	public Question(int question_Number, String problem,List<String> answers)
	{
		this.question_Number=question_Number;
		this.problem=problem;
		this.answers=answers;
	}
	
	public void displayInfo() {
		System.out.println("Question No. - " +question_Number+ ", Problem - "+problem);
		System.out.println("Answer of the Problem - "+question_Number);
		Iterator<String> itr = answers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
