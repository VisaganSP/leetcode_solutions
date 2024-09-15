from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] + 1 != 10:
                digits[i] += 1
                return digits

            digits[i] = 0

            if i == 0:
                return [1] + digits


digits1 = [1, 2, 3]
digits2 = [4, 3, 2, 1]
digits3 = [9]
digits4 = [9, 9]

solution = Solution()

print(' '.join([str(num) for num in solution.plusOne(digits1)]))
print(' '.join([str(num) for num in solution.plusOne(digits2)]))
print(' '.join([str(num) for num in solution.plusOne(digits3)]))
print(' '.join([str(num) for num in solution.plusOne(digits4)]))
