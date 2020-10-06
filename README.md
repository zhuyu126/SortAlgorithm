# SortAlgorithm

## [冒泡排序](https://github.com/zhuyu126/SortAlgorithm/tree/master/BubbleSort)

## [插入排序](https://github.com/zhuyu126/SortAlgorithm/tree/master/InsertionSort)

## [选择排序](https://github.com/zhuyu126/SortAlgorithm/tree/master/SelectionSort)

## [堆排序](https://github.com/zhuyu126/SortAlgorithm/tree/master/HeapSort)

## [归并排序](https://github.com/zhuyu126/SortAlgorithm/tree/master/MergeSort)

## [快速排序](https://github.com/zhuyu126/SortAlgorithm/tree/master/QuickSort)

## [希尔排序](https://github.com/zhuyu126/SortAlgorithm/tree/master/ShellSort)

## 基于比较的排序算法总结

### 同一种排序算法的多种实现

- 归并排序
  - [自顶向下的归并排序法—递归](https://github.com/zhuyu126/SortAlgorithm/blob/master/MergeSort/MergeSort.java) 
  - [自底向上的归并排序法—迭代](https://github.com/zhuyu126/SortAlgorithm/blob/master/MergeSort/MergeSortBU.java)
- 快速排序
  - [单路快速排序法—在解决有序数组排序时的性能退化问题](https://github.com/zhuyu126/SortAlgorithm/blob/master/QuickSort/QuickSort.java)
  - [双路快速排序法](https://github.com/zhuyu126/SortAlgorithm/blob/master/QuickSort/QuickSort2Way.java)
  - [三路快速排序法](https://github.com/zhuyu126/SortAlgorithm/blob/master/QuickSort/QuickSort3Ways.java)
- 希尔排序
  - [不同的增量步长gap](https://github.com/zhuyu126/SortAlgorithm/blob/master/ShellSort/ShellSort.java)

### 排序算法的稳定性

排序的稳定性：排序前后相等的两个元素，排序后的相对位置不变。如果元素只有一个域，怎讨论稳定性是没有意义的。

| 排序算法 | 算法稳定性 |
| -------- | ---------- |
| 快速排序 | 不稳定     |
| 希尔排序 | 不稳定     |
| 选择排序 | 不稳定     |
| 堆排序   | 不稳定     |
| 插入排序 | 稳定       |
| 冒泡排序 | 稳定       |
| 归并排序 | 稳定       |

### 排序算法总结

| 排序算法 | 时复杂度         | 空间复杂度 | 算法稳定性 | 特殊数据下的时间复杂度              | 其他（如应用）                |
| -------- | ---------------- | ---------- | ---------- | ----------------------------------- | ----------------------------- |
| 快速排序 | O(nlog n) *****  | O(1)       | 不稳定     | 含有相同元素数组，三路快排时间 O(n) | O(n) 求解 selectK, topK 问题  |
| 希尔排序 | O(nlog n) -O(n²) | O(1)       | 不稳定     |                                     | 分组思想                      |
| 选择排序 | O(n²)            | O(1)       | 不稳定     |                                     |                               |
| 堆排序   | O(nlog n)        | O(1)       | 不稳定     |                                     | 堆;优先队列                   |
| 插入排序 | O(n²)            | O(1)       | 稳定       | 完全有序数组，时间 O(n)             |                               |
| 冒泡排序 | O(n²)            | O(1)       | 稳定       | 完全有序数组，时间 O(n)             |                               |
| 归并排序 | O(nlog n)        | O(n)       | 稳定       | 完全有序数组，时间 O(n)             | O(nlogn) 求解数组中逆序对个数 |

