package com.cogent.testQ1;

import java.util.Scanner;

public class Manager {
	private int taskId;
	private String taskName;
	Manager(){
		
	}
	public Manager(int taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}
	public int getTaskId() {
		
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public static void addnewTask(Manager mn[], int size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<=mn.length; i++) {
			Manager mng = new Manager();
			System.out.println("Manager " + i + " Id ");
			int taskId =sc.nextInt(); 
			System.out.println("Manager"+ i + " Task ");
			String manTask = sc.next();
			mng.setTaskId(taskId);
			mng.setTaskName(manTask);
			
		}
		System.out.println("Record created!");
		
		
		
	}
	public void updateTask(Manager manager[]) {
		System.out.println("Please ente the id of manager you want to update ");
		Scanner sc = new Scanner(System.in);
		int mnId = sc.nextInt();
		int newId;
		String newTask;
		for(int i = 0; i<manager.length; i++) {
			if(mnId == manager[i]) {
				System.out.println("Please enter the new Id!");
				newId = sc.nextInt();
				System.out.println("Please enter the new task1");
				newTask = sc.next();
				
			}
		}
		System.out.println("The records have bee updated!");
		System.out.println("the new Id is "+ newId);
		System.out.println("the new task is  "+ newTask);
		
		
		
	}
	public void deleteTask(Manager[]manager) {
		System.out.println("What task do you want to delete? ");
		Scanner sc = new Scanner(System.in);
		int tskId = sc.nextInt();
		for(int i = 0; i<manager.length; i++) {
			if(tskId == manager[i]) {
				
			}
		
	}
	public void searchTask(Manager[]manager) {
		System.out.println("What task do you want to search for ");
		Scanner sc = new Scanner(System.in);
		int tskId = sc.nextInt();
		for(int i = 0; i<manager.length; i++) {
			if(tskId == manager[i]) {
				System.out.println(" It is found! ");
			}
			else {
				System.out.println(" No taks with that Id is found ");
			}
			
		}
		
	}
	public void ShowRecords(Manager mn1[]) {
		for(int i =0; i< mn1.length; i++) {
			Manager man1 = mn1[i];
			System.out.println("Manager number " + man1.getTaskId());
			System.out.println("Manager task: "+ man1.getTaskName());
		}
		
		
	}
	
	

}
