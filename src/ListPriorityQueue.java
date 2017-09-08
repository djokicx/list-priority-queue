
public class ListPriorityQueue implements PriorityQueue {
//Your class should have a constructor which takes a single integer, the initial size of the circular list to create
	int[] array;
	int tail;
	int head;
	int pos;
	
	public ListPriorityQueue (int size) {
		this.array = new int[size];
		this.tail = 0;
		this.head = 0;
		this.pos = 0;
	}

	@Override
	public Object removeSmallest() {
		if (empty()) {
			System.err.println("The array is empty. Cannot remove.");
			return null;
		}
		
		int value = array[head];
		head = next(head);
		return value;
	}

	@Override
	public void insert(int elem) {
		int index = tail;
		
        if (full()) { 
            resize(); 
        }
        
        // Finds the spot
        for (int i = head; i != tail; i = next(i)) {
        	if (array[i] > elem) {
        		index = i;
        		break;
        	}
        }
        
        // shifts everything
        for (int j = tail; j != index; j = previous(j)) {
        	array[j] = array[previous(j)];
        }
        
        array[index] = elem;
        tail = next(tail);
	}
	
	private int next(int i) {
		return ((i + 1) % array.length);
	}
	
	private int previous(int i) {
		int r = ((i - 1) % array.length);
		
		if (r < 0)
		{
		    r += array.length;
		}
		
		return r;
	}
    private boolean empty() {    	
    	return head == tail;
    }
    
    private boolean full() {
    	return tail == previous(head);
    }
	
	public void resize() {
		pos = 0;
		int[] resizedArray = new int[array.length * 2];
		
		for (int i = head; i != tail; i = next(i)) {
			resizedArray[pos] = array[i];
			pos++;
		}
		
		head = 0;
		tail = pos;
		array = resizedArray;		
	}
}
