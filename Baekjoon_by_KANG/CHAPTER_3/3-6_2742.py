import sys
N = int(sys.stdin.readline())
for i in range(N, 0, -1):
# range(a, b, c)에서 a는 초기값, 0은 종료값, c는 변화값... 디폴트는 +1
    print(i)
    i -= 1