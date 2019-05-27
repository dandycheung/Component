package com.xiaojinzi.component.help.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.xiaojinzi.base.ModuleConfig;
import com.xiaojinzi.component.anno.RouterAnno;
import com.xiaojinzi.component.help.R;
import com.xiaojinzi.component.impl.Router;
import com.xiaojinzi.component.impl.Navigator;
import com.xiaojinzi.component.impl.RouterErrorResult;
import com.xiaojinzi.component.impl.RouterRequest;
import com.xiaojinzi.component.impl.RouterResult;
import com.xiaojinzi.component.support.CallbackAdapter;
import com.xiaojinzi.component.support.ParameterSupport;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

@RouterAnno(
        host = ModuleConfig.Help.NAME,
        path = ModuleConfig.Help.CANCEL_FOR_TEST,
        desc = "完成自动取消路由的测试"
)
public class CancelForTestAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_cancel_for_test_act);
        TextView tv_tip = findViewById(R.id.tv_tip);
        Boolean isUseFragment = ParameterSupport.getBoolean(getIntent(), "isUseFragment", false);
        if (isUseFragment) {
            tv_tip.setText("测试 Fragment");
        }else {
            tv_tip.setText("测试 Activity");
        }
        Completable.complete()
                .observeOn(Schedulers.io())
                .delay(2000, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action() {
                    @Override
                    public void run() throws Exception {
                        start();
                    }
                });

    }

    private void start() {
        Navigator navigator;
        Boolean isUseFragment = ParameterSupport.getBoolean(getIntent(), "isUseFragment", false);
        if (isUseFragment) {
            Fragment fragment = new Fragment();
            getSupportFragmentManager().beginTransaction().add(fragment, "testFragment").commitNowAllowingStateLoss();
            navigator = Router.with(fragment);
        } else {
            navigator = Router.with(this);
        }
        navigator
                .host(ModuleConfig.Help.NAME)
                .path(ModuleConfig.Help.SHOULD_NOT_APPEAR)
                .navigate();
        setResult(RESULT_OK);
        finish();
    }

}
