package structures.list

import algorithms.list.Node

class LinkedList<T> {
	private val start: SingleNode<T>? = null

	val isEmpty: Boolean get() = start == null
	val count: Int get() = start?.count() ?: 0

	constructor() {

	}

	constructor(vararg values: T) {
		values.map { SingleNode(it) }
	}

	fun append(value: T) {
		val node = SingleNode(value)
		val last = node.getLast()
		last.next = node
	}

	private class SingleNode<T>(
		data: T,
		var next: Node<T>? = null
	): Node<T>(data) {
		override tailrec fun count(acc: Int): Int {
			if (next == null) return acc
			return this.count(acc + 1)
		}

		override tailrec fun getLast(): SingleNode<T> {
			if (next == null) return this
			return this.getLast()
		}
	}
}