package cn.hys.zdft.yipeimall.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.hys.zdft.yipeimall.R;
import cn.hys.zdft.yipeimall.utils.T;

/**
 * Created by wangzeya on 16/8/3.
 */
public class MsgCenterActivity extends Activity {

    @Bind(R.id.rl_back)
    RelativeLayout rlBack;
    @Bind(R.id.tv_title)
    TextView tvTitle;
    @Bind(R.id.tv_KF)
    TextView tvKF;
    @Bind(R.id.ll_KF)
    LinearLayout llKF;
    @Bind(R.id.tv_zc)
    TextView tvZc;
    @Bind(R.id.ll_zc)
    LinearLayout llZc;
    @Bind(R.id.tv_yhcx)
    TextView tvYhcx;
    @Bind(R.id.ll_yhcx)
    LinearLayout llYhcx;
    @Bind(R.id.tv_xttz)
    TextView tvXttz;
    @Bind(R.id.ll_xttz)
    LinearLayout llXttz;
    @Bind(R.id.tv_wltz)
    TextView tvWltz;
    @Bind(R.id.ll_wltz)
    LinearLayout llWltz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_center);
        ButterKnife.bind(this);

        tvTitle.setText("消息中心");

        setListener();

    }



    private void setListener() {
        rlBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        llKF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MsgCenterActivity.this,SettingActivity.class));
            }
        });

        llZc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MsgCenterActivity.this,SettingActivity.class));
            }
        });

        llYhcx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MsgCenterActivity.this,SettingActivity.class));
            }
        });

        llXttz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MsgCenterActivity.this,SettingActivity.class));
            }
        });

        llWltz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MsgCenterActivity.this,SettingActivity.class));
            }
        });

    }
}
