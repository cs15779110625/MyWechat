package swu.cs.mywechat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //接收数据
        text.setText(intent.data?.schemeSpecificPart)
        //返回按钮
        back.setOnClickListener {
            Intent().apply {
                action = "android.intent.action.CAUCULATE"
            }.also {
                startActivity(it)
            }
            finish()
        }
    }
}