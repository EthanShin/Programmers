import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        // Variable that bind A and B in Pair type
        var combine = progresses.zip(speeds)

        while (combine.isNotEmpty()) {
            // The number of days it takes for the next task to complete
            val days =
                ceil((100 - combine.first().first) / (combine.first().second.toDouble()))
                .toInt()

            var count = 0
            // When distributing the above tasks, the number of tasks to be distributed together
            for (i in combine) {
                if (i.first + i.second.times(days) >= 100) count++
                else break
            }

            answer += count
            combine = combine.drop(count)
        }

        return answer
    }
}