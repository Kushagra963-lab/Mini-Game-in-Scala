import scala.io.StdIn.readLine
import scala.util.Random
import MathExtensions._

object PrimeTimeApp extends App {

  // define constants and variables
  val MinAnswer = 201
  val MaxAnswer = 499
  var reply = "?"

  // generate a list of prime numbers from 200 to 500

  val primeList = MinAnswer primeListTo MaxAnswer

  // loop

  do {

    // generate a random number from 200 to 500

    var answer = 0

    while (answer % 2 == 0 || answer % 5 == 0) {
      answer = Random.nextInt(MaxAnswer - MinAnswer) + MinAnswer
    }

    // show the number and ask player if it is prime

    print(s"Is $answer a prime number? (Y/N/X=Exit) ")
    reply = readLine().toUpperCase()

    // show the correct answer

    val isPrime = primeList contains answer

    if (isPrime) {
      print(if (reply == "Y") "Correct!" else "Incorrect!")
      println(s" $answer is prime")
    }
    else {
      print(if (reply == "Y") "Incorrect!" else "Correct!")
      println(s" $answer is not prime")
    }

    println()

    // test for ending condition

  } while (reply != "X")
}

