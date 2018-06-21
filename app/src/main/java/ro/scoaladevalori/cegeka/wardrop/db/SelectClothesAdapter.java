package ro.scoaladevalori.cegeka.wardrop.db;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import ro.scoaladevalori.cegeka.wardrop.BuildOutfitActivity;
import ro.scoaladevalori.cegeka.wardrop.R;
import ro.scoaladevalori.cegeka.wardrop.SelectClothesActivity;

import static ro.scoaladevalori.cegeka.wardrop.db.Memory.bitmapToString;
import static ro.scoaladevalori.cegeka.wardrop.db.Memory.resizeBitmap;
import static ro.scoaladevalori.cegeka.wardrop.db.Memory.stringToBitmap;

public class SelectClothesAdapter extends CursorAdapter{
    public SelectClothesAdapter(Context context, Cursor cursor, boolean autoRequery) {
        super(context, cursor, autoRequery);
    }
    ImageView chooseimg;
   public String imagestring;
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = LayoutInflater.from(context).inflate(R.layout.build_outfit_item_view,viewGroup,false);
        view.setTag(new SelectClothesAdapter.ViewHolder(view));
        return view;
    }



    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        final SelectClothesAdapter.ViewHolder holder = (SelectClothesAdapter.ViewHolder) view.getTag();

        final Memory memory = new Memory(cursor);

        holder.colorTextView.setText(memory.getColor());
        holder.categoryTextView.setText(memory.getCategory());
        holder.styleTextView.setText(memory.getStyle());
        holder.imageView.setImageBitmap(memory.getImage());
        holder.Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* ImageView chooseimg;
                chooseimg = holder.imageView;
                BitmapDrawable drawable = (BitmapDrawable) chooseimg.getDrawable();
                Bitmap bitmap = drawable.getBitmap();*/

               // Bitmap image = ((BitmapDrawable).getDrawable()).getBitmap();
                //imagestring = bitmapToString( resizeBitmap(memory.getImage()) );
                SelectClothesActivity.imagestring = bitmapToString(memory.getImage());

                //Intent intent = new Intent();
                //intent.putExtra("hintkey", imagestring);
                //extras.putString("hintkey", imagestring);


            }
        });

    }
    public class ViewHolder{
        final TextView colorTextView;
        final TextView categoryTextView;
        final TextView styleTextView;
        final ImageView imageView;
        final Button Btn;


        ViewHolder(View view){
            colorTextView = view.findViewById(R.id.list_item_color2);
            categoryTextView = view.findViewById(R.id.list_item_category2);
            styleTextView = view.findViewById(R.id.list_item_style2);
            imageView = view.findViewById(R.id.list_item_image_view_picture2);
            Btn = view.findViewById(R.id.chooseBtn);
        }

    }
}
