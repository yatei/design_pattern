import com.opencsv.CSVReader
import java.io.FileReader
import com.ibm.icu.text._

object Book{
  def main(args: Array[String]): Unit = {
    val reader = new CSVReader(new FileReader(args(0))) //csv読込

    var line: Array[String] = reader.readNext //1行目読込
    while(line != null) {

      //種類で分類
      line(3) match {
        case 
        paperbooklist(a6) +: line(3)
      }

      //サイズで分類
      line(2) match {
      }

      //著者でソート
      var authorChar = _
      if(!line(1)(0).toString.matches("[a-zA-Z0-9]")){
        val transliterator = Transliterator.getInstance("Hiragana-Latin")
        authorChar = transliterator.transliterate(line(1)(0))
      } else {
        authorChar = line(1)(0)
      }

      //タイトルでソート
      var titleChar = _
      if(!line(0)(0).toString.matches("[a-zA-Z0-9]")) {
        val transliterator = Transliterator.getInstance("Hiragana-Latin")
        titleChar = transliterator.transliterate(line(0)(0))
      } else {
        titleChar = line(0)(0)
      }

      line = reader.readNext //次行読込
    } //end of while
    //行の処理
  } //end of main
} //end of Book
