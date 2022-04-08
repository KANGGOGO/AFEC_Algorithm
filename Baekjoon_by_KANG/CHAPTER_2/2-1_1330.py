input_data = input().split(' ')
A = int(input_data[0])
B = int(input_data[1])

if A > B:
    print('>')
elif A < B:
    print('<')
else:
    print('==')
#else는 나머지 이므로 뒤에 조건이 필요 없이 바로 : 