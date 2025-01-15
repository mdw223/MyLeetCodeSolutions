from typing import List


class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        ret = []
        max_c = max(candies)
        for i, k in enumerate(candies):
            if k + extraCandies >= max_c:
                ret.append(True)
            else:
                ret.append(False)

        return ret
    
        # return [(candy + extraCandies) >= maxCandies for candy in candies]

    
sol = Solution()
print(sol.kidsWithCandies([1,2,3,4,5], 3))
        