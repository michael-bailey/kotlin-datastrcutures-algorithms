package algorithms.array

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FibonacciTest {
	@Test
	fun `0 as input in for implementation, returns empty list`() {
		val actual = Fibonacci().createFor(0)
		assertEquals(emptyList<Int>(), actual)
	}

	@Test
	fun `1 as input in for implementation, returns list with only 0`() {
		val actual = Fibonacci().createFor(1)
		assertEquals(listOf(0), actual)
	}

	@Test
	fun `2 as input in for implementation, returns list with 0 and 1`() {
		val actual = Fibonacci().createFor(2)
		assertEquals(listOf(0,1), actual)
	}

	@Test
	fun `3 as input in for implementation, returns list with first three fib numbers`() {
		val actual = Fibonacci().createFor(3)
		assertEquals(listOf(0,1,1), actual)
	}

	@Test
	fun `10 as input in for implementation, returns list with first ten fib numbers`() {
		val actual = Fibonacci().createFor(10)
		assertEquals(listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), actual)
	}
}