class Solution:
    def reverseWords(self, s: str) -> str:
        # go through string
        # save a word by going all the way until you find a space 

        # store each word in sentence
        words = s.split() # splits the string into an array at each " ". string.split(separator, maxsplit)
        words = list(reversed(words)) # reversed() returns an iterator 
        length = len(words)
        ret = ""
        for index, word in enumerate(words):
            #print("%s" % word, end=" ") #instead of printing with \n we end the print with a space 
            ret += word
            if (index < length - 1):
                ret += " " 
                
        return ret
        