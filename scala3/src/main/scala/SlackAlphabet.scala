import java.util.Locale
import scala.annotation.tailrec

@main def slackAlphabet(): Unit =
  println("Hello, world! Type in the text to translate.")

  @tailrec def run(): Unit = 
    val input = scala.io.StdIn.readLine()
    input.toLowerCase(Locale.ENGLISH).toList.foreach { c =>
      if (c == ' ') print("  ")
      else if (c >= 'a' && c <= 'z') print(s":alphabet-white-$c: ")
    }
    println()
    run()
  
  run()
