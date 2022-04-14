input_data = input()
x = int(input_data)
n = 0

while n < 9:
    n += 1
    answer = x * n
    print('%d * %d = %d' % (x, n, answer))

# for i in range(1,10):
#     n = i
#     answer = x * n
#     print('%d * %d = %d' % (x, n, answer))