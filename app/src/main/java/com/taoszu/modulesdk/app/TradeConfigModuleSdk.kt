package com.taoszu.modulesdk.app

class TradeConfigModuleSdk : ITradeConfigModuleSdk {

    private val platSet = mutableSetOf<String>()

    override fun onDepend() {}

    override fun onInstall() {
        platSet.add("okex")
        platSet.add("huobipro")
    }

    override fun onUninstall() {

    }

    override fun getConfigPlatList(): Set<String> {
        return platSet
    }

}