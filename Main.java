import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList <Integer> name = new ArrayList <Integer>();
    name.add(new Integer(1));
    name.add(new Integer(2));
    name.add(new Integer(4));
    name.add(new Integer(5));
    name.add(new Integer(6));

    for (int i = 0; i < name.size(); i++)
    {
      System.out.println(name.get(i)); // printing object automatically calls its toString() method
    }

    int i = 0;
    while (i < name.size())
    {
      System.out.println(name.get(i));
    }

    for (Integer N : name)
    {
      System.out.println(N);
      System.out.println(N.intValue()); // intValue gets the int value of the Integer
    }

    int[] name = {1,2,3,4,5};

    for (int i = 0; i < name.length; i++)
    {
      System.out.println(name[i]);
    }
   
    Scanner sc = new Scanner(System.in);
    String input = "";

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    int max = 0;
    for (Integer N : arr)
    {
      if (N.intValue() > max)
      {
        max = N;
      }
    }
    return max;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
     ArrayList <Integer> temp = new ArrayList <Integer>();

     for (int i = 0; i < arr.size(); i++) // (Integer N : arr)
     {
      if (arr.get(i).intValue() % 2 == 0) // (N.intValue() % 2 == 0) and temp.add(N);
      {
        temp.add(arr.get(i));
      }
     }
     return temp;
  }
}
