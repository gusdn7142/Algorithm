T = int(input()) 

for i in range(T): 
    h, w, n = map(int, input().split())  

    room = n//h + 1         
    floor = n % h        
    
    if n % h == 0:       
        room = n//h
        floor = h
    print(floor*100+room)