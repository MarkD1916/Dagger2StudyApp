package dev.ronnie.imageloaderdagger2.di.modules


import com.vmakd1916gmail.com.dagger2study.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class AuthActivityModule {
    @ContributesAndroidInjector(
        modules = [
            FragmentBuildersModule::class
        ]
    )
    abstract fun contributeAuthActivity(): AuthActivity
}
