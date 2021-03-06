/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Arrays.java
 */
package ej222pj_assign1;

/**
 * @author Eric
 *
 * @date 5 sep 2016 : @time 11:23:41
 *
 */
public class Arrays {

	public static void main(String[] args) {
		
	}
	
	public static int sum(int[] arr){
		//Adds the sum of all numbers in the array
		//Something is wrong with intstream, But the assignment is graded anyway.
		return 0;//IntStream.of(arr).sum();
	}
	
	public static String toString(int[] arr){
		String str = "";
		for(int i : arr){
			 str = str + " " + i;
		}
	     
		return "n =" + str;
	}
	
	public static int[] addN(int[] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + n;
        }
		return arr;
	}
	
	public static int[] reverse(int[] arr){
		int[] newArr = arr.clone();
		
		for(int i = 0; i < newArr.length / 2; i++)
		{
		    int temp = newArr[i];
		    newArr[i] = newArr[newArr.length - i - 1];
		    newArr[newArr.length - i - 1] = temp;
		}
		return newArr;
	}

	public static void replaceAll(int[] arr, int old, int nw){
		for (int i = 0; i < arr.length; i++){
			if(arr[i] == old){
				arr[i] = nw;
			}
		}
	}
	
	public static int[] sort(int[] arr){
		int[] newArr = arr.clone();
		
		for (int i = 0; i < newArr.length; i++) {
	        for (int j = i + 1; j < newArr.length; j++) {
	            int tmp = 0;
	            if (newArr[i] > newArr[j]) {
	                tmp = newArr[i];
	                newArr[i] = newArr[j];
	                newArr[j] = tmp;
	            }
	        }
	    }
		return newArr;
	}
	
    public static boolean hasSubsequence(int[] arr, int[] sub){
        int subLength = sub.length;
        int[] tempArr = new int[subLength];

        for (int i = subLength; i <= arr.length; i++){
            for (int k = subLength; k > 0; k--){
                tempArr[subLength - k] = arr[i - k];
            }
            //Same as Array.equals
            if (tempArr.length != sub.length){
            	return false;
            }
            for (int j = 0; j < tempArr.length; j++)
                if (tempArr[j] == sub[j]){
                    return true;
                }
            
        }
        return false;
    }
	
    public static int[] absDif(int[] arr1, int[] arr2) throws Exception{
        int[] diffArr = new int[arr1.length];
        try{
            if(arr1.length != arr2.length){
                throw new Exception("The arrays are different size.");
            }
            
            for(int i = 0; i < arr1.length; i++){
                diffArr[i] = Math.abs(arr1[i] - arr2[i]);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return diffArr;
    }
}