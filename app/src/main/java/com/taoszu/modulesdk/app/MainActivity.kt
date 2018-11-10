package com.taoszu.modulesdk.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.taoszu.modulesdk.ModuleSdkProviderHub

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ModuleSdkProviderHub.install(
            ITradeModuleSdk::class.java,
            TradeModuleSdk()
        )

        val tradeModuleSdk = ModuleSdkProviderHub.getSdk(ITradeModuleSdk::class.java)
        tradeModuleSdk?.also {
            Log.e("ModuleSdk", it.isSupportTrade("okex").toString())
            Log.e("ModuleSdk", it.isSupportTrade("aex").toString())
        }

    }

}
