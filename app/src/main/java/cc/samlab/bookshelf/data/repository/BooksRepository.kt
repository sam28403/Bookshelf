package cc.samlab.bookshelf.data.repository

interface BooksRepository {
    suspend fun getBooksImages(query: String): List<String>?
}