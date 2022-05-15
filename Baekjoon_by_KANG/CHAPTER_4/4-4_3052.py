X = []
for i in range(10):
    X.append(int(input()) % 42)
Y = set(X)
print(len(Y))

# set() = 서로 같은 값을 정리해주는 함수