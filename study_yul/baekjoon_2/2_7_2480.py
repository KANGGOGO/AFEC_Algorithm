F,S,T = map(int,input().split())
Money = 0
if F==S and S==T:
    Money += (10000 + F*1000)
    print(Money)
elif F==S:
    Money += (1000 + F*100)
    print(Money)
elif F==T:
    Money += (1000 + F*100)
    print(Money)
elif S==T:
    Money += (1000 + S*100)
    print(Money)
else:
    Money += 100*max(F,S,T)
    print(Money)