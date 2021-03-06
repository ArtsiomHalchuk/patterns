package by.epam.training.test;

import java.util.Comparator;

public interface MyList <T> {
	void add(T obj);
	void add(int index, T obj);
	T remove();
	T remove (int index);
	void sort();
	void sort(Comparator<T> comparator);

}
