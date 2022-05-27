A = str(input())
B = A.upper()
X = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
i = 0
B_LIST = []

for i in range(len(X)):
    B_LIST.append(B.count(X[i]))

if B_LIST.count(max(B_LIST)) > 1:
    print("?")
else:
    print(X[B_LIST.index(max(B_LIST))])