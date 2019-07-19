class ConcateList {
  def concateList(l1:List[Int],l2:List[Int]):List[Int]={
    l2 match {
      case _ if (l1.isEmpty)=>l2
      case _=>concateList(l1.init,l1.last::l2)
    }
  }
}
