package lec4_lists1;


public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}
	public static IntList incrList(IntList l, int x){
//		IntList l2 = null, tmp = null;
//		while(l != null){
//			if(l2 == null) {
//				l2 = new IntList(l.first + x, null);
//				tmp = l2;
//			}
//			else {
//				l2.rest = new IntList(l.first + x, null);
//				l2 = l2.rest;
//			}
//			l = l.rest;
//		}
//		return tmp;
		if(l == null) return null;
		return new IntList(l.first + 1, incrList(l.rest, x));
	}
	public static IntList dincrList(IntList l, int x){
		IntList tmp = l;
		while(l != null){
			l.first = l.first + x;
			l = l.rest;
		}
		return tmp;
	}
public static IntList of(int ...argList){
		if(argList.length == 0){
			return null;
		}
		int[] restList = new int[argList.length - 1];
		System.arraycopy(argList, 1, restList, 0, argList.length - 1);
		return new IntList(argList[0], IntList.of(restList));
}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.get(100));
	}

	public String toString() {
		if (rest == null) {
			// Converts an Integer to a String!
			return String.valueOf(first);
		} else {
			return first + " -> " + rest.toString();
		}
	}
} 