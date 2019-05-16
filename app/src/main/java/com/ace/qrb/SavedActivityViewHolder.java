package com.ace.qrb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

class SavedActivityViewHolder extends RecyclerView.ViewHolder {

    public ImageView imgvSnapshot;

    public SavedActivityViewHolder(View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        imgvSnapshot = (ImageView) itemView.findViewById(R.id.imgv_item);
    }

    public void bindData(SavedActivityInfo activityInfo, View.OnClickListener itemOnClickListener) {
        itemView.setOnClickListener(itemOnClickListener);
        itemView.setTag(activityInfo);
        imgvSnapshot.setImageBitmap(activityInfo.snapshotBmp);
    }
}
