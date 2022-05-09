input_data = input()
A = int(input_data)

if (A%4 == 0 and A%100 != 0) or A%400 == 0 :
    print('1')
else:
    print('0')