package reader.fanfan.com.arcbanner;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by fanz on 2018/9/18.
 * QQ:304916496
 * PS: Not easy to write code, please indicate.
 */

class GlideImageLoader  extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
         注意：
         1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
         2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
         传输的到的是什么格式，那么这种就使用Object接收和返回，强转成你传输的类型
         */
        //Glide 加载图片简单用法
        Glide.with(context).load(path).into(imageView);
    }

    //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
    @Override
    public ImageView createImageView(Context context) {
        //自己自定义的具有图片加载功能的ImageView
        BannerImage arcImageView = new BannerImage(context);
        return arcImageView;
    }

}