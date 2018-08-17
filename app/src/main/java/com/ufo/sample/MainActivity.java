package com.ufo.sample;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private void myStartActivity(Class<?> activity) {

        startActivity(new Intent(this, activity));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        alipay();
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_simple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(SimpleActivity.class);
            }
        });

        findViewById(R.id.tv_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(FrameLayoutActivity.class);
            }
        });
        findViewById(R.id.tv_scrollview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(ScrollViewActivity.class);
            }
        });
        findViewById(R.id.tv_recycleView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(RecyclerViewActivity.class);
            }
        });
        findViewById(R.id.tv_auto_refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(AutoRefreshActivity.class);
            }
        });
        findViewById(R.id.tv_material).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(MaterialActivity.class);
            }
        });
        findViewById(R.id.tv_empty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(EmptyActivity.class);
            }
        });
        findViewById(R.id.tv_webView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(WebViewActivi.class);
            }
        });
        findViewById(R.id.tv_below).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(BelowActivity.class);
            }
        });
        findViewById(R.id.tv_custom_head_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(CustomHeadViewActivity.class);
            }
        });
        findViewById(R.id.tv_custom_foot_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(CustomFootViewActivity.class);
            }
        });

        findViewById(R.id.tv_banner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(BannerViewActivity.class);
            }
        });

        findViewById(R.id.tv_viewPager).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStartActivity(ViewPagerActivity.class);
            }
        });
    }


    private void alipay(){
        ClipboardManager mClipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        //第一个参数，是描述复制的内容，也可以和内容一样。
        ClipData clipData = ClipData.newPlainText("copy from demo", "支付宝发红包啦！长按复制此消息，打开最新版支付宝就能领取！0leOxx98r9");
        mClipboardManager.setPrimaryClip(clipData);
    }
}
