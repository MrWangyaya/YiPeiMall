package cn.hys.zdft.yipeimall.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.hys.zdft.yipeimall.R;
import cn.hys.zdft.yipeimall.utils.T;

/**
 * Created by wangzeya on 16/8/3.
 */
public class SettingActivity extends Activity {


    @Bind(R.id.rl_back)
    RelativeLayout rlBack;
    @Bind(R.id.rl_msg_setting)
    RelativeLayout rlMsgSetting;
    @Bind(R.id.rl_clear)
    RelativeLayout rlClear;
    @Bind(R.id.rl_about)
    RelativeLayout rlAbout;
    @Bind(R.id.btn_exit)
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_setting);
        ButterKnife.bind(this);

        setListener();

    }

    private void setListener() {
        rlBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        rlAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T.showShort(SettingActivity.this,"关于");
            }
        });

        rlClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T.showShort(SettingActivity.this,"清理完成");
            }
        });

        rlMsgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T.showShort(SettingActivity.this,"推送设置");
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T.showShort(SettingActivity.this,"退出登录");
            }
        });
    }
}
