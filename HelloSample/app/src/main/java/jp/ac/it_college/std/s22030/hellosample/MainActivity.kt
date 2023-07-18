package jp.ac.it_college.std.s22030.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import jp.ac.it_college.std.s22030.hellosample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*
    ViewBinding 機能を使って画面を作る方法。
    activity_main.xml ファイルに対して activityMainBinding クラスが
    自動生成されます。(レイアウトファイル名 + Binding
     */
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Binding クラスのインスタンスを生成シてもらう
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Binding クラスが管理しているビューを使う
        setContentView(binding.root)

        // ぼたんを取ってくる
        // val btClick = findViewById<Button>(R.id.btClick)
        // findViewByID で取ってくるとか古すぎるのでしません
        // リスナクラスのインスタンスを作る
        val listener = HelloListener()
        // ボタンにリスナを設定する
        binding.btClick.setOnClickListener(listener)
    }

    private inner class HelloListener : View.OnClickListener{
        override fun onClick(v: View?) {
            // 名前が入力されるであろう EditText を取ってくる
            // val input = findViewById<EditText>(R.id.etName)
            val input = binding.etName

            // メッセージを出力する先の TextView を取ってくる
            // val output = findViewById<TextView>(R.id.tvOutput)
            val output = binding.tvOutput

            // intput(EditText) から入力内容を取り出して String型へ
            // val inputStr = input.text.toString()
            val inputstr = binding.etName.text.toString()

            // メッセージを取り出す
            // output.text = "${inputStr}さん、こんばんは"
            binding.tvOutput.text = "${inputstr}さん、こんばんは"
        }
    }
}