class Solution {
    fun solution(heights: IntArray): IntArray {
        var answer = intArrayOf()
        var jump = 0

        heights.reduceRightIndexed { index, i, acc ->

            if (acc >= i) {
                jump++
                acc
            } else {
                for (i in 0..jump)
                    answer += index + 1
                jump = 0
                i
            }
        }

        for (i in 0..jump)
            answer += 0

        return answer.reversedArray()
    }
}