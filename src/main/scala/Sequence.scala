class Sequence {
 def hasSebsequence[A](l1:List[A],l2:List[A]): Boolean = {
    l1 match {
      case _ if (l2.isEmpty) => true
      case _ if (l1.isEmpty) => false
      case _ if (l1.head == l2.head) => hasSebsequence(l1.tail, l2.tail)
      case _ => hasSebsequence(l1.tail, l2)
    }
  }

}
