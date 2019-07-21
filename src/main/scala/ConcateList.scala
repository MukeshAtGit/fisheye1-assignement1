class ConcateList {
  def concateList[A](l1:List[A],l2:List[A]):List[A]={
    l2 match {
      case _ if (l1.isEmpty)=>l2
      case _=>concateList[A](l1.init,l1.last::l2)
    }
  }
}
