class FoldRight {
  def foldRight[A](list: List[A]): Int = {
    val length = (list.foldRight(0)((_, len) => len + 1))
    length

  }
}



