package com.xiaohui.weiximenu.weixi;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageView;

import java.lang.annotation.Annotation;


public class MainActivity extends ActionBarActivity {

    private ImageView ivMenu;
    private ImageView ivItem1;
    private ImageView ivItem2;
    private ImageView ivItem3;
    private ImageView ivItem4;

    private int current = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivMenu = (ImageView) findViewById(R.id.iv_menu);
        ivItem1 = (ImageView) findViewById(R.id.iv_item1);
        ivItem2 = (ImageView) findViewById(R.id.iv_item2);
        ivItem3 = (ImageView) findViewById(R.id.iv_item3);
        ivItem4 = (ImageView) findViewById(R.id.iv_item4);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnMenu(View view) {
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_menu);
//        ivMenu.startAnimation(animation);
        ivItem1.setVisibility(View.VISIBLE);
        ivItem2.setVisibility(View.VISIBLE);
        ivItem3.setVisibility(View.VISIBLE);
        ivItem4 .setVisibility(View.VISIBLE);
        Animator animator =null;

        current++;
        if(current%2==0) {
            //进来效果
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_in_menu);
            animator.setTarget(ivMenu);
            animator.start();
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_in_item1);
            animator.setTarget(ivItem1);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_in_item2);
            animator.setTarget(ivItem2);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_in_item3);
            animator.setTarget(ivItem3);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_in_item4);
            animator.setTarget(ivItem4);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();
        }else {
            //出去界面效果
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_menu);
            animator.setTarget(ivMenu);
            animator.start();


            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_item1);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.setTarget(ivItem1);
            animator.start();

            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_item2);
            animator.setTarget(ivItem2);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();

            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_item3);
            animator.setTarget(ivItem3);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_item4);
            animator.setTarget(ivItem4);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();
            animator = AnimatorInflater.loadAnimator(this, R.animator.animator_item4);
            animator.setTarget(ivItem4);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.start();
        }
    }
}
