package ro.scoaladevalori.cegeka.wardrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static ro.scoaladevalori.cegeka.wardrop.db.Memory.stringToBitmap;

public class BuildOutfitActivity extends AppCompatActivity {
    Button hatBtn;
    Button shirtBtn;
    Button jeansBtn;
    Button jacketBtn;
    Button coatBtn;
    Button shoesBtn;
    Button accesoriesBtn;
    Bundle extras;
    ImageView outfitphoto2;
    ImageView outfitphoto3;
    ImageView outfitphoto4;
    ImageView outfitphoto5;
    ImageView outfitphoto6;
    ImageView outfitphoto7;
    ImageView outfitphoto8;
    String imagevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_outfit);
        hatBtn = findViewById(R.id.hatbtn);
        shirtBtn = findViewById(R.id.shirtbtn);
        jeansBtn = findViewById(R.id.jeansbtn);
        jacketBtn = findViewById(R.id.jacketbtn);
        coatBtn = findViewById(R.id.coatbtn);
        shoesBtn = findViewById(R.id.shoesbtn);
        accesoriesBtn = findViewById(R.id.accesoriesbtn);

        outfitphoto2 = findViewById(R.id.imageView2);
        outfitphoto3 = findViewById(R.id.imageView3);
        outfitphoto4 = findViewById(R.id.imageView4);
        outfitphoto5 = findViewById(R.id.imageView5);
        outfitphoto6 = findViewById(R.id.imageView6);
        outfitphoto7 = findViewById(R.id.imageView7);
        outfitphoto8 = findViewById(R.id.imageView8);

        hatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuildOutfitActivity.this,SelectClothesActivity.class);
                startActivityForResult(intent, 2);

            }
        });
        shirtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuildOutfitActivity.this,SelectClothesActivity.class);
                startActivityForResult(intent, 3);

            }
        });
        jeansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuildOutfitActivity.this,SelectClothesActivity.class);
                startActivityForResult(intent, 6);
            }
        });
        jacketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuildOutfitActivity.this,SelectClothesActivity.class);
                startActivityForResult(intent, 5);

            }
        });
        coatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuildOutfitActivity.this,SelectClothesActivity.class);
                startActivityForResult(intent, 4);
            }
        });
        shoesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuildOutfitActivity.this,SelectClothesActivity.class);
                startActivityForResult(intent,7);
            }
        });
        accesoriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuildOutfitActivity.this,SelectClothesActivity.class);
                startActivityForResult(intent, 8);
            }
        });




    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 2 && requestCode==2) {
            imagevalue = data.getStringExtra("hintkey");
            outfitphoto2.setImageBitmap(stringToBitmap(imagevalue));
        }
        if (resultCode == 2 && requestCode==3) {
            imagevalue = data.getStringExtra("hintkey");
            outfitphoto3.setImageBitmap(stringToBitmap(imagevalue));
        }
        if (resultCode == 2 && requestCode==4) {
            imagevalue = data.getStringExtra("hintkey");
            outfitphoto4.setImageBitmap(stringToBitmap(imagevalue));
        }
        if (resultCode == 2 && requestCode==5) {
            imagevalue = data.getStringExtra("hintkey");
            outfitphoto5.setImageBitmap(stringToBitmap(imagevalue));
        }
        if (resultCode == 2 && requestCode==6) {
            imagevalue = data.getStringExtra("hintkey");
            outfitphoto6.setImageBitmap(stringToBitmap(imagevalue));
        }
        if (resultCode == 2 && requestCode==7) {
            imagevalue = data.getStringExtra("hintkey");
            outfitphoto7.setImageBitmap(stringToBitmap(imagevalue));
        }
        if (resultCode == 2 && requestCode==8) {
            imagevalue = data.getStringExtra("hintkey");
            outfitphoto8.setImageBitmap(stringToBitmap(imagevalue));
        }
    }


}
