package com.example.myapplication

import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    var one: TextView? = null;
    var two: TextView? = null;
    var three: TextView? = null;
    var four: TextView? = null;
    var five: TextView? = null;
    var six: TextView? = null;
    var seven: TextView? = null;
    var eight: TextView? = null;
    var nine: TextView? = null;

    var plus: TextView? = null;
    var minus: TextView? = null;
    var mul: TextView? = null;
    var div: TextView? = null;
    var negtive: TextView? = null;
    var dot: TextView? = null;
    var equal: TextView? = null;
    var zero:TextView? = null;

    var topLine: TextView?=null;
    var figureShow: ImageView?=null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)
        initView();
        initClickEvent();
    }//onCreate()这是第一个回调，在活动第一次创建时调用.

    private fun initClickEvent() {
        one?.setOnClickListener {
            this.topLine?.text = "让子弹再飞一会儿";
            this.figureShow?.setImageResource(R.drawable.leader);
        };
        two?.setOnClickListener {
            this.topLine?.text = "你是要杀我还是睡我？";
            this.figureShow?.setImageResource(R.drawable.master);
        };
        three?.setOnClickListener {
            this.topLine?.text = "师爷真是装糊涂的天才~";
            this.figureShow?.setImageResource(R.drawable.boss);
        };
        four?.setOnClickListener {
            this.topLine?.text = "师爷高！县长硬！";
            this.figureShow?.setImageResource(R.drawable.boss);
        };
        five?.setOnClickListener {
            this.topLine?.text = "这哪是打我的屁股，这是打您的脸。";
            this.figureShow?.setImageResource(R.drawable.boxer);
        };
        six?.setOnClickListener { Log.d("Event happens:","click event!");
            this.topLine?.text = "这不是欺负老实人嘛？";
            this.figureShow?.setImageResource(R.drawable.liar);
        };
        seven?.setOnClickListener {
            this.topLine?.text = "比恶是吧，我比你还恶！";
            this.figureShow?.setImageResource(R.drawable.six);
        };
        eight?.setOnClickListener {
            this.topLine?.text = "步子迈大了，容易扯着蛋~";
            this.figureShow?.setImageResource(R.drawable.master);
        };
        nine?.setOnClickListener {
            this.topLine?.text = "你给我他妈的翻译一下他妈的到底什么是他妈的惊喜";
            this.figureShow?.setImageResource(R.drawable.leader);
        };
        plus?.setOnClickListener {  }
        minus?.setOnClickListener {  }
        mul?.setOnClickListener {  }
        div?.setOnClickListener {  }
        negtive?.setOnClickListener {  }
        dot?.setOnClickListener {  }
        equal?.setOnClickListener {  }
        zero?.setOnClickListener {  }


    }

    private fun initView() {

        one=this.findViewById(R.id.tv_one) as TextView;
        two=this.findViewById(R.id.tv_two) as TextView;
        three=this.findViewById(R.id.tv_three) as TextView;
        four=this.findViewById(R.id.tv_four) as TextView;
        five=this.findViewById(R.id.tv_five) as TextView;
        six=this.findViewById(R.id.tv_six) as TextView;
        seven=this.findViewById(R.id.tv_seven) as TextView;
        eight=this.findViewById(R.id.tv_eight) as TextView;
        nine=this.findViewById(R.id.tv_nine) as TextView;
        plus=this.findViewById(R.id.tv_plus) as TextView;
        minus=this.findViewById(R.id.tv_minus) as TextView;
        mul=this.findViewById(R.id.tv_multiply) as TextView;
        div=this.findViewById(R.id.tv_divide) as TextView;
        negtive=this.findViewById(R.id.tv_negative_or_positive) as TextView;
        dot=this.findViewById(R.id.tv_dot) as TextView;
        equal=this.findViewById(R.id.tv_equal) as TextView;
        zero=this.findViewById(R.id.tv_zero) as TextView;
        topLine=this.findViewById(R.id.top_line) as TextView;
        figureShow=this.findViewById(R.id.iv_figure) as ImageView;

    }


}