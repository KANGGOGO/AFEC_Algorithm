input_num = int(input())
NEW_NUMB = input_num
rep = 0


while True:
    X1 = NEW_NUMB // 10
    X2 = NEW_NUMB % 10
    Y1 = (X1 + X2)
    Y2 = Y1 % 10
    NEW_NUMB = X2 * 10 + Y2
    rep += 1
    if NEW_NUMB == input_num:
        break

print(rep)