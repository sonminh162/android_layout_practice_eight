package com.lifetime.practice_layout_eight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //make translucent statusBar on kitkat devices
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        //make fully Android Transparent Status bar
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.hasFixedSize();

        recyclerViewLayoutManager = new GridLayoutManager(context,2);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        ArrayList<rvInfo> arrayList = new ArrayList<>();
        arrayList.add(new rvInfo(R.drawable.r1c1,"Diet Recommendation"));
        arrayList.add(new rvInfo(R.drawable.r1c2,"Kegel Exercises"));
        arrayList.add(new rvInfo(R.drawable.r2c1,"Meditation"));
        arrayList.add(new rvInfo(R.drawable.r2c2,"Yoga"));

        recyclerViewAdapter = new CustomAdapter(arrayList,context);
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on){
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if(on){
            winParams.flags |=bits;
        }else{
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}
