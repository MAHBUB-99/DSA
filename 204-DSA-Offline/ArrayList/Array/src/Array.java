import java.util.ArrayList;
import java.util.Collection;
 
public class Array {
    private ArrayList<String> list;
    //Constructors
    public Array()
    {
        list = new ArrayList<>();
    }
    public Array(int n)
    {
        list = new ArrayList<>(n);
    }
    public Array(Collection<String> collection)
    {
        list = new ArrayList<>(collection);
    }

    //Methods
    public String[] getArray()
    {
        return list.toArray(list.toArray(new String[0]));
    }
    public String getAnElement(int i)
    {
        return list.get(i);
    }
    public void add(String string)
    {
        list.add(string);
    }
    public void add(int index,String string)
    {
        if(index>=0 && index<=list.size())
        {
            list.add(index,string);
        }
    }
    public void remove(String string)
    {

    }
    public int findIndex(String string)
    {
        return 0;
    }
    public String[] subArray(int start,int end)
    {
        return new String []{};
    }
    public void merge(String A1,String A2)
    {

    }
    public void display()
    {
        for(String item: list)
        {
            System.out.println(item);
        }
    }
    public int length()
    {
        return list.size();
    }
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    public static void main(String[] args) {
        Array list1 = new Array();
        Array list2 = new Array(5);

        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("Apple");
        inputList.add("Banana");
        inputList.add("Cherry");

        Array list3 = new Array(inputList);

        list3.add("Mango");
        list3.add(4,"Appleeeee");

        System.out.println(list3.isEmpty());
        System.out.println(list3.length());

        list3.display();

    }
}
