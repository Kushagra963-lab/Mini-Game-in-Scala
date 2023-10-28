import scala.collection.mutable.ListBuffer
import scala.language.postfixOps

object MathExtensions {

  implicit class IntPredicates(i: Int) {
    def primeListBufferTo(upperLimit: Int) = makePrimeListBuffer(i, upperLimit)
    def primeListTo(upperLimit: Int) = (this primeListBufferTo upperLimit).toList
  }

  def makePrimeListBuffer(lowerLimit: Int, upperLimit: Int): ListBuffer[Int] = {

    val list = new ListBuffer[Int]()

    if (upperLimit < 2 || lowerLimit > upperLimit) {
      return list
    }

    def isNextPrime(test: Int): Boolean = {

      for (n <- list) {
        if (test % n == 0) return false
      }

      true
    }

    var current = 2

    while (current <= upperLimit) {
      if (isNextPrime(current)) list += current
      current += 1
    }

    // remove numbers that are less than the lowerLimit

    list.filter(_ >= lowerLimit)

  }

}

