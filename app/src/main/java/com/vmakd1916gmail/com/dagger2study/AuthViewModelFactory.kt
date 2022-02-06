package com.vmakd1916gmail.com.dagger2study

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vmakd1916gmail.com.dagger2study.di.auth.AuthScope
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton


@AuthScope
class AuthViewModelFactory
@Inject
constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = creators[modelClass] ?: creators.entries.firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value ?: throw IllegalArgumentException("unknown model class $modelClass")
        try {
            @Suppress("UNCHECKED_CAST")
            return creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }
}
