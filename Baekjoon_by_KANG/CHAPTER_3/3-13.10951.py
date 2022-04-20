while True:
    try:
        input_data = input().split()
        A, B = map(int, input_data)
        print(A + B)
    except:
        break
# while 문 내에 오류가 발생했을 때 반복을 중단하는 함수..
