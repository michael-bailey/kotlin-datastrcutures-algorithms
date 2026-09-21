package algorithms.array

class Fibonacci {
	fun createFor(count: Int): List<Int> = buildList {
		if (count > 0) add(0)
		if (count > 1) add(1)

		if (count < 3) return@buildList

		val count = count - 2
		repeat(count) {
			val next = add(last() + get(lastIndex - 1))
		}
	}
}