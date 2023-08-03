package jp.ac.it_college.std.s22030.lifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import jp.ac.it_college.std.s22030.lifecyclesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifeCycleSample", "Main onCreate() called.")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btNext.setOnClickListener(::onNextClick)
    }
    private fun onNextClick(view: View){
        val intent = Intent(this, SubActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        Log.i("LifeCycleSample", "Main onStart() called.")
        super.onStart()
    }

    override fun onRestart() {
        Log.i("LifeCycleSample", "Main onRestart() called.")
        super.onRestart()
    }

    override fun onResume() {
        Log.i("LifeCycleSample", "Main onResume() called.")
        super.onResume()
    }

    override fun onPause() {
        Log.i("LifeCycleSample", "Main onPause() called.")
        super.onPause()
    }

    override fun onStop() {
        Log.i("LifeCycleSample", "Main onStop() called.")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("LifeCycleSample", "Main onDestroy() called.")
        super.onDestroy()
    }
}