T = int(input())  

A = T // 300       
B = T % 300 // 60  
C = T % 300 % 60  // 10  
check = T % 300 % 60  % 10   


if check == 0:             
    print(A, B, C)     
elif check != 0:          
    print(-1)