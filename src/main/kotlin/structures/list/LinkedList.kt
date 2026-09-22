package structures.list

import algorithms.list.Node

class LinkedList<T> {
	private var start: SingleNode<T>?

	val isEmpty: Boolean get() = start == null
	val count: Int get() = start?.count() ?: 0

	constructor() {
		this.start = null
	}

	constructor(vararg values: T) {
		val nodes = values.map { SingleNode(it) }
		this.start = nodes.firstOrNull()
		nodes.windowed(2,1) { (first, second) ->
			first.next = second
		}
	}

	fun append(value: T) {
		val node = SingleNode(value)
		val last = start?.getLast()
		if (last != null) {
			last.next = node
		} else {
			this.start = node
		}
	}

	private class SingleNode<T>(
		data: T,
		var next: SingleNode<T>? = null
	): Node<T>(data) {
		override fun count(acc: Int): Int {
			if (next == null) return acc
			return this.next!!.count(acc + 1)
		}

		override fun getLast(): SingleNode<T> {
			var next: SingleNode<T> = this
			while (next.next != null) {
				next = next.next!!
			}
			return next
		}
	}
}