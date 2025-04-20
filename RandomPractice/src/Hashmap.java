import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"One");
        hashmap.put(2,"Two");
        hashmap.put(3,"Three");
        hashmap.put(4,"Four");
        hashmap.put(5,"Five");
        hashmap.put(6,"Six");
        System.out.println(hashmap);


        for(Integer i: hashmap.keySet())
        {
            System.out.println(i+"-"+hashmap.get(i));
        }

        hashmap.forEach((key,value)-> {
            System.out.println(key+" "+value);
        });

        hashmap.forEach((key,value)->{
            if(value.contains("Two"))
            {
                System.out.println("Found:: "+ value);
            }
        });

        hashmap.replaceAll((key,value)-> value.toUpperCase());
        hashmap.entrySet().removeIf(entry->entry.getKey()>3);
        System.out.println(hashmap);

        hashmap.entrySet().removeIf(entry -> entry.getKey()%2==0);
        System.out.println(hashmap);
        System.out.println(hashmap.entrySet());

        hashmap.forEach((key,value)->{
            if(value.startsWith("O"))
            {
                System.out.println("Starts with O-   "+value);
            }
        });

        hashmap.entrySet().forEach(entry-> System.out.println(entry));

    }

}
