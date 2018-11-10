package com.taoszu.modulesdk.app

import com.taoszu.modulesdk.ModuleSdkProviderHub

class TradeModuleSdk : ITradeModuleSdk {

    override fun onDepend() {
        ModuleSdkProviderHub.install(ITradeConfigModuleSdk::class.java, TradeConfigModuleSdk())
    }

    override fun onInstall() {

    }

    override fun onUninstall() {

    }

    override fun isSupportTrade(platKey: String): Boolean {
        val tradeConfigModuleSdk = ModuleSdkProviderHub.getSdk(ITradeConfigModuleSdk::class.java)
        return tradeConfigModuleSdk?.getConfigPlatList()?.contains(platKey) ?: false
    }

}