import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static class Person{
		int age;
		String name;
		
		public Person(int a, String n) {
			this.age = a;
			this.name = n;
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Vector<Person> OnlineGurge = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            OnlineGurge.add(new Person(age, name));
        }
        Collections.sort(OnlineGurge, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return Integer.compare(a.age, b.age);
            }
        });
        
        for(int i=0;i<n;i++) {
        	Person person = OnlineGurge.get(i);
        	System.out.println(person.age + " " + person.name);
        }

        sc.close();
    }
}