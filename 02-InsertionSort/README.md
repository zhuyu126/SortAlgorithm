插入排序的设计初衷是**往有序的数组中快速插入一个新的元素**。它的算法思想是：把要排序的数组分为了两个部分, 一部分是数组的全部元素(除去待插入的元素), 另一部分是待插入的元素; 先将第一部分排序完成, 然后再插入这个元素. 其中第一部分的排序也是通过再次拆分为两部分来进行的.

插入排序由于操作不尽相同, 可分为 _直接插入排序_ , _折半插入排序(又称二分插入排序)_, _链表插入排序_ , **希尔排序** 。我们先来看下直接插入排序。

### 直接插入排序

**1、基本思想**
直接插入排序的基本思想是：将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序的元素小，则交换，直到全部元素都比较过为止。

**2、算法描述**
一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
①.从第一个元素开始，该元素可以认为已经被排序
②.取出下一个元素，在已经排序的元素序列中从后向前扫描
③.如果该元素（已排序）大于新元素，将该元素移到下一位置
④.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
⑤.将新元素插入到该位置后
⑥.重复步骤②~⑤

图解直接插入排序:

![image](https://tva1.sinaimg.cn/large/007S8ZIlgy1gh92ofc2zfg30mj0e113f.gif)

算法实现中比较有意思的一点是，在每次比较操作发现取出来的新元素小于等于已排序的元素时，可以将已排序的元素移到下一位置，然后将取出来的新元素插入该位置（即相邻位置对调），接着再与前面的已排序的元素进行比较，如上图所示，这样做缺点是交换操作代价比较大。另一种做法是：将新元素取出（挖坑），从左到右依次与已排序的元素比较，如果已排序的元素大于取出的新元素，那么将该元素移动到下一个位置（填坑），接着再与前面的已排序的元素比较，直到找到已排序的元素小于等于新元素的位置，这时再将新元素插入进去。就像基本思想中的动图演示的那样。

**3、算法复杂度**
直接插入排序复杂度如下：

最好情况下，排序前对象已经按照要求的有序。比较次数(KCN)：_[Math Processing Error]_；移动次数(RMN)为 _[Math Processing Error]_。则对应的时间复杂度为 _[Math Processing Error]_。
最坏情况下，排序前对象为要求的顺序的反序。第i趟时第i个对象必须与前面i个对象都做排序码比较，并且每做1次比较就要做1次数据移动（从上面给出的代码中看出）。比较次数(KCN)：_[Math Processing Error]_ ; 移动次数(RMN)为：_[Math Processing Error]_。则对应的时间复杂度为 _[Math Processing Error]_。
如果排序记录是随机的，那么根据概率相同的原则，在平均情况下的排序码比较次数和对象移动次数约为 _[Math Processing Error]_，因此，直接插入排序的平均时间复杂度为 _[Math Processing Error]_。
即：时间复杂度最佳情况(排序对象有序)：T(n) = O(n)  最差情况（排序对象无序）：T(n) = O(n²)  平均情况：T(n) = O(n²)
空间复杂度情况：O(1) 由于直接插入排序每次只移动一个元素的位，并不会改变值相同的元素之间的排序，因此它是一种稳定排序。