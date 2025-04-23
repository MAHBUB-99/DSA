import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main (String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(3);
//
//        System.out.println(arrayList);
//
//        arrayList.add(0,0);
//        System.out.println(arrayList);
//
//        arrayList.set(0,10);
//        System.out.println(arrayList);
//
//        arrayList.remove(0);
//        System.out.println(arrayList);
//
//
//        System.out.println(arrayList.contains(2));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.indexOf(3));
//        System.out.println(arrayList.lastIndexOf(3));
//
//        Collections.reverse(arrayList);
//
//        System.out.println(arrayList);
//
//        Collections.rotate(arrayList,2);
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
        ArrayList<Integer>list= new ArrayList<>(List.of(2,3,2,4,2,5));
        System.out.println(list);
//        list.removeIf(n->n==2);
//        System.out.println(list);

//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(list.get(list.size()-2));
        //Reverse
        int left=0,right = list.size()-1;
        while(left<right)
        {
            int temp = list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.println(list);

        ArrayList<Integer>list1= new ArrayList<>(List.of(1,1,2,3,2,1,1));
        System.out.println(list1);
        // pallindromecheck
        boolean isPalindrome = true;
        for(int i=0;i<list1.size()/2;i++)
        {
            if(!list1.get(i).equals(list1.get(list1.size()-i-1)))
            {
                isPalindrome = false;break;
            }
        }
        System.out.println(isPalindrome);
        System.out.println(list.equals(list1));

        for(int i:list1)
        {
            if(!list.contains(i))
            {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}