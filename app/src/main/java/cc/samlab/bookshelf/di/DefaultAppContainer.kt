package cc.samlab.bookshelf.di

import cc.samlab.bookshelf.data.network.BooksApi
import cc.samlab.bookshelf.data.repository.BooksRepository
import cc.samlab.bookshelf.data.repository.DefaultBooksRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class DefaultAppContainer : AppContainer {
    private val baseUrl = "https://www.googleapis.com/books/v1/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    override val booksApi: BooksApi by lazy {
        retrofit.create()
    }
    override val booksRepository: BooksRepository by lazy {
        DefaultBooksRepository(booksApi)
    }
}