class Book extends BookSize with BookType {
  var bookInfo =  Tuple(title: String, author: String, bookSize: BookSize, bookType: BookType, id: Int)

  def book(title: String, author: String, bookSize: BookSize, bookType: BookType, id: Int) {
    this.title = bookInfo._1
    this.author = bookInfo._2
    this.bookSize = bookInfo._3
    this.bookType = bookInfo._4
    this.id = CalculateId.
  }
}

trait BookSize {

}

trait BookType {
}

class CalculateId {
}

trait Compare {
}

class BookSizeCompare extends Compare {
}

class BookTypeCompare extends Compare {
}

class TitleCompare extends Compare {
}
