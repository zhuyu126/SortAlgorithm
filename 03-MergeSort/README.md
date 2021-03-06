### MergeSort归并排序

`和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，因为始终都是O(n log n）的时间复杂度。代价是需要额外的内存空间,即不是原地排序算法。`

**1、归并排序的基本思想**

​	归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。归并排序是一种稳定的排序方法。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。 

​	归并排序算法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。

图解归并排序:

![image](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghh30u1ntpg30mj0e1qcv.gif)

**2、算法描述**

**归并排序可通过两种方式实现：**

- 自上而下的递归
- 自下而上的迭代

**递归法:**

①. 将序列每相邻两个数字进行归并操作，形成 floor(n/2)个序列，排序后每个序列包含两个元素；
②. 将上述序列再次归并，形成 floor(n/4)个序列，每个序列包含四个元素；
③. 重复步骤②，直到所有元素排序完毕。

**迭代法:**

①. 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
②. 设定两个指针，最初位置分别为两个已经排序序列的起始位置
③. 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
④. 重复步骤③直到某一指针到达序列尾
⑤. 将另一序列剩下的所有元素直接复制到合并序列尾

**⚠️如何归并**

​	Array[first…mid]为第一段，Array[mid+1…last]为第二段，并且两端已经有序，现在我们要将两端合成达到Array[first…last]并且也有序。

①.首先依次从第一段与第二段中取出元素比较，将较小的元素赋值给temp[],
②.重复执行上一步，当某一段赋值结束，则将另一段剩下的元素赋值给temp[],
此时将temp[]中的元素复制给Array[]，则得到的Array[first…last]有序

归并过程图解:

![image](https://tva1.sinaimg.cn/large/007S8ZIlgy1ghh3bw1quhg308c05040s.gif)



**⚠️如何分解**

​	在这里，我们采用递归的方法，首先将待排序列分成A,B两组；然后重复对A、B序列分组；直到分组后组内只有一个元素，此时我们认为组内所有元素有序，则分组结束。

**3、算法复杂度**

| 平均时间复杂度 | 最好情况 | 最坏情况 | 空间复杂度 |
| :------------- | :------- | :------- | :--------- |
| O(nlogn)       | O(nlogn) | O(nlogn) | O(n)       |

​     从效率上看，归并排序可算是排序算法中的”佼佼者”. 假设数组长度为n，那么拆分数组共需logn，, 又每步都是一个普通的合并子数组的过程， 时间复杂度为O(n)， 故其综合时间复杂度为O(nlogn)。另一方面， 归并排序多次递归过程中拆分的子数组需要保存在内存空间， 其空间复杂度为O(n)。

**4、算法优化**

①.在数据规模较小的情况下可以利用插入排序来对归并排序进行优化,但这种优化可能在部分语言中并没有任何好处,并且实际开发过程中这种优化方式也是不采取的。

②.常用的优化方法还是在内存操作上进行优化,在排序操作前创建一个全局的临时变量来存储数组信息,可以在归并操作时避免创建大量的临时变量,并且也使得array数组和临时的temp数组之间的偏移量消失,也减少了对偏移量的维护。

