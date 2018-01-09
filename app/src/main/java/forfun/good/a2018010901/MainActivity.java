package forfun.good.a2018010901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
//        menu.add(0,1,0,"add");
//        menu.add(0,2,0,"edit"); 用程式碼寫menu的方式
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.menu_ADD:
                Toast.makeText(MainActivity.this,"按下ADD",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_Edit:
                Toast.makeText(MainActivity.this, "使用者按下 Edit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_share:
                Toast.makeText(MainActivity.this,"分享一下",Toast.LENGTH_SHORT).show();
                break;
                        }
//        if (item.getTitle().equals("ADD"))
//        {
//            Toast.makeText(MainActivity.this,"出現AD",Toast.LENGTH_SHORT).show();
//        }
        return super.onOptionsItemSelected(item);
    }
}
