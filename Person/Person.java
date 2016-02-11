import java.util.ArrayList;
import java.util.Collections;
public class Person implements Comparable<Person>
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int compareTo(Person other)
    {
        return name.compareTo(other.getName());
    }
    
    public String toString()
    {
        return "Name: " + this.name;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Bob"));
        list.add(new Person("Nicholas"));
        list.add(new Person("Darren"));
        list.add(new Person("Rick"));
        list.add(new Person("Jackie"));
        list.add(new Person("Joe"));
        list.add(new Person("Sasha"));
        list.add(new Person("Steven"));
        list.add(new Person("Johnson"));
        list.add(new Person("Connor"));
        Collections.sort(list);
        System.out.println(list);
        
        Person first = list.get(0);
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i).compareTo(first) < 0)
            {
                first = list.get(i);
            }
        }
        System.out.println(first);
        
        Person last = list.get(0);
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i).compareTo(first) > 0)
            {
                last = list.get(i);
            }
        }
        System.out.println(last);
    }
}