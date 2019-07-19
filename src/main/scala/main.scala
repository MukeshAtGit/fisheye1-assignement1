object main extends App {
val l1=List[Int](1,2,3,4)
  val l2=List[Int](5,6,7,8)

  val con=new ConcateList
 println(con.concateList(l1,l2))

  val seq=new Sequence
  println(seq.hasSebsequence(l1,l2))
  val fold=new FoldRight
  println(fold.foldRight(l1))
}
