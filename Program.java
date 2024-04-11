package Array_List;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 * 
 */
public class Program {
  public static void main(String[] args) {
    // int[] arr = {1, 3, 4};
    // int[] arr1 = new int[3];
    
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(arr1));

    // arr[0] = 0; // remove 
    // basic structure to from array lists, must use wrappers for primitive data types
    // ArrayList<Integer> arrList1 = new ArrayList<Integer>();
    // arrList1.add(4);
    // arrList1.add(5);
    // arrList1.addAll(arrList); // to add values from 1 to list

    // ArrayList<Integer> arrList = new ArrayList<Integer>(arrList1);
    // arrList.add(1);
    // arrList.add(2);
    // arrList.add(3);

    // System.out.println(arrList);
    // MyArrayList<String> mySecondArray = new MyArrayList();
    // mySecondArray.addStart("Sword");
    // mySecondArray.addStart("Shield");
    // mySecondArray.addStart("Dagger");

    // mySecondArray.Print();

    // MyArrayList<Integer> myFirstArray = new MyArrayList();
    // myFirstArray.addEnd(3);
    // myFirstArray.addEnd(7);
    // myFirstArray.addEnd(1);
    // myFirstArray.Print();
    // myFirstArray.addStart(2);
    // myFirstArray.Print();
    // myFirstArray.AddAtIndex(300, 1);
    // myFirstArray.Print();
    // myFirstArray.AddAtIndex(800, -1);
    // myFirstArray.Print();
    // myFirstArray.AddAtIndex(900, 100);
    // myFirstArray.Print();

    // try {
      // myFirstArray.DeleteAtStart();
      // myFirstArray.Print();
      // myFirstArray.DeleteAtEnd();
  //     myFirstArray.Print();
  //     System.out.println(myFirstArray.IsEmpty());
  //   } catch (Exception exception) {
  //     System.out.println(exception);
  //   }
  //     // System.out.println(myFirstArray.getElementAtIndex(0));
  //     System.out.println(myFirstArray.Size());
  //     myFirstArray.ClearAll();
  //     myFirstArray.Print();
  //     System.out.println(myFirstArray.IsEmpty());
  // } 

  MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
  myLinkedList.Append("World!");
  // Add a new Node here
  myLinkedList.Append("Hello");
  myLinkedList.Append("This");
  myLinkedList.Append("Hi");
  myLinkedList.Append("Dog");
  myLinkedList.Insert(1, "Leaf");
  myLinkedList.DeleteFront();
  System.out.println(myLinkedList.GetSize());
  System.out.println(myLinkedList);
  myLinkedList.Append("Cat");
  System.out.println(myLinkedList);
  myLinkedList.AddFront("Gato");
  System.out.println(myLinkedList);
  myLinkedList.DeleteBack();
  System.out.println(myLinkedList);
  System.out.println(myLinkedList.GetSize());
  myLinkedList.DeleteNodeBasedOnValue("Hello");
  System.out.println(myLinkedList);
}
}
