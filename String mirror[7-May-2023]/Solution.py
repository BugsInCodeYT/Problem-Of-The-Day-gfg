#  >> PYTHON CODE <<

 def stringMirror(self, s : str) -> str:

        k=s[0]

        for i in range(1,len(s)):

            if s[0]==s[1]:

                break

            if s[i]<=s[i-1]:

                k+=s[i]

            else:

                break

        k+=k[::-1]

        return k

