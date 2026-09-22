package structures.list

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LinkedListTest {

	@Test
	fun `Empty constructor created empty linked list`() {
		val list = LinkedList<Int>()

		assertEquals(true, list.isEmpty)
		assertEquals(0, list.count)
	}

	@Test
	fun `appending an element to empty list, makes it not empty`() {
		val list = LinkedList<Int>()

		list.append(1)

		assertEquals(false, list.isEmpty)
		assertEquals(1, list.count)
	}

	@Test
	fun `appending a range of element to empty list, makes it not empty`() {
		val list = LinkedList<Int>()

		(1..10).forEach { list.append(it) }

		assertEquals(false, list.isEmpty)
		assertEquals(10, list.count)
	}

}