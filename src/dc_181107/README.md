# 문자열 내 p와 y의 개수

## 문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

## 제한사항
* 문자열 s의 길이 : 50 이하의 자연수
* 문자열 s는 알파벳으로만 이루어져 있습니다.

## 입출력 예
|s|	answer|
|”pPoooyY“	|true|
|“Pyy”|false|

# 실행 결과    
## 채점을 시작합니다.
### 정확성  테스트
```
테스트 1 〉	통과 (1.14ms, 47.7MB)
테스트 2 〉	통과 (1.00ms, 48.1MB)
테스트 3 〉	통과 (1.02ms, 48.3MB)
테스트 4 〉	통과 (0.91ms, 47.9MB)
테스트 5 〉	통과 (1.12ms, 48MB)
테스트 6 〉	통과 (0.96ms, 48.5MB)
테스트 7 〉	통과 (0.96ms, 47.6MB)
테스트 8 〉	통과 (0.98ms, 48.3MB)
테스트 9 〉	통과 (0.95ms, 47.6MB)
테스트 10 〉	통과 (1.01ms, 47.6MB)
테스트 11 〉	통과 (1.07ms, 48.3MB)
테스트 12 〉	통과 (1.01ms, 48MB)
테스트 13 〉	통과 (1.01ms, 47.9MB)
테스트 14 〉	통과 (1.01ms, 48MB)
테스트 15 〉	통과 (1.14ms, 47.7MB)
테스트 16 〉	통과 (1.09ms, 47.5MB)
테스트 17 〉	통과 (1.02ms, 47.6MB)
테스트 18 〉	통과 (1.07ms, 48.3MB)
테스트 19 〉	통과 (1.02ms, 48.2MB)
테스트 20 〉	통과 (1.06ms, 47.9MB)
테스트 21 〉	통과 (1.01ms, 48.2MB)
테스트 22 〉	통과 (0.97ms, 47.6MB)
테스트 23 〉	통과 (1.09ms, 48.2MB)
테스트 24 〉	통과 (1.01ms, 48.3MB)
테스트 25 〉	통과 (1.05ms, 48MB)
테스트 26 〉	통과 (1.03ms, 47.9MB)
테스트 27 〉	통과 (0.97ms, 48.1MB)
테스트 28 〉	통과 (0.94ms, 48MB)
```
## 채점 결과
* 정확성: 100.0
* 합계: 100.0 / 100.0