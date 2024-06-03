//task 2
//Question (student grade calculator) : take marks of subjects as input, obtain total marks, find percentage and assign the grades according to the percentage obtained.

package codsoft;

import java.util.*;

public class StudentGradeCalculator {
	
	int  subjects;
	
	double marks[], avgPercentage, totalMarks = 0.0;
	
	Scanner sc = new Scanner(System.in);
	
	//function to input the number of subjects and marks obtained in all the subjects
	
	void input()
	{
		System.out.println("Please enter the number of subjects.");
		subjects = sc.nextInt();
		
		marks = new double[subjects];            //assigning the required memory to the array
		
		System.out.println("Please enter the marks of each subject out of 100.");
		
		for(int i=0; i < subjects; i++)
		{
			marks[i] = sc.nextDouble();
		}
	}
	
	//function to calculate the total marks, average percentage, and grade
	
	void calculateGrade()
	{
		for(int i=0; i < subjects; i++)
		{
			
		totalMarks = totalMarks + marks[i];
		
		}
		
		avgPercentage = totalMarks / subjects;
		
		System.out.println("The total marks obtained out of "+ subjects*100 + " are : "+ totalMarks);
		
		System.out.println("The average percentage obtained : "+ avgPercentage+ "%");
		
		if(avgPercentage >= 90)
		{
			System.out.println("The grade obtained is : A ");
		}
		
		else if(avgPercentage >= 70 && avgPercentage < 90)
		{
			System.out.println("The grade obtained is : B");
		}
		
		else if(avgPercentage >= 50 && avgPercentage < 70)
		{
			System.out.println("The grade obtained is : C");
		}
		
		else if(avgPercentage >= 35 && avgPercentage < 50)
		{
			System.out.println("The grade obtained is : D");
		}
		
		else
		{
			System.out.println(" FAIL ");
		}
		
	}

	public static void main(String[] args) {
		
		StudentGradeCalculator ob = new StudentGradeCalculator();
		
		ob.input();
		
		ob.calculateGrade();
	}

}
