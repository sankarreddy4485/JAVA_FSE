package com.javaexample.assessment5;

import java.util.Scanner;

public class OnlineExamSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Question[] questions =new Question[10];
		
		questions[0] = new Question("1", "What is your Name?", "Siva", "Ramesh", "Suresh", "Naresh", 1);
		questions[1] = new Question("2", "What is your Town?", "Kadapa", "Kurnool", "Tirupathi", "Anathapur", 2);
		questions[2] = new Question("3", "What is your scholl?", "SVBC", "Ligouri", "Little", "AVR", 3);
		questions[3] = new Question("4", "What is your age?", "28", "29", "30", "32", 4);
		questions[4] = new Question("5", "What is your baseLocation?", "Hyd", "Ban", "Chennai", "Kolkatta", 1);
		questions[5] = new Question("6", "What is your Office?", "Mindtree", "LNT", "TCS", "LNTMindtree", 4);
		questions[6] = new Question("7", "What is your techonology?", "C", "C++", "Java", ".NET", 3);
		questions[7] = new Question("8", "JAVA platformindependent/depenedent?", "platformindependent", "platformdependent", "Both", "NoneOf the above", 1);
		questions[8] = new Question("9", "What is Interface?", "Having only Method Signature", "Having Method Signature&Body", "Both", "None", 1);
		questions[9] = new Question("10", "What is abstarct class?", "Having only Method Signature", "Having Method Signature&Body", "Both", "None", 3);

		System.out.println("Welcome to Exam.Are you Ready(y-start,n-stop)");
		String message = scanner.next();
		int rightAnswer;
		String tryAgain;
		if(message.equalsIgnoreCase("Y")) {
			for(int i=0; i<questions.length;i++) {
			System.out.println(questions[i].getQuestionId()+"."+questions[i].getQuestionName());
			System.out.print("1) "+questions[i].getOption1()+"  " +"2) "+questions[i].getOption2()+"\n"+"3) "+questions[i].getOption3()+"  "+"4) "+questions[i].getOption4());
			 rightAnswer =scanner.nextInt();
			if(rightAnswer==questions[i].getRightOption()) {
				continue;
			}else {
				System.out.println("Your answer is not correct. Do you want to try again? (y-yes,n-no");
				tryAgain =scanner.next();
				if(tryAgain.equalsIgnoreCase("Y")) {
					System.out.println(questions[i].getQuestionId()+"."+questions[i].getQuestionName());
					System.out.print("1) "+questions[i].getOption1()+"  " +"2) "+questions[i].getOption2()+"\n"+"3) "+questions[i].getOption3()+"  "+"4) "+questions[i].getOption4());
					 rightAnswer =scanner.nextInt();
					 if(rightAnswer==questions[i].getRightOption()) {
							continue;
						}else {
							break;
						}
				}
				
			}
			}
		}else {
			System.out.println("Exit from Exam");
		}
	}
}
		
