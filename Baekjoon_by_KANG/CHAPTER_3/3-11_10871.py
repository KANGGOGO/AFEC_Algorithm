input_data_1 = input().split()
input_data_2 = input().split()
N, X = map(int, input_data_1)
A = list(map(int, input_data_2))
# list 인풋하는 방법은...???

for i in range(0, N):
    if A[i] < X:
        print(A[i], end=" ")
# 반복문의 출력값이 다음 줄로 넘어가지 않고 " "를 두고 계속 출력됨
# 이중 for문은 print(' ')을 아래 추가해서 줄 구분 가능... 점프 투 파이썬 03-3 for문 참조