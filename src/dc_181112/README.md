# 완주하지 못한 선수
* 출처 :  https://programmers.co.kr/learn/courses/30/lessons/42576

## 문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

## 제한사항
* 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
* completion의 길이는 participant의 길이보다 1 작습니다.
* 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
* 참가자 중에는 동명이인이 있을 수 있습니다.

## 입출력 예
| participant |	completion | return |
|------------| ----------- | ------- |
| [leo, kiki, eden]	| [eden, kiki]	| leo |
| [marina, josipa, nikola, vinko, filipa]	| [josipa, filipa, marina, nikola] |	vinko |
| [mislav, stanko, mislav, ana]	 | [stanko, ana, mislav]	 | mislav |

# 실행 결과    
## 채점을 시작합니다.
### 정확성  테스트
```
테스트 1 〉	통과 (1.06ms, 48.5MB)
테스트 2 〉	통과 (1.12ms, 45MB)
테스트 3 〉	통과 (1.31ms, 47.2MB)
테스트 4 〉	통과 (1.90ms, 50.6MB)
테스트 5 〉	통과 (2.82ms, 46.8MB)
효율성  테스트
테스트 1 〉	통과 (28.60ms, 85.9MB)
테스트 2 〉	통과 (55.26ms, 91.4MB)
테스트 3 〉	통과 (55.63ms, 98.6MB)
테스트 4 〉	통과 (47.18ms, 110MB)
테스트 5 〉	통과 (82.38ms, 108MB)
```
## 채점 결과
정확성: 50.0
효율성: 50.0
합계: 100.0 / 100.0