NUMB1 = input()
reps = 0
while True:
    if int(NUMB1) < 10:
        NUMB2 = str(0) + NUMB1
        A, B = NUMB2
        C = int(A) + int(B)
        NUMB3 = B + str(C % 10)
        reps += 1
        if NUMB1 == NUMB3:
            break
    else:
        A, B = NUMB1
        C = int(A) + int(B)
        NUMB3 = B + str(C % 10)
        reps += 1
        if NUMB1 == NUMB3:
            break
        break

print(reps)