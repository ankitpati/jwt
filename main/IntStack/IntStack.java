/* IntStack.java */
/* Date  : 22 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.ankitpati.intstack;

public class IntStack implements Growable{
    int stack[], top;

    public IntStack()
    {
        stack = new int[5];
        top = 0;
    }

    public void push(int element)
    {
        ensureCapacity(top + 1);
        stack[top++] = element;
    }

    public int pop() throws EmptyException
    {
        if(top == 0) throw new EmptyException("Stack empty.");
        return stack[--top];
    }

    public int getCapacity()
    {
        return stack.length;
    }

    public void ensureCapacity(int capacity)
    {
        int temp[], i;

        if(stack.length >= capacity) return;

        temp = new int[stack.length * 2];
        for(i = 0; i < top; ++i) temp[i] = stack[i];
        stack = temp;
    }

    public int getTop()
    {
        return top;
    }
};
/* end of IntStack.java */

/* OUTPUT

$ javac -d . IntStack.java

./in/edu/sitpune/ankitpati/intstack/IntStack.class

*/
