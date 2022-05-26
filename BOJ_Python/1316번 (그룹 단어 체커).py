


T = int(input()) #테스트 케이스 입력

cnt = T  #그룹 단어 수 (처음엔 T라고 가정)
for i in range(T):  #테스트 케이스 수만큼 반복
    word = input()  #단어 입력

    for j in range(0, len(word)-1):
        if word[j] == word[j+1]:  #앞 문자열과 뒷 문자열이 같으면 패스
           continue  #pass 사용해도됨.
        elif word[j] in word[j+1:]: #앞 문자열이 뒷 문자열들 안에 속해 있으면 cnt를 1 줄여줌
            cnt -= 1
            break

print(cnt)