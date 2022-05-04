X = []

for i in range(9):
    X.append(int(input()))

A = max(X)
B = X.index(A)

print(A, B + 1)