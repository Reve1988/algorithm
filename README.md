# 알고리즘 스터디

## 1. 정렬 알고리즘

### 1. 교환
#### 1) 선택 정렬 알고리즘
##### 선택정렬 알고리즘의 예제
org.reve.algorithm.sort.exchange.SelectionSortTest
<pre>
정렬 준비----------
[55, 153, 4, 63, 75, 23, 53, 66, 22, 10]
정렬 시작----------
[55, 153, 4, 63, 75, 23, 53, 66, 22, 10]
[4, 153, 55, 63, 75, 23, 53, 66, 22, 10]
[4, 10, 55, 63, 75, 23, 53, 66, 22, 153]
[4, 10, 22, 63, 75, 23, 53, 66, 55, 153]
[4, 10, 22, 23, 75, 63, 53, 66, 55, 153]
[4, 10, 22, 23, 53, 63, 75, 66, 55, 153]
[4, 10, 22, 23, 53, 55, 75, 66, 63, 153]
[4, 10, 22, 23, 53, 55, 63, 66, 75, 153]
[4, 10, 22, 23, 53, 55, 63, 66, 75, 153]
정렬 완료----------
[4, 10, 22, 23, 53, 55, 63, 66, 75, 153]
</pre>
##### 선택정렬 알고리즘의 특징
- 비교연산 : O((n-1) + (n-2) + ... + 2 + 1) = O(n^2)
- 이동연산 : O(3(n-1)) = O(n) 
- 성능 : O(n^2)
- 상대적으로 느린 알고리즘에 속함
- 자료의 연산 이동횟수가 O(n)이므로 자료의 크기가 큰 정렬에 유리
- 최악의 경우나 평균이나 효율성은 항상 O(n^2)
- 자료의 교환이 계속되므로 안정성이 없음


** 안정성(stability) : 동일한 데이터에 대해 입력한 순서대로 정렬되면 안정성이 있다고 한다.

#### 2) 퀵 정렬 알고리즘
##### 퀵 정렬 알고리즘의 예제
org.reve.algorithm.sort.exchange.QuickSortTest
<pre>
정렬 준비----------
[55, 153, 4, 63, 75, 23, 53, 66, 22, 10]
정렬 시작----------
[4, 153, 55, 63, 75, 23, 53, 66, 22, 10]
[4, 10, 55, 63, 75, 23, 53, 66, 22, 153]
[4, 10, 55, 63, 75, 23, 53, 66, 22, 153]
[4, 10, 22, 63, 75, 23, 53, 66, 55, 153]
[4, 10, 22, 53, 75, 23, 63, 66, 55, 153]
[4, 10, 22, 53, 23, 75, 63, 66, 55, 153]
[4, 10, 22, 53, 23, 55, 63, 66, 75, 153]
[4, 10, 22, 23, 53, 55, 63, 66, 75, 153]
[4, 10, 22, 23, 53, 55, 63, 66, 75, 153]
[4, 10, 22, 23, 53, 55, 63, 66, 75, 153]
정렬 완료----------
[4, 10, 22, 23, 53, 55, 63, 66, 75, 153]
</pre>
##### 퀵 정렬 알고리즘의 특징
- 평균 : O(nlogn) - 피벗값이 지속적으로 자료의 중앙값이 될 때
- 최악 : O(n^2) - 이미 정렬된 자료에서 피벗값이 계속 끝 값이 될 때
- 정렬 전 자료의 상태에 따라 효율성의 차이가 큼
- 전체 효율성을 볼 때 상당히 우수한 성능
- 자료의 교환이 계속되므로 안정성이 없음
- 자료의 중간값을 피벗으로 사용하면 효율이 큼(중간값을 알 수 있다면)
##### 퀵 정렬 최적화를 위한 최초의 피벗값 찾기
###### [1] Random - org.reve.algorithm.sort.exchange.QuickRecursiveRandomPivotSort
> 1. 렌덤하게 피벗을 뽑는다.
> 2. 피벗을 기준으로 피벗보다 작은값은 왼쪽으로 피벗보다 큰 값은 오른쪽으로 보낸다.
> - 랜덤값에 따라서 O(n) ~ O(n^2) 사이의 성능을 갖는다.
###### [2] Median - org.reve.algorithm.sort.exchange.QuickRecursiveMedianPivotSort
> 1. 왼쪽, 오른쪽, 중간에 위치한 값들 중 중간값을 피벗으로 한다
> 2. 피벗을 기준으로 피벗보다 작은값은 왼쪽으로 피벗보다 큰 값은 오른쪽으로 보낸다.  

