package com.bn.Particle;

import android.opengl.GLES30;

/**
 * Created by Administrator on 2017/12/21.
 */

public class ParticleFireworkDataConstant {

    //资源锁
    public static Object lock=new Object();
    //火焰的初始总位置
    public static float distancesFireXZ=6;
    //火盆的初始总位置
    public static float distancesBrazierXZ=6;
    public static float[][] positionFireXZ={{distancesFireXZ,distancesFireXZ,distancesFireXZ},{distancesFireXZ,-distancesFireXZ},{-distancesFireXZ,distancesFireXZ},{-distancesFireXZ,-distancesFireXZ}};
    public static float[][] positionBrazierXZ={{distancesBrazierXZ,distancesBrazierXZ},{distancesBrazierXZ,-distancesBrazierXZ},{-distancesBrazierXZ,distancesBrazierXZ},{-distancesBrazierXZ,-distancesBrazierXZ}};
    public static int walls[]=new int[6];
    //起始颜色
    public static final float[] START_COLOR={0.7569f,0.2471f,0.1176f,0.5f};
//			{
//					{0.7569f,0.2471f,0.1176f,1.0f},	//0-普通火焰
//					{0.7569f,0.2471f,0.1176f,1.0f},	//1-白亮火焰
//					{0.6f,0.6f,0.6f,1.0f},			//2-普通烟
//					{0.6f,0.6f,0.6f,1.0f},			//3-纯黑烟
//			};

    //终止颜色
    public static final float[] END_COLOR={0.0f,0.0f,0.0f,0.0f};	//0-普通火焰
//			{
//					{0.0f,0.0f,0.0f,0.0f},	//0-普通火焰
//					{0.0f,0.0f,0.0f,0.0f},	//1-白亮火焰
//					{0.0f,0.0f,0.0f,0.0f},	//2-普通烟
//					{0.0f,0.0f,0.0f,0.0f},	//3-纯黑烟
//			};

    //源混合因子
    public static final int SRC_BLEND= GLES30.GL_SRC_ALPHA;			//0-普通火焰
//			{
//					GLES30.GL_SRC_ALPHA,   				//0-普通火焰
//					GLES30.GL_ONE,   					//1-白亮火焰
//					GLES30.GL_SRC_ALPHA,				//2-普通烟
//					GLES30.GL_ONE,						//3-纯黑烟
//			};

    //目标混合因子
    public static final int DST_BLEND=GLES30.GL_ONE;//GLES30.GL_ONE;//0-普通火焰
//			{
//					GLES30.GL_ONE,      				//0-普通火焰
//					GLES30.GL_ONE,      				//1-白亮火焰
//					GLES30.GL_ONE_MINUS_SRC_ALPHA,		//2-普通烟
//					GLES30.GL_ONE,						//3-纯黑烟
//			};

    //混合方式
    public static final int BLEND_FUNC=GLES30.GL_FUNC_ADD;
//			{
//					GLES30.GL_FUNC_ADD,    				//0-普通火焰
//					GLES30.GL_FUNC_ADD,    				//1-白亮火焰
//					GLES30.GL_FUNC_ADD,    				//2-普通烟
//					GLES30.GL_FUNC_REVERSE_SUBTRACT,	//3-纯黑烟
//			};

    //
    public static final int COUNT=150;
    //			{
//					340,   				//0-普通火焰
//					340,   					//1-白亮火焰
//					99,				//2-普通烟
//					99,						//3-纯黑烟
//			};
    //单个粒子半径
    public static final float RADIS=100f;
//			{
//					60*0.5f,		//0-普通火焰
//					60*0.5f,		//1-白亮火焰
//					60*0.8f,		//2-普通烟
//					60*0.8f,		//3-纯黑烟
//			};

    //粒子最大生命期
    public static final float MAX_LIFE_SPAN=4.0f;
//			{
//					5.0f,		//0-普通火焰
//					5.0f,		//1-白亮火焰
//					6.0f,		//2-普通烟
//					6.0f,		//3-纯黑烟
//			};

    //粒子生命周期步进
    public static final float LIFE_SPAN_STEP=0.08f;
//			{
//					0.07f,		//0-普通火焰
//					0.07f,		//1-白亮火焰
//					0.07f,		//2-普通烟
//					0.07f,		//3-纯黑烟
//			};

    //粒子发射的X左右范围
    public static final float X_RANGE=5.0f;
//			{
//					0.5f,		//0-普通火焰
//					0.5f,		//1-白亮火焰
//					0.5f,		//2-普通烟
//					0.5f,		//3-纯黑烟
//			};

    //粒子发射的Y上下范围
    public static final float Y_RANGE=20f;
//			{
//					0.3f,		//0-普通火焰
//					0.3f,		//1-白亮火焰
//					0.15f,		//2-普通烟
//					0.15f,		//3-纯黑烟
//			};

    //粒子发射的Z上下范围
    public static final float Z_RANGE=10f;

    //每次喷发发射的数量
    public static final int GROUP_COUNT=5;
//			{
//					4,			//0-普通火焰
//					4,			//1-白亮火焰
//					1,			//2-普通烟
//					1,			//3-纯黑烟
//			};

    //粒子Y方向升腾的速度
    public static final float VY=0.08f;
//			{
//					0.05f,		//0-普通火焰
//					0.05f,		//1-白亮火焰
//					0.04f,		//2-普通烟
//					0.04f,		//3-纯黑烟
//			};


    //粒子更新物理线程休息时间
    public static final int THREAD_SLEEP=50;
//			{
//					60,		//0-普通火焰
//					60,		//1-白亮火焰
//					30,		//2-普通烟
//					30,		//3-纯黑烟
//			};
}
