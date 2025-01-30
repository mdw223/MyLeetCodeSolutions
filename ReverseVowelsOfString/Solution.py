class Solution:
    def reverseVowels(self, s: str) -> str:
        if (len(s) < 2):
            return s
        # loop through the list from the left and from the right
        # if left finds a vowel, it waits
        # for the right to find one
        # then they swap vowels 
        # and continue
        mid = int(len(s) / 2)
        vowels = ['a', 'e', 'i', 'o', 'u']
        s_l = list(s)
        left = len(s) - 1
        for i in range(0,len(s_l),1):
            if s_l[i].lower() in vowels:
                for j in range(left, -1,-1):
                    left = j
                    if (i >= left):
                        return ''.join(s_l)
                    if s_l[j].lower() in vowels:
                        #swap
                        temp = s_l[i]
                        s_l[i] = s_l[j]
                        s_l[j] = temp

                        print(i)
                        break
                left -= 1


        print(s_l)
        return s
        


        
        