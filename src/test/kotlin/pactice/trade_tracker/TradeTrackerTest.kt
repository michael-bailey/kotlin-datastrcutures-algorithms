package pactice.trade_tracker

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream


class TradeTrackerTest {

	@ParameterizedTest
	@MethodSource("tradeListSource")
	fun `comprehensive trade tracker test`(
		data: List<Int>,
		expected: Int,
	) {

		val tradeTracker = TradeTracker()

		data.forEach { tradeTracker + it }

		val actual = tradeTracker.highestDiff

		assertEquals(expected, actual)

	}

	companion object {
		val TwoTradeSet = listOf(1,2)
		val ThreeTradeSet = listOf(1,2,3)
		val downTradeSet = listOf(3,2,1)
		val steppingUp = listOf(1,3,2,4,3,5)
		val steppingDownSingleAndDouble = listOf(5,3,4,2,3,1)
		val mountain = listOf(1,2,3,2,1)
		val valley = listOf(3,2,1,2,3)

		@JvmStatic
		fun tradeListSource(): Stream<Arguments> {
			return Stream.of(
				Arguments.of(TwoTradeSet, 1),
				Arguments.of(ThreeTradeSet, 2),
				Arguments.of(downTradeSet, 0),
				Arguments.of(steppingDownSingleAndDouble, 1),
				Arguments.of(mountain, 2),
				Arguments.of(valley, 2),
			)
		}
	}
}