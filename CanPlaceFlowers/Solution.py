class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if len(flowerbed) == 1 and flowerbed[0] == 0:
            flowerbed[0] = 1
            n -= 1 # python doesn't have --
            return True
        
        # else, loop thru the array only if n > 0 
        for i in range(len(flowerbed)): # the end is exclusive 
            if n == 0:
                break
            # else
            if flowerbed[i] == 0:
                #else if its 0 
                if i == 0:
                    if len(flowerbed) > 1 and flowerbed[i + 1] == 0:
                        flowerbed[i] = 1
                        n -= 1
                elif (i == len(flowerbed) - 1) and len(flowerbed) > 1:
                    if flowerbed[i - 1] == 0:
                        flowerbed[i] = 1
                        n -= 1
                else:
                    if len(flowerbed) > 2 and flowerbed[i - 1] == 0 and flowerbed[i + 1] == 0:
                            flowerbed[i] = 1
                            n -= 1
            
        #print(f"n: {n}\narr: {flowerbed}")
        return n == 0
                







        
        