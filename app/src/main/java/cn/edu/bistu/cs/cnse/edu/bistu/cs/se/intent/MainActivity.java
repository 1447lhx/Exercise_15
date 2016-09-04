package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.intent;

import android.Manifest;
 import android.content.Intent;
 import android.content.pm.PackageManager;
 import android.net.Uri;
 import android.os.Build;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.Toast;
 import java.io.UnsupportedEncodingException;
 import java.net.URLEncoder;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.ButtonAnother);
        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent=new Intent();
                                          intent.setAction("starAnotherActivity");
                                          intent.addCategory("android.intent.category.DEFAULT");
                                          intent.setData(Uri.parse("student://www.lhx:1447/android"));
                                          intent.setAction(Intent.ACTION_DIAL);
                                          intent.setData(Uri.parse("tel:18810911989"));
                                          startActivity(intent);
                                      }
                                  }
        );
    }


}
