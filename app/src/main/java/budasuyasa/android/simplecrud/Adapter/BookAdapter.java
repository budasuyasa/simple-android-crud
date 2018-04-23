package budasuyasa.android.simplecrud.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.List;

import budasuyasa.android.simplecrud.Config.ApiEndpoint;
import budasuyasa.android.simplecrud.Models.Book;
import budasuyasa.android.simplecrud.R;

/**
 * Created by asha on 4/23/2018.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    /**
     * Create ViewHolder class to bind list item view
     */
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public TextView description;
        public ImageView thumbnail;

        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.tvTitle);
            description = (TextView) itemView.findViewById(R.id.tvDescription);
            thumbnail = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    private List<Book> mListData;
    private Context mContext;

    public BookAdapter(Context context, List<Book> listData){
        mListData = listData;
        mContext = context;
    }

    private Context getmContext(){return mContext;}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View view = inflater.inflate(R.layout.book_list_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Book m = mListData.get(position);
        holder.title.setText(m.getName());
        holder.description.setText(m.getDescription());
        Picasso.get().load(ApiEndpoint.BASE + m.getImage()).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return mListData.size();
    }


}
