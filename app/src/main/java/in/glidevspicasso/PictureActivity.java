package in.glidevspicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.net.URL;

public class PictureActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView mImageGlide;
    private ImageView mImagePicasso;
    private Button mBtnLoadImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        mImageGlide = findViewById(R.id.imageView);
        mImagePicasso = findViewById(R.id.imageView2);
        mBtnLoadImage = findViewById(R.id.button);

        mBtnLoadImage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Glide.with(this).load(R.drawable.images).into(mImageGlide);
                Picasso.with(this).load(R.drawable.images).into(mImagePicasso);
                break;
        }
    }
}
