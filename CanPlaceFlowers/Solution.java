class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // from index 0 to and including the last index of the array 
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            flowerbed[0] = 1;
            n--;
            return true;
        } 
        // else 
        // loop from 0 to the last index of the array, only if n > 0 
        for (int i = 0; i <= flowerbed.length - 1 && n > 0; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed.length > 1 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                    // if flowerbed[0] == 1 then nvm 
                } else if (i == flowerbed.length - 1 && flowerbed.length > 1) {
                    if (flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else {
                    if (flowerbed.length > 2 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }

        //System.out.println("n arr: " + Arrays.toString(flowerbed));
        //System.out.println("n size: " + n);
        return (n == 0) ? true : false;
        
    }
}