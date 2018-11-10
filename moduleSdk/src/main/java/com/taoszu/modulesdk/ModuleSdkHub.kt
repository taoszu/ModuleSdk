package com.taoszu.modulesdk

object ModuleSdkProviderHub {

    private val moduleSdkMap = mutableMapOf<Class<out IModuleSdk>, IModuleSdk>()

    fun install(moduleClass:Class<out IModuleSdk>, moduleSdkProvider:IModuleSdk) {
        moduleSdkMap[moduleClass] = moduleSdkProvider
`
        moduleSdkProvider.onDepend()
        moduleSdkProvider.onInstall()
    }

    fun <T : IModuleSdk> getSdk(moduleClass:Class<T>): T? {
        val moduleSdk = moduleSdkMap[moduleClass]
        return if (moduleSdk != null) {
            moduleSdk as T
        } else {
            null
        }
    }



}