package bonus;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class A {
		List<Object> list = new LinkedList<>();
		public boolean addAll(Collection<Object> c) {
			java.util.Iterator<Object> it = c.iterator();
			while(it.hasNext())
				this.add(it.next());
			return true;
		}
		public boolean add(Object e) {
			list.add(e);
			return true;
		}

		private int i = 0;
		public int getI(){
			return i;
		}
	}

	class B extends A {
		private int addCount = 0;
		public int getAddCount() {
			return addCount;
		}

		@Override
		public boolean addAll(Collection<Object> c) {
			addCount += c.size();
			return super.addAll(c);
		}
		
		@Override
		public boolean add(Object e) {
			addCount++;
			return super.add(e);
		}
	    
		public int i = 3;
	}


