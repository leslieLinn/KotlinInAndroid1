package www.leslie.org.hook;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Scroller;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public MyButton btn;
    public Scroller scroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startService(new Intent(this,TargetService.class));
       // startActivity(new Intent(this,HookActivity.class));
       // test();

//        replaceActivityInstrumentation();
        btn = findViewById(R.id.btn);


    }

    private void test() {
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }

    }
    public void click(View view){
       // test();
        boolean b = view instanceof Button;
        System.out.println(b);
        System.out.println(view.getScrollX());
        btn.smoothScrollTo(-400,0);
        System.out.println(view.getScrollX());



    }


    private void replaceActivityInstrumentation() {
        Field field = null;
        try {
            field = Activity.class.getDeclaredField("mInstrumentation");
            field.setAccessible(true);
            Instrumentation instrumentation = (Instrumentation) field.get((Activity) this);
            InstrumentationPrxy prxy = new InstrumentationPrxy(instrumentation);

            field.set((Activity)this,prxy);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
