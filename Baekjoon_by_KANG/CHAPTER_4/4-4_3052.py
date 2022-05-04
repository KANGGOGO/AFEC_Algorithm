X = []
for i in range(10):
    X.append(int(input()) % 42)
Y = set(X)
print(len(Y))