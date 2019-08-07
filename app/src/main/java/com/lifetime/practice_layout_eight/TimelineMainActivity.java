package com.lifetime.practice_layout_eight;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TimelineMainActivity extends AppCompatActivity {

    private int index = 0;

    private final int[] arrayColor = {
            R.color.white,
            R.color.cinnabar,
            R.color.watusi,
            R.color.babyBlue,
            R.color.navyBlue,
            R.color.melrose,
            R.color.waxFlower,
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {

        customActionBar();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeline_main);

        initView();
    }

    public void initView() {
        RecyclerView recyclerView = findViewById(R.id.timeline_recycler_view);
        recyclerView.hasFixedSize();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Status(R.drawable.avatar_example, "User Name", "2m ago", R.drawable.background_test3, "221", "221", getResources().getColor(arrayColor[index + 1]), getResources().getColor(arrayColor[index])));
        checkIndex();
        arrayList.add(new Status(R.drawable.jacob, "User Name", "2m ago", getResources().getString(R.string.content_example), "221", "221", getResources().getColor(arrayColor[index + 1]), getResources().getColor(arrayColor[index])));
        checkIndex();
        arrayList.add(new Notify(R.drawable.andrew, "User Name", "2m ago", getResources().getString(R.string.notify_example), R.drawable.johny, R.drawable.hellokitty, R.drawable.jacob, getResources().getColor(arrayColor[index + 1]), getResources().getColor(arrayColor[index])));
        checkIndex();
        arrayList.add(new Status(R.drawable.kid, "User Name", "2m ago", getResources().getString(R.string.content_example), "221", "221", getResources().getColor(arrayColor[index + 1]), getResources().getColor(arrayColor[index])));
        checkIndex();

        TimelineAdapter adapter = new TimelineAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    private void checkIndex() {
        if (indexOver()) index = 1;
    }

    private boolean indexOver() {
        index++;
        if (index == 7) return true;
        return false;
    }

    private void customActionBar() {
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
    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }


}
