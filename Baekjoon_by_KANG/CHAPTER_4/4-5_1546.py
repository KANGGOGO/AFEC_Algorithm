N = int(input())
X = list(map(int, input().split(" ")))
M = max(X)
SUMM = 0

for i in range(N):
    X[i] = (X[i] / M) * 100
    SUMM += X[i]

print(SUMM / N)