#### 3) 버블 정렬 알고리즘
##### 버블 정렬 알고리즘의 예제
##### 버블 정렬 알고리즘의 특징


### 2. 병합
#### 1) 병합 정렬 알고리즘
##### 병합 정렬 알고리즘의 예제
org.reve.algorithm.sort.exchange.MergeSortTest
<pre>
정렬 준비----------
[80, 75, 10, 60, 15, 49, 12, 25]
정렬 시작----------
정렬범위 : 0 ~ 1 , 중간위치 : 0
[75, 80, 10, 60, 15, 49, 12, 25]
정렬범위 : 2 ~ 3 , 중간위치 : 2
[75, 80, 10, 60, 15, 49, 12, 25]
정렬범위 : 0 ~ 3 , 중간위치 : 1
[10, 60, 75, 80, 15, 49, 12, 25]
정렬범위 : 4 ~ 5 , 중간위치 : 4
[10, 60, 75, 80, 15, 49, 12, 25]
정렬범위 : 6 ~ 7 , 중간위치 : 6
[10, 60, 75, 80, 15, 49, 12, 25]
정렬범위 : 4 ~ 7 , 중간위치 : 5
[10, 60, 75, 80, 12, 15, 25, 49]
정렬범위 : 0 ~ 7 , 중간위치 : 3
[10, 12, 15, 25, 49, 60, 75, 80]
정렬 완료---------- 2ms
[10, 12, 15, 25, 49, 60, 75, 80]
</pre>
##### 병합 정렬 알고리즘의 특징
- 이동 및 비교 연산 횟수 : O(nlogn)
- 비교적 우수한 효율성을 갖는다.
- 정렬 전 자료의 정렬 상태에 영향을 받지 않는다.
- 추가 메모리 공간이 필요하다.
- 교환 기반 알고리즘이 아니라 안정성이 유지된다.

### 3. 분배
#### 1) 기수 정렬 알고리즘

### 4. 삽입
#### 1) 삽입 정렬 알고리즘
#### 2) 셀 정렬 알고리즘

### 5. 기타
#### 1) 하프 정렬 알고리즘

## 4. 그래프

### 1. 그래프 자료구조

### 2. 최단 경로 구하기

#### 1) 다익스트라(Dijkstra) 알고리즘

#### 2) 플로이드(Floyd) 알고리즘

### 3. 최소비용신장트리

#### 1) 신장트리

#### 2) 최소비용신장트리

#### 3) 크루스칼(Kruskal) 알고리즘

<p>
가중그래프에서 비용이 적은 간선부터 하나씩 선택하여 신장트리를 만드는 방식의 알고리즘이다.<br/>
모든 간선을 비용 순으로 정렬하고, 가중치 값이 작은 간선부터 차례대로 선택하여 신장트리 완성한다.
</p>
<p>
입력값이 가중그래프 G 라고 할 때 기존에는 그래프 G에서 불필요한 간선을 제거하여 최소비용신장트리를 만들었지만<br/>
크루스칼 알고리즘은 간선이 전혀 없는 상태에서 간선을 하나씩 추가하는 방식으로 최소비용신장트리를 만든다. 
</p>

알고리즘
1. 그래프에서 노드와 간선을 분리
2. 간선은 가중치 값으로 정렬
3. 노드에 가중치 값이 적은 간선부터 하나씩 추가 (동일한 가중치 간선이 있으면 어느걸 선택해도 무방)
4. 추가한 간선이 순환을 만드는지 확인 (순환을 만들면 추가하지 않음)
5. 그래프의 모든 노드가 연결되었는지 확인 (모든 노드가 연결되었으면 종료, 연결되지 않았으면 3번부터 반복)

