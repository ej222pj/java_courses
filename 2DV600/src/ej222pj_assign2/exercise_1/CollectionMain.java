/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2
 * 
 * @file_name CollectionMain.java
 */
package ej222pj_assign2.exercise_1;

/**
 * @author Eric
 *
 * @date 12 sep 2016 : @time 16:42:49
 *
 */
public class CollectionMain {

	public static void main(String[] args) {
		/*
		 * 
		 * Testing ArrayIntStack
		 * 
		 */
		System.out.println("Testing ArrayIntStack!");
		//Create new ArrayIntStack
		ArrayIntStack arrayIntStack = new ArrayIntStack();

		//Add 5 values to the stack
		System.out.println("\nAdd to arrayIntStack");
		for (int i = 1; i <= 5; i++) {
			arrayIntStack.push(i);
			System.out.println("Added " + i + " to arrayIntStack");
		}
		System.out.println("Current Stack: " + arrayIntStack.toString());
		
		//Pop 1 value
		int popOne = arrayIntStack.pop();
		System.out.println("\nPop-returned: " + popOne);
		System.out.println("Current Stack: " + arrayIntStack.toString());
		//Pop another value
		int popTwo = arrayIntStack.pop();
		System.out.println("Pop-returned: " + popTwo);
		System.out.println("Current Stack: " + arrayIntStack.toString());
		
		//Peek at last value
		int peek = arrayIntStack.peek();
		System.out.println("\nPeek: " + peek);
		
		System.out.println("\nEmpty the ArrayIntStack\n");
		for (int i = 1; i <= arrayIntStack.size(); i++) {
			arrayIntStack.pop();
		}
		
		/*
		 * 
		 * Testing ArrayIntList
		 * 
		 */
		System.out.println("Testing ArrayIntList!");
		//Create new ArrayIntList
		ArrayIntList arrayIntList = new ArrayIntList();
		
		//Test Add
		for (int i = 1; i <= 5; i++) {
			arrayIntList.add(i * 10);
			System.out.println("Adding: " + i * 10 + " To ArrayIntList");
		}
		System.out.println("arrayIntList.toString(): " + arrayIntList.toString());
		//Test size
		System.out.println("Size of arrayIntList: " + arrayIntList.size());
		
		//Test Resize
		System.out.println("\nTry resize, started at: " + arrayIntList.size());
		for (int i = 0; i < 10; i++) {
			arrayIntList.add(i);
		}
		System.out.println("Now the size is: " + arrayIntList.size());
		
		//Test remove
		arrayIntList.remove(1);
		arrayIntList.remove(2);
		System.out.println("\nRemoved 2 elements: " + arrayIntList.toString());
		System.out.println("New size: " + arrayIntList.size());
				
		//Test to add at specific index
		arrayIntList.addAt(13, 5);
		System.out.println("\nAdded 13 at index 5. List: " + arrayIntList.toString());
		
		//Test Get
		int getFirst = arrayIntList.get(0);
		int getLast = arrayIntList.get(arrayIntList.size() - 1);
		int getSpecific = arrayIntList.get(6);
		System.out.println("\nGet First: " + getFirst + " Get Last " + getLast + " Get Specific(6): " + getSpecific);
		
		//Test IndexOf
		int specificIndex = arrayIntList.indexOf(6);
		int outOfBoundsIndex = arrayIntList.indexOf(40);
		System.out.println(arrayIntList.toString());
		System.out.println("\nFirst index of 6: " + specificIndex);
		System.out.println("First index of 30: " + outOfBoundsIndex);
		
		//Testing IndexOutOfBoundsException Errors for ArrayIntList
		try {
			arrayIntList.addAt(30, 30);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("\nAdded at index outside arrayIntList, Caught Error Message: " + e);
		}
		
		try {
			arrayIntList.remove(30);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Removed at index outside arrayIntList, Caught Error Message: " + e);
		}
		
		try {
			arrayIntList.get(30);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Get at index outside arrayIntList, Caught Error Message: " + e);
		}
		
		//Testing IndexOutOfBoundsException Errors for ArrayIntStack
		try {
			arrayIntStack.pop();
		} catch (IndexOutOfBoundsException e) {
			System.err.println("\nTried to Pop on empty arrayIntStack, Caught Error Message: " + e);
		}
		
		try {
			arrayIntStack.peek();
		} catch (IndexOutOfBoundsException e) {
			System.err.println("\nTried to Peek on empty arrayIntStack, Caught Error Message: " + e);
		}
	}
}
