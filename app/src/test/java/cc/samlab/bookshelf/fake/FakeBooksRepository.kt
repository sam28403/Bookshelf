package cc.samlab.bookshelf.fake

import com.lalosapps.bookshelf.data.repository.BooksRepository

class FakeBooksRepository : BooksRepository {

    var returnNull = false
    var returnEmpty = false

    override suspend fun getBooksImages(query: String): List<String>? {
        if (returnNull) return null
        if (returnEmpty) return emptyList()
        return FakeDataSource.images
    }
}