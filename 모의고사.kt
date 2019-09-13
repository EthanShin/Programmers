class Solution {
    fun solution(answers: IntArray): IntArray {
        val answer = IntArray(3) {0}

        // The answer pattern of 3 students
        val first = intArrayOf(1,2,3,4,5)
        val second = intArrayOf(2,1,2,3,2,4,2,5)
        val third = intArrayOf(3,3,1,1,2,2,4,4,5,5)

        answers.forEachIndexed { index, i ->
            // Check if the student's answer is correct
            if (first[index % first.size] == i) answer[0]++
            if (second[index % second.size] == i) answer[1]++
            if (third[index % third.size] == i) answer[2]++
        }

        // Return the indexes of the largest value
        return answer.withIndex()
            .filter { it.value == answer.max() }
            .map { it.index + 1 }
            .toIntArray()
    }
}