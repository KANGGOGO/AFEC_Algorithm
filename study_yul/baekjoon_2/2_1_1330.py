input_data = input().split()
A = input_data[0]
B = input_data[1]

if int(A) > int(B):
    print('>')
elif int(A) < int(B):
    print('<')
else:
    print('==')

