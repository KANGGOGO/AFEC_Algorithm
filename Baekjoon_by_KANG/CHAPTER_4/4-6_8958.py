N = int(input())

for i in range(N):
    C = 0
    SUMM = 0
    X = list(input())
    for j in range(len(X)):
        if X[j] == "O":
            C += 1
            SUMM += C
        elif X[j] == "X":
            C = 0
    print(SUMM)