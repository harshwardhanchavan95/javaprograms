package io.practice;

public class Arraysort {
	
	public static void main(String[] args){
		int[] arr={14,12,5,6,45};
		// arr[0]=14;
		// arr[1]=12;
		
		int temp=0;
		
		for(int i=0; i<arr.length; i++)
		{
		for(int j=i; j<arr.length;j++)
		{
		if(arr[i]>arr[j]){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		
		for(int i=0; i<arr.length; i++){
		System.out.println(arr[i]);
		}
		}

}
