import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PeekingIterator{
	public static void main(String[] args){
		List<Integer> myList = new ArrayList<Integer>();
		Iterator<Integer> myIterator;
		
		
		
	/*	for(int i=1;i<4;i++){
			myList.add(i);
	}*/
		myIterator = myList.iterator();
		Peeking temp = new Peeking(myIterator);
		
		System.out.println(temp.hasNext());
}
}
class Peeking implements Iterator<Integer> {

	private Integer next;
	private Iterator<Integer> itr;
	private boolean done = false;
	public Peeking(Iterator<Integer> iterator) {
	    itr = iterator;
	    if (iterator.hasNext())
	        next = itr.next();
	    else
	        done = true;
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
	    return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer result = next;
	    if (itr.hasNext()) {
	        next = itr.next();
	    } else {
	        next = null;
	        done = true;
	    }
	    return result;
	}

	@Override
	public boolean hasNext() {
	    return !done;
	}
}
