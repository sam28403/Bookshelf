package cc.samlab.bookshelf.di

import cc.samlab.bookshelf.data.network.BooksApi
import cc.samlab.bookshelf.data.repository.BooksRepository

interface AppContainer {
    val booksApi: BooksApi
    val booksRepository: BooksRepository
}

