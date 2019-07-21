object main extends App {
val l1=List[String]("M","E","UK","K")
  val l2=List[String]("M","E","K")

  val con=new ConcateList
 println(con.concateList(l1,l2))

  val seq=new Sequence
  println(seq.hasSebsequence[String](l1,l2))
  val fold=new FoldRight
  println(fold.foldRight(l1))
}
