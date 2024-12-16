package cc.samlab.bookshelf.fake

import com.lalosapps.bookshelf.data.network.Book
import com.lalosapps.bookshelf.data.network.BooksDto
import com.lalosapps.bookshelf.data.network.Thumbnails
import com.lalosapps.bookshelf.data.network.VolumeInfo

object FakeDataSource {

    val books = listOf(
        Book(
            "1",
            VolumeInfo(Thumbnails("url1"))
        ),
        Book(
            "2",
            VolumeInfo(Thumbnails("url2"))
        )
    )

    val dto = BooksDto(books)

    val dtoNoBooks = BooksDto(null)

    val images = books.mapNotNull { it.volumeInfo.imageLinks?.httpsThumbnail }
}