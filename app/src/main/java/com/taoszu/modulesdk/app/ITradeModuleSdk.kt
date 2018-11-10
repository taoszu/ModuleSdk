package com.taoszu.modulesdk.app

import com.taoszu.modulesdk.IModuleSdk

interface ITradeModuleSdk : IModuleSdk {

    fun isSupportTrade(platKey:String): Boolean
}