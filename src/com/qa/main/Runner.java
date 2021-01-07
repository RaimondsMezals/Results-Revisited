package com.qa.main;

public class Runner {

	static int physics = 84;
	static int chemistry = 150;
	static int biology = 150;
	static int total;
	static double percentage;
	static double passMark = 60;
	static int examsFailed;
	
	public static void results() {
		
		System.out.println("Total mark for physics is " + physics + " out of 150");
		System.out.println("Total mark for chemistry is " + chemistry + " out of 150");
		System.out.println("Total mark for biology is " + biology + " out of 150");
		
	}
	
	public static void percentageResults() {
		
		total = physics + chemistry + biology;
		
		physics = physics * 100 / 150;
		chemistry = chemistry * 100 / 150;
		biology = biology * 100 / 150;
		
		if(physics < passMark) {
			examsFailed++;
		}
		if(chemistry < passMark) {
			examsFailed++;
		}
		if(biology < passMark) {
			examsFailed++;
		}
		
		percentage = total * 100 / 450;
		
		if (percentage >= passMark && physics >= passMark && chemistry >= passMark && biology >= passMark) {
			System.out.println("Well dont you have passed! Yout have achieved an overall grade of " + percentage + "%");
			System.out.println("Number of exams failed is " + examsFailed);
			
		}else if(physics < passMark && chemistry >= passMark && biology >= passMark) {
			System.out.println("Unfortunately you have failed as your physics mark does not exceed " + passMark + "%");
			System.out.println("Number of exams failed is " + examsFailed);
			
		}else if(physics >= passMark && chemistry < passMark && biology >= passMark) {
			System.out.println("Unfortunately you have failed as your chemistry mark does not exceed " + passMark + "%");
			System.out.println("Number of exams failed is " + examsFailed);
		
		}else if(physics >= passMark && chemistry >= passMark && biology < passMark) {
			System.out.println("Unfortunately you have failed as your biology mark does not exceed " + passMark + "%");
			System.out.println("Number of exams failed is " + examsFailed);
		
		}else {
			System.out.println("Unfortunately you have failed as you have failed all of your exams.");
			System.out.println("Number of exams failed is " + examsFailed);
		}
	}
	
	
	public static void main(String[] args) {
		
		results();
		percentageResults();
		
	}

}