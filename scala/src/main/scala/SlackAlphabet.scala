import java.util.Locale
import scala.annotation.tailrec

object SlackAlphabet extends App {
  println("Hello, world! Type in the text to translate.")

  @tailrec
  def run() {
    val input = scala.io.StdIn.readLine()
    input.toLowerCase(Locale.ENGLISH).toList.foreach { c =>
      if (c == ' ') print("  ")
      else if (c >= 'a' && c <= 'z') print(s":alphabet-white-$c: ")
    }
    println()
    run()
  }

  run()
}
