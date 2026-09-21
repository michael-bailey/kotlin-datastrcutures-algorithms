package algorithms.list

abstract class Node<T>(
	var data: T,
) {

	abstract fun count(acc: Int = 1): Int
	abstract fun getLast(): Node<T>

}