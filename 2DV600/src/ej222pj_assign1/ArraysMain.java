/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name ArraysMain.java
 */
package ej222pj_assign1;

/**
 * @author Eric
 *
 * @date 5 sep 2016 : @time 19:56:08
 *
 */
public class ArraysMain {

	public static void main(String[] args) throws Exception{
		int[] test = {3, 1, 6, 1, 2};
        int[] sub1 = {1, 6, 7};
        int[] sub2 = {1, 2, 3};
        int[] dif = {3,1,1,1,2};
        
        System.out.println("Testing sum");
        System.out.println(Arrays.sum(test));
        
        System.out.println("\nTesting toString");
        System.out.println(Arrays.toString(test));
        
        System.out.println("\nTesting addN with 5");
        System.out.println(Arrays.toString(Arrays.addN(test, 5)));
        
        System.out.println("\nTesting reverse");
        System.out.println(Arrays.toString(Arrays.reverse(test)));
        
        System.out.println("\nTesting replace method replacing 8 with 33...");
        Arrays.replaceAll(test, 8, 33);
        System.out.println(Arrays.toString(test));
        
        System.out.println("\nTesting sort");
        System.out.println(Arrays.toString(Arrays.sort(test)));
        
        System.out.println("\nTesting has subsequence");
        System.out.println("Array: " + Arrays.toString(test));
        System.out.println("Sub1: "+ Arrays.toString(sub1));
        System.out.println("Res: " + Arrays.hasSubsequence(test, sub1));
        System.out.println("Sub2: "+ Arrays.toString(sub2));
        System.out.println("Res: "+ Arrays.hasSubsequence(test, sub2));
        
        System.out.println("\nTesting absDif with {3,1,1,1,2}");
        System.out.println("test: " + Arrays.toString(test));
        System.out.println(Arrays.toString(Arrays.absDif(test, dif)));
	}
}
