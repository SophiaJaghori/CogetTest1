package com.cogent.testQ1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Todo_Manager {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Collection <Manager>m = new ArrayList<Manager>();
		Manager[]mangArray = null;
		
		
		System.out.println("*****Menu******");
		System.out.println("1 - Adding a new task");
		System.out.println("2 - Updating a new task");
		System.out.println("3 - Deleting a new Task");
		System.out.println("4- Searching a new task");
		System.out.println("5 - Show all the records");
		System.out.println("6 - Exit! ");
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("Please enter your choice!");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("How manay manager You want to add? ");
				int size= sc.nextInt();
				mangArray= new Manager[size];
				manager.addnewTask(mangArray, size);
				break;
			case 2:
				System.out.println("update Manager class ");
				manager.updateTask(mangArray);
				break;
			case 3:
				System.out.println("delete a Manager");
				m1.deleteTask();
				break;
			case 4:
				System.out.println("search for a manager ");
				m1.searchTask();
				
				break;
			case 5:
				System.out.println("show all the records");
				manager.ShowRecords(mangArray);
				break;
			case 6:
				System.out.println("0 to exit the application ");
				default:
					System.out.println("Please enter the correct choice! ");
					
			}
			
		}while(choice!=0);
		
		
	}

}
