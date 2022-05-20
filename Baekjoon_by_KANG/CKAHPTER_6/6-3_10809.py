word = str(input())
A = 'abcdefghijklmnopqrstuvwxyz'

for i in A:
    if word.count(i) == 0:
        print(-1, end = " ")
    else:
        print(word.find(i), end = " ")