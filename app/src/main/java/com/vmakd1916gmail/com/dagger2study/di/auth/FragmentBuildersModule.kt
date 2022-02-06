package dev.ronnie.imageloaderdagger2.di.modules


import com.vmakd1916gmail.com.dagger2study.ui.auth.fragments.AuthFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeAuthFragment(): AuthFragment



}
