package leetcode.week_of_code_26;

public class DisjointSetNode<T> {
  protected T data;
  protected DisjointSetNode<T> parent = null;
  protected int rank = 0;

  public DisjointSetNode(T data) {
    this.data = data;
    this.parent = this;
  }
}
