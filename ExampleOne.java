package org.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleOne {
public static void main(String[] args) {
	System.out.println("Table of 2D array");
int a[][] = { {1 ,2 ,3 } , { 4 , 5 ,7 } , { 2, 5, 6 } };
for (int i=0; i<a.length; i++) {
	for(int j=0; j<a.length; j++) {
		System.out.print(a[i][j]+" ");
	}
	    System.out.println();
}
System.out.println("========list=========");
List <Integer> list =new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(100);
for(Integer row :list) {
	System.out.println(row);
}
System.out.println("=========set========");
Set<Integer> sei = new <Integer> HashSet();
sei.add(10);
sei.add(20);
sei.add(30);
for(int col:sei) {
	System.out.println(col);
}
System.out.println("======compare=======");
sei.retainAll(list);
list.retainAll(sei);
System.out.println(sei);
System.out.println(list);
System.out.println("======length=====");
int size = list.size();
System.out.println(size);
int size2 = sei.size();
System.out.println(size2);
}
}
