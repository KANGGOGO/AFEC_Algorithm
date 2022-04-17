input_TIME = input().split(' ')
input_REQIRED_MINUTE = input()

H = int(input_TIME[0])
M = int(input_TIME[1])
R = int(input_REQIRED_MINUTE)

M += R

if M >= 60:
    H += M // 60
    M = M % 60
    if H >= 24:
        H -= 24

print(H, M)
# 파이썬에서 H, M 은 H M 으로 출력된다?