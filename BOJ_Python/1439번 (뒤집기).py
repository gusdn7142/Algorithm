

#코드1
# S = input()  #문자열 S
#
# count = 0
# for i in range(len(S)-1):
#     if S[i] != S[i+1]: #앞의 인덱스와 같지 않을때 count를 +1 해줌.
#         count += 1
#
# print((count) // 2)


#코드2
# S = input()  #문자열 S
#
# count = 0
# prev='?'
#
# for i in S:
#     if i != prev:
#         prev=i
#         count +=1
#
# print(count//2)


#코드3
s = input()  #0과 1로 이루어진 문자열 입력

count_0 = 0
count_1 = 0

if s[0] == '0':  #첫 문자열이 0일떄 count_1을 증가 (1을 뒤집어야 하기 때문!)
  count_1 += 1
else :           #첫 문자열이 1일떄 count_0을 증가
  count_0 += 1

for i in range(len(s) - 1):
  if s[i] != s[i+1]:   #앞과 뒤의 배열이 같지 않을때!!!
    if s[i+1] == '0':  #뒤의 문자가 0이면 count 1을 증가 (1을 디집어야 하기 때문)
      count_1 += 1
    else :            #뒤의 문자가 1이면 count_0을 증가 (0을 뒤집어야 하기 땜ㄴ)
      count_0 += 1

print(min(count_0, count_1))  #0과 1중 어떤걸 더 많이 뒤집었는지 출력
















#길이에 따라 몇번 바꿔주어야 하나. (연속된 수 뒤집기 가능) ( 0001100은 010으로 봐도 무방)
#01 👉 1번, 길이 2
#010 👉 1번, 길이 3
#0101 👉 2번, 길이 4
#01010 👉 2번, 길이 5
#010101 👉 3번, 길이 6
#0101010 👉3번, 길이 7