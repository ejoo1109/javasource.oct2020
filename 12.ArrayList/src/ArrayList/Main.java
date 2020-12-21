package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Eriaca");
		List<String> b = new ArrayList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		// b를 a로 병합 
		ListIterator<String> aiter = a.listIterator();
		Iterator<String> biter = b.iterator();
		
		while(biter.hasNext()) {
			if(aiter.hasNext()) aiter.next();
			aiter.add(biter.next());
		}
		System.out.println(a);
		
		// b에서 모든 두번째 단어 삭제
		biter = b.iterator();
		while(biter.hasNext()) {
			biter.next();
			if(biter.hasNext()) {
				biter.next();
				biter.remove();
			}
		}
		System.out.println(b);
		
		// a에서 b에 있는 모든 단어 삭제
		a.removeAll(b);
		System.out.println(a);
		
	}
}
