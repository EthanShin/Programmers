class Solution {
    fun solution(heights: IntArray): IntArray {
        var answer = intArrayOf()
        var max = 0
        var maxIndex = 0

        heights.forEachIndexed { index, int ->
            if (int >= max) {
                max = int
                maxIndex = index
                answer += 0
            } else {
                val sliceArray = heights.sliceArray(maxIndex until index)
                sliceArray.reversed().forEachIndexed sliceForEach@{ sliceIndex, sliceInt ->
                    if (int < sliceInt) {
                        answer += (sliceArray.size - sliceIndex) + maxIndex
                        return@forEachIndexed
                    }
                }
            }
        }

        return answer
    }
}