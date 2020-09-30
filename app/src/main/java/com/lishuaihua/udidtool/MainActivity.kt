package com.lishuaihua.udidtool

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lishuaihua.udid.DeviceIdUtil
import com.lishuaihua.udid.MD5Util
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var mContext: Context
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContext=this

        btn_get_mac_address.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(v: View?) {
                var macAddress: String = DeviceIdUtil.macAddress
                macAddress=   MD5Util.md5(macAddress)
                tv_device_id.setText("Mac地址：$macAddress")
            }
        })
        btn_get_android_id.setOnClickListener(object : View.OnClickListener {
            override   fun onClick(v: View?) {
                var androidId: String = DeviceIdUtil.getAndroidId(mContext)
                androidId=   MD5Util.md5(androidId)
                tv_device_id.setText("ANDROID_ID：$androidId")
            }
        })

        btn_get_device_id.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(v: View?) {
                var deviceId: String = DeviceIdUtil.getDeviceId(mContext)
                deviceId=   MD5Util.md5(deviceId)
                tv_device_id.setText("DEVICE_ID：$deviceId")
            }
        })

    }


}

