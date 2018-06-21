package ro.scoaladevalori.cegeka.wardrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import ro.scoaladevalori.cegeka.wardrop.db.MemoriesAdapter;
import ro.scoaladevalori.cegeka.wardrop.db.MemoryDbHelper;
import ro.scoaladevalori.cegeka.wardrop.db.SelectClothesAdapter;

import static android.widget.Toast.LENGTH_LONG;
import static ro.scoaladevalori.cegeka.wardrop.db.Memory.bitmapToString;
import static ro.scoaladevalori.cegeka.wardrop.db.Memory.resizeBitmap;
import static ro.scoaladevalori.cegeka.wardrop.db.Memory.stringToBitmap;

public class SelectClothesActivity extends AppCompatActivity {

    public static String imagestring;
    Button choosebtn;
   // ImageView chooseimg;
    Bundle extras;
    FloatingActionButton backBtn;

    private MemoryDbHelper dbHelper;
    private GridView gridView;
    public ImageView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_clothes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        this.gridView = (GridView) findViewById(R.id.activity_main_grid_view2);
        this.dbHelper = new MemoryDbHelper(SelectClothesActivity.this);
        this.gridView.setAdapter(new SelectClothesAdapter(SelectClothesActivity.this, this.dbHelper.readAllMemories(), false));

        backBtn = findViewById(R.id.intentBtn);
        //test = findViewById(R.id.imageView10);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // BuildOutfitActivity.imagevalue = imagestring;

                Intent intent = new Intent();
                intent.putExtra("hintkey", imagestring);
                setResult(2,intent);
                finish();

                //test.setImageBitmap(stringToBitmap(imagestring));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        ((CursorAdapter)gridView.getAdapter()).swapCursor(this.dbHelper.readAllMemories());
    }
}
