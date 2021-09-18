import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementBasicAndroid(){
//    android  kotlin core
    add("implementation", Dependencies.Androidx.CoreKtx)
//    android  Appcompat
    add("implementation", Dependencies.Androidx.AppCompat)
//    android  Material
    add("implementation", Dependencies.Androidx.Material)
//    android  ConstraintLayout
    add("implementation", Dependencies.Androidx.ConstraintLayout)

}

fun DependencyHandler.implementAndroidX(){
    add("implementation", Dependencies.DependencyInjection.daggerHilt)
    add("kapt", Dependencies.DependencyInjection.daggerHiltCompiler)
    add("implementation", Dependencies.DependencyInjection.androidHiltViewModel)
    add("kapt", Dependencies.DependencyInjection.androidHiltCompiler)
    add("implementation", Dependencies.Androidx.ActivityKtx)
    add("implementation", Dependencies.Androidx.FragmentKtx)


    add("implementation", Dependencies.WebKit.webKit)
    add("implementation", Dependencies.Lifecycle.viewmodelKtx)
    add("implementation", Dependencies.Lifecycle.lifecycleRuntime)
    add("implementation",Dependencies.Coroutine.coroutineCore)
    add("implementation",Dependencies.Coroutine.coroutineAndroid)
    add("implementation",Dependencies.SwipeRefreshLayout.swiperefreshlayout)

}

fun DependencyHandler.implementDataBase(){
    add("implementation",Dependencies.Storage.RoomRuntime)
    add("kapt", Dependencies.Storage.RoomCompiler)
    add("implementation",Dependencies.Storage.RoomKtx)
    add("implementation",Dependencies.Storage.RoomPaging3)
    add("implementation", Dependencies.Storage.paging)
    add("implementation", Dependencies.Storage.firebaseDatabase)

    add("implementation", Dependencies.Storage.preferenceDataStore)
    add("implementation", Dependencies.Storage.protoDataStore)
    add("implementation", Dependencies.Storage.protobuf)


}

fun DependencyHandler.implementTest() {
    add("testImplementation", Dependencies.Test.junit)
}

fun DependencyHandler.implementAndroidTest() {
    add("androidTestImplementation", Dependencies.AndroidTest.espresso)
    add("androidTestImplementation", Dependencies.AndroidTest.extJunitKtx)

}

fun DependencyHandler.implementNetwork(){
    add("implementation", Dependencies.Network.retrofit)
    add("implementation", Dependencies.Network.retrofitConverterGson)
    add("implementation", Dependencies.Network.googleGson)
    add("implementation", Dependencies.Network.retrofitConverterJackson)
    add("implementation", Dependencies.Network.retrofitConverterMoshi)
    add("implementation", Dependencies.Network.okhttp)
    add("implementation", Dependencies.Network.loggingInterceptor)
    add("implementation", Dependencies.Network.jacksonCore)
    add("implementation", Dependencies.Network.jacksonAnnotation)
    add("implementation", Dependencies.Network.jacksonDataBind)
    add("implementation", Dependencies.Network.moshiCore)
    add("kapt", Dependencies.Network.moshiCodegen)
    add("implementation", Dependencies.Network.glide)
    add("kapt", Dependencies.Network.glideCompiler)
    add("implementation", Dependencies.Network.picasso)



}


