class Solution {
    fun solution(arrangement: String): Int {
        var answer = 0
        var stick = 0
        var prev = ' '

        arrangement.forEach {
            when (it) {
                '(' -> stick++
                ')' -> {
                    stick--
                    answer += 
                        if (it == prev) 1
                        else stick
                }
            }
            prev = it
        }
        return answer
    }
}