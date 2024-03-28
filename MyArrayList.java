package Array_List;

import java.util.Arrays;

public class MyArrayList {
  
  private int[] elements;
  private int size;
  private final int CAPACITY = 10;
 
  public MyArrayList() {
    // create an array with an initial size of 10
    elements = new int[CAPACITY]; // initial capacity
    size = 0; // keeps track on number of elements in our array
  }

  public void addStart(int elementToAdd) {
    ExpandCapacity();

    for (int i = size; i >= 0; i--) {
      elements[i + 1] = elements[i];
    }
    elements[0] = elementToAdd;
    size++;
  }

  public void addEnd(int elementToAdd) {
    ExpandCapacity();
    elements[size] = elementToAdd;
    size++;
    // check the capacity
  }

/**
 * checks capacity of our elements array and 
 * increases its capacity if there isn't enough space
 */

  private void ExpandCapacity() {
    if (size == elements.length) {
      //  increase capacity of the array
      // int[] newElement = new int[elements.length + CAPACITY]; // increase array by capacity
      int[] newElement = new int[elements.length * 2]; // increase array by doubling it
      for (int i = 0; i < size; i++) {
        newElement[i] = elements[i];
      }

      elements = newElement;
    }
  }

  public void Print() {
    for(int i = 0; i < size; i++){
      System.out.print(elements[i] + " ");
    }
    System.out.println();
  }

  public void AddAtIndex(int elementToAdd, int indexToAddAt){
    if (indexToAddAt > size || indexToAddAt < 0) {
      // throw an error
      // add to index if user addition wants to add an invalid entry
      addEnd(elementToAdd);
    } else {
    ExpandCapacity();

    for (int i = size; i >= 0; i--) {
      elements[i + 1] = elements[i];
    }
    elements[indexToAddAt] = elementToAdd;
    size++;
    }
  }
  public int getElementAtIndex(int index) {
    if (index >= size || index < 0) {
      return elements[size -1];
  
    }
    
      return elements[index];

  }

}
