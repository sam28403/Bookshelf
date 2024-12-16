package cc.samlab.bookshelf

import android.app.Application
import cc.samlab.bookshelf.di.AppContainer
import cc.samlab.bookshelf.di.DefaultAppContainer

class BookshelfApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}