증명방법 [출처:http://bluepolaris.tistory.com/86]
1. 알고리즘이 만들어낸 트리가 Spanning Tree인지를 증명
2. 알고리즘이 만들어낸 트리가 Spanning Tree일 때 Minimum Tree인지를 증명

증명
<pre>
1. Spanning Tree 증명
  1) n이 모든 노드의 개수일 때, 간선의 개수가 n-1보다 크면 무조건 순환이 생기므로, 결과트리에 포함된 간선의 개수는 n-1보다 작거나 같다.
  2) 알고리즘이 가중치가 적은 간선부터 순환을 만드는 간선을 제외하고 모든 간서을 추가하므로 연결되지 않은 노드는 있을 수 없다.
  
2. Minimum Tree 증명
  1) 정답 트리를 만드는 간선의 집합이 Tmst라고 하면, 알고리즘의 모든 단계에서 T ⊂ Tmst 가 된다.(*1)
  2) 따라서, 알고리즘이 종료되면 T = Tmst가 된다.
</pre>

(*1) "알고리즘의 모든 단계에서 T ⊂ Tmst 가 된다." 증명 - 수학적 귀납법 사용
<pre>
  1) 최초의 T는 공집합이다.
  2) 알고리즘이 T ⊂ Tmst 인 T에 간선 e를 추가해서 T'이 되었다고 하자.
  3) T' = T ∪ {e} 이면 T' ⊂ Tmst 가 된다.*2
</pre>

(*2) "T' = T ∪ {e} 일 때 T' ⊂ Tmst 가 된다." 증명 - 귀류법(*3) 사용
<pre>
  1) "T'이 Tmst에 포함되지 않는다면 간선 e 또한 Tmst에 포함되지 않는다."
     (T ⊂ Tmst 이고 T' = T ∪ {e}이므로, T'이 Tmst에 포함되지 않는다면 간선 e 또한 Tmst에 포함되지 않음)
  2) Tmst의 간선의 개수는 n-1이므로 Tmst에 간선 e를 포함하면 간서의 개수가 n이 된다.
  3) 2)에 의해 Tmst에 간선 e를 추가하면 순환(Cycle)이 생긴다. 
  4) 알고리즘이 간선 e를 선택했다는 것은 T'이 순환이 없다는 것을 의미한다.
  5) 마찬가지로 T도 순환이 없다는 것을 의미한다.
  6) 3)에서 생성된 순환은 4), 5)에 의해 간선 e를 제외하고 T에 속하지 않은 간선이 있다는 것을 의미한다.
  7) 3)에서 생성된 순환에서 T에 포함되지 않은 간선을 f라고 하자.
  8) Tmst에서 간선 f를 제거하고 간선 e를 넣은 간선집합을 T''이라고 하자.
  9) 알고리즘이 T에서 간선 f가 아닌 e를 선택했으므로 e가 f보다 가중치가 작다는 것을 의미한다.
  10) 따라서, Tmst의 가중치의 합보다 T''의 가중치의 합이 더 작다.
  11) 모순이 발생하였으므로 원래 주장이 옳다.
</pre>

(*3) 귀류법 [출처:https://namu.wiki/w/귀류법]
<pre>
수학과 논리학의 증명법 중 하나이다.
어떤 명제를 반대로 가정했을 때, 모순을 이끌어내어 가정이 거짓임을 증명하는 방법이다.
일상 언어 생활에서도 은근히 자주 볼 수 있는 방식인데, "그래, 네 말이 맞다고 치자."로 시작되는 말들이 다름 아닌 귀류법으로 상대의 주장에 문제가 있음을 주장하는 방식이다.
수학에서는 이를 간접 증명이라고도 부른다.
</pre>

#### 4) 프림(Prim) 알고리즘