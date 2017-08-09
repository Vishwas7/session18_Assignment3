package CollectionInJava;
/**
 * In here importing class, which are belong from java.util.package
 */
import java.util.ArrayList;
/**
 * 
 * @author Vishwas
 * In this program i've Created a class named UsingArrayList,and also created
 *  an object of ArrayList class and perform the following functions:
 *  Find the number of elements present in the array list.
 *  Check whether an element is present in ArrayList or not.
 *  Convert ArrayList into Array.
 *  Replace the third element of ArrayList with a given value.
 *  as mention in the question.
 *
 */
public class UsingArrayList {
	public static void main(String[] args) {
		/**
		 * In here created ArrayList object as mention in the question
		 * and than i've add some elements  in ElementList by 
		 * using add method and also used for loop 
		 * and than print the elements in the window console
		 */
		ArrayList<String> dayArrayList = new ArrayList<String>();
		
		dayArrayList.add("Monday");
		dayArrayList.add("Tuesday");
		dayArrayList.add("Wednesday");
		dayArrayList.add("Thusday");
		dayArrayList.add("Friday");
		dayArrayList.add("Saturday");
		dayArrayList.add("Sunday\n");
		
		
		for (String dayName : dayArrayList) {
			System.out.println(" Day name = " + dayName);
		}

		/**
		 * In here find the number of elements present in the 
		 * array list as mention in the question.
		 * and than calling size method which will returns the 
		 * number of elements in this list.
		 * 		 
		 */
		int elementsInList = dayArrayList.size();
		System.out.println("\nSize of list = " + elementsInList);

		/**
		 * IN here checking whether an element is present in ArrayList or not.
		 * and to find the element is present in ArrayList or not i've contain Method;
		 * contains() method returns true if and only if this string contains 
		 * the specified sequence of char values. 
		 * and than applying the if condition to check the element is present 
		 * in ArrayList or not.
		 * 
		 */
		boolean retval = dayArrayList.contains("Wednesday");
		

		System.out.println("\nchecking element is present in ArrayList or not");
		if (retval == true) {
			System.out.println("element Wednesday present in ArrayList \n");
		} else {
			System.out.println("element Wednesday  is not present in ArrayList\n");
		}

		/**
		 * In here convert ArrayList into Array as mention the question;
		 * to convert ArrayList into Array i've used the toArray Method
		 * toArray(T[]) method returns an array containing all of the
		 * elements in this list in proper sequence.
		 */
		
		String[] elementListasArray = dayArrayList.toArray(new String[elementsInList]);
		
		System.out.println(elementListasArray[0]);
		

		/**
		 * In here replace the third element of 
		 * ArrayList as mention the question 
		 * to replace a element i'm using set method
		 * set() replaces the element 
		 * at the specified position in this list with the 
		 * specified element.
         */
		dayArrayList.set(3,"Birthday");
		
		System.out.println("ArrayList after replace:\n" + dayArrayList);

		}
	    
}

