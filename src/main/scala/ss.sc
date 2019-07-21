val l1=List[Int](1,2,3,4,5,5)
val l2=List[Int](1,2,4)









def hasSebsequence[A](ll1: List[A], ll2: List[A]): Boolean = {
  def hasSebsequence1[B](list1: List[B], list2: List[B], x: Int = 0): Boolean = {
    list1 match {
      case _ if list2.isEmpty => true
      case _ if list1.isEmpty => false
      case _ if (list2.tail.isEmpty && list1.head == l2.head) => true
      case _ if list1.head == list2.head => {
        hasSebsequence1[B](list1.tail, list2.tail,x+1)
      }
      case _ if !(x == 0) => false
      case _ => hasSebsequence1[B](list1.tail, list2,x)
    }
  }
  hasSebsequence1[A](ll1,ll2,0)


}
hasSebsequence[Int](l1,l2)

