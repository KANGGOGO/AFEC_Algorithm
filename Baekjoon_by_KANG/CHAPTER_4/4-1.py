NUMB = input()
reps = 0
if int(NUMB) < 10:
    NUMB2 = str(0) + NUMB
    A, B = NUMB2
    C = int(A) + int(B)
    NUMB2 = B + str(C % 10)
else:
    A, B = NUMB
    C = int(A) + int(B)
    NUMB2 = B + str(C % 10)


print(A, B)
print(C)
print(NUMB2)