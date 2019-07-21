class SplitList {
  /*def splitList[A](l: List[A], f: A => Boolean): (List[A], List[A]) = {

    def splitList1[A](l1: List[A], l2: List[A],l3:List[A]): (List[A], List[A]) = {
      l3 match {
        case _ if l3.isEmpty=>  (l1, l2)
        case a if f(a) => splitList1(l1, l3.head:: l2,l3.tail)
        case b if !f(b) => splitList1(l3.head :: l1, l2,l3.tail)
      }
    }

    splitList1(List.empty, List.empty,l)
  }*/
}
