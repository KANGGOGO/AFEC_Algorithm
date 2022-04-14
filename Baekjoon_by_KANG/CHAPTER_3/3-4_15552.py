import sys
R = int(sys.stdin.readline())
# sys.stdin.readline()의 기본적 사용 형태. 계산시간 짧음. input 함수로 대체 가능

# A = int(T[0])
# B = int(T[1])
# map 함수 이용해 아래와 같이 표현 가능
# A, B = map(int, T)
for i in range(R):
    A, B = map(int, sys.stdin.readline().split())
    print(A + B)