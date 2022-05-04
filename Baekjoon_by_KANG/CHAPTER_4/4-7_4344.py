N = int(input())

for i in range(N):
    X = list(map(int, input().split(" ")))
    STUDENT_COUNT = X[0]
    SCORE_SUM = 0

    for j in range(1, STUDENT_COUNT + 1):
        SCORE_SUM += X[j]

    SCORE_AVG = SCORE_SUM / STUDENT_COUNT
    COUNT = 0

    for k in range(1, STUDENT_COUNT + 1):
        if X[k] > SCORE_AVG:
            COUNT += 1

    RESULT_PERCENTAGE = COUNT / STUDENT_COUNT * 100
    print("%0.3f" % RESULT_PERCENTAGE + "%")  

# 점프 투 파이썬 2-2 문자열 자료형 : 소수점 표현하기 참조