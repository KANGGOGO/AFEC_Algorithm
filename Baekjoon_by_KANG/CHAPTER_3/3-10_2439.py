from tkinter import N


T = int(input())

for i in range(1, T+1):
    print(' ' * (T - i) + '*' * i)

    # n = '*' * i
    # print('{0:>5}'.format(n))
    # format 함수 활용해 위와 같이 오른쪽 정렬 가능
    # {0:>5}에서 0은 인덱스 0을 뜻함, 이름으로도 넣을 수 있음 
    # ex) '{name:>5}'.format(name = n)