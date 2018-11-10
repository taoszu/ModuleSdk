package com.taoszu.modulesdk.app

import com.taoszu.modulesdk.IModuleSdk

interface ITradeConfigModuleSdk : IModuleSdk {

    fun getConfigPlatList():Set<String>
}