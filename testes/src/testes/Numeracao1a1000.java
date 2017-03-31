package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Numeracao1a1000  {
	public static void main(String[] args) {
		List<Integer> sequencia = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i =0;i<=1000;i++) {
			sequencia.add(rand.nextInt(1000));
		}
		Iterator<Integer> iterator = sequencia.iterator();
		
		
		
		Comparator<Integer> comparador = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		
		Collections.sort(sequencia, comparador);
			
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}




}
