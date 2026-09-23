/**
 * Given a stream of stock trade events, each with a timestamp and price,
 * write a function that returns the maximum profit achievable from a single buy and a single sell,
 * where the buy must happen before the sell.
 */

package pactice.trade_tracker

/**
 * Trade Tracker implementation in OOP
 *
 * Tracks the largest, positive difference between a set of added trades (numbers),
 */
class TradeTracker {

	var highestDiff: Int = 0
		private set;

	private var runningDiff: Int = 0
	private var previousAmount: Int? = null

	operator fun plus(next: Int) {
		if(previousAmount == null) {
			previousAmount = next
			return
		}

		val diff = next - previousAmount!!
		runningDiff += diff
		when {
			runningDiff > highestDiff -> highestDiff = runningDiff
			runningDiff < 0 -> runningDiff = 0
			else -> {}
		}
		previousAmount = next
	}
}