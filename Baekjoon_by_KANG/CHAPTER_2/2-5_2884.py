input_data = input().split(' ')
H = int(input_data[0])
M = int(input_data[1])
M -= 45
# M -= 45 는 M = M - 45
if M < 0:
    M += 60
    H -= 1
    if H < 0:
        H += 24

print(H, M)


#if M < 0:
#    M += 60
#    if H < 0:
#        H += 24
#    else:
#        H -= 1