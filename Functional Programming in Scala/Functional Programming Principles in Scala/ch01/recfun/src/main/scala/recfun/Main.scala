package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 2) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c==0||0==r||r==c)1
      else pascal(c-1,r-1)+pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    f(chars,0)
  }
  def f(chars:List[Char], x:Int):Boolean = {
    if(x<0)false
    else if(chars.isEmpty)x==0
    else if(chars.head=='(')f(chars.tail,x+1)
    else if(chars.head==')')f(chars.tail,x-1)
    else f(chars.tail,x)
  }
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money<0)0
      else if(money==0)1
      else if(coins.isEmpty)0
      else countChange(money-coins.head,coins)+countChange(money,coins.tail)
    }

  }
