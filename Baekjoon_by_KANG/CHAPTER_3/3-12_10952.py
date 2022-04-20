# for문으로 안될 것 같음, 인풋은 반복되어야하니 while 안에...

while True:
    input_data = input().split()
    A, B = map(int, input_data)
    if A == 0 and B == 0:
        break
    print(A + B)
    # 0 + 0 은 출력되면 안되므로... if문 뒤에