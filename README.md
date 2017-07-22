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


** 안정성(stability) : 동일한 데이터에 대해 입력한 순서대로 정렬되면 안정성이 있다고 한다

#### 2) 퀵 정렬 알고리즘
##### 퀵 정렬 알고리즘의 예제
org.reve.algorithm.sort.exchange.QuickSort
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
- 평균 : O(nlogn)
- 최악 : O(n^2)
- 정렬 전 자료의 상태에 따라 효율성의 차이가 큼
- 전체 효율성을 볼 때 상당히 우수한 성능
- 자료의 교환이 계속되므로 안정성이 없음
- 자료의 중간값을 피봇으로 사용하면 효율이 큼(중간값을 알 수 있다면)

#### 3) 버블 정렬 알고리즘
##### 버블 정렬 알고리즘의 예제
##### 버블 정렬 알고리즘의 특징

### 2. 병합
#### 1) 병합 정렬 알고리즘
##### 병합 정렬 알고리즘의 예제
##### 병합 정렬 알고리즘의 특징

### 3. 분배
#### 1) 기수 정렬 알고리즘

### 4. 삽입
#### 1) 삽입 정렬 알고리즘
#### 2) 셀 정렬 알고리즘

### 5. 기타
#### 1) 하프 정렬 알고리즘