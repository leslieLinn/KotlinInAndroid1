package www.leslie.org.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //1 2

    private var a:Int=10;
    private var c:Int=5

    public fun  say(i: Int):Boolean {
        //1 2 3
        try {
            val ha = TextView(this);
            var c:String?=null
            if (c == null) {

            }
            var s:String?=null
        } catch (e: Exception) {
        }
        return true;

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
}
