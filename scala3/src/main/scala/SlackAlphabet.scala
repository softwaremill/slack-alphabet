import java.util.Locale
import scala.annotation.tailrec

@main @tailrec def slackAlphabet(): Unit =
  println("Type in the text to translate:")
  val input = scala.io.StdIn.readLine()
  input.toLowerCase(Locale.ENGLISH).toList.foreach { c =>
    if (c == ' ') print("  ")
    else if (c >= 'a' && c <= 'z') print(s":alphabet-white-$c: ")
  }
  println()
  slackAlphabet()
