input_data = input()
Year = int(input_data)
A = Year % 4
B = Year % 100
C = Year % 400

if A == 0 and B != 0:
    print('1')
elif A== 0 and B == 0 and C != 0:
    print('0')
elif A== 0 and B == 0 and C == 0:
    print('1')
else:
    print('0')