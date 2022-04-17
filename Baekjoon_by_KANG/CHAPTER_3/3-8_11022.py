T = int(input())

for i in range(1, T+1):
    A, B = map(int, input().split())
    answer = A + B
    print('Case #%d: %d + %d = ' %(i, A, B) + str(answer))
    i += 1