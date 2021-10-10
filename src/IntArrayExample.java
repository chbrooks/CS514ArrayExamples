/* some examples of code that creates and manages an array. */

public class IntArrayExample {
    
    public int[] intArray;
    
    /* What if we have a sorted array, and we need to add a new element? */

    public IntArrayExample() {
        intArray = new int[10];
    }
    public IntArrayExample(int size) {
        intArray = new int[size];
    }



    public void addElement(int newElement, int position) {
        /* We'll put the new array here */
        int[] temp = new int[intArray.length + 1];

        /* copy over everything before position */
        for (int i = 0; i < position; i++) {
            temp[i] = intArray[i];
        }
        /* insert the new element */
        temp[position] = newElement;

        /* copy over the rest of array into temp */
        for (int i = position + 1; i < temp.length;i++) {
            temp[i] = intArray[i-1];
        }
        intArray=temp;


    }

    /* let's remove the element at position */
    public void removeElement(int position) {
        /* really, all we need to do is slide everything after position to the left by 1. */
        for (int i = position+1; i < intArray.length; i++) {
            intArray[i-1] = intArray[i];
        }

    }

    public static void main(String[] args) {
        IntArrayExample example = new IntArrayExample(10);
        for (int i = 0; i < example.intArray.length; i++) {
            example.intArray[i] = i;
        }
        example.addElement(11, 3);
        for (int i = 0; i < example.intArray.length; i++) {
            System.out.printf("%d ", example.intArray[i]);
        }
        System.out.println();
        example.removeElement(4);
        for (int i = 0; i < example.intArray.length; i++) {
            System.out.printf("%d ", example.intArray[i]);
        }
        System.out.println();


    }


}
