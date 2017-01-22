package com.buildone.sellfy.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebHistoryItem;

import com.buildone.sellfy.R;
import com.buildone.sellfy.ui.fragment.SingInFragment;
import com.buildone.sellfy.ui.fragment.SingUpFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import goldzweigapps.tabs.Builder.EasyTabsBuilder;
import goldzweigapps.tabs.Colors.EasyTabsColors;
import goldzweigapps.tabs.Items.TabItem;
import goldzweigapps.tabs.View.EasyTabs;

public class LoginActivity extends AppCompatActivity {

    @ColorInt
    public static final int White = Color.parseColor("#CCFFFFFF");
    @ColorInt
    public static final int White_50 = Color.parseColor("#55FFFFFF");
    @ColorInt
    public static final int White_10 = Color.parseColor("#1Affffff");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        EasyTabs tabs = (EasyTabs)findViewById(R.id.EasyTabs);
        EasyTabsBuilder.with(tabs)
                .addTabs(
                        new TabItem(
                                new SingInFragment(), "Entrar"),
                                new TabItem(new SingUpFragment(), "Cadastrar"))
                .setTextColors(White, White_50)
                .setTabsBackgroundColor(White_10).Build();

    }


}
