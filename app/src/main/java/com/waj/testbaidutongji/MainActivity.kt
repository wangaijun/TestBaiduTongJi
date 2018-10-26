package com.waj.testbaidutongji

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.baidu.mobstat.StatService



class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Toast.makeText(this,"hello,world",Toast.LENGTH_LONG).show()
        }

        // 获取测试设备ID
        val testDeviceId = StatService.getTestDeviceId(this)
        // 日志输出
        android.util.Log.d("BaiduMobStat", "Test DeviceId : $testDeviceId")
    }
}
