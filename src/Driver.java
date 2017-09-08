import java.util.Arrays;


public class Driver {
	public static void main (String[] args) {
		ListPriorityQueue p = new ListPriorityQueue(3);
		p.insert(100);
		p.insert(5);
	
		p.removeSmallest();
		p.removeSmallest();
		System.out.println(Arrays.toString(p.array));
		System.out.println(p.head);
		System.out.println(p.tail);
		
		p.insert(100);
		p.insert(5);
		p.insert(100);
		p.insert(15);
		p.insert(1);
		
		p.removeSmallest();
		p.removeSmallest();
		p.removeSmallest();
		p.removeSmallest();
		p.removeSmallest();

		
		p.insert(9);
		p.insert(8);
		p.insert(7);
		p.insert(6);
		p.insert(5);
		p.insert(6);
		
		p.removeSmallest();
		p.removeSmallest();
		p.removeSmallest();
		p.removeSmallest();
		p.removeSmallest();
		p.removeSmallest();
		
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);
		p.insert(2);


		
		
		System.out.println(Arrays.toString(p.array));
		System.out.println(p.head);
		System.out.println(p.tail);
		
		
	}
}
