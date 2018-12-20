package com.example.kithuat88.pictrueloader.data.source;

import com.example.kithuat88.pictrueloader.data.model.ItemImage;

import java.util.List;

public interface ImageDataSource {

    interface RemoteDataSource extends ImageDataSource {
        List<ItemImage> getImageRemote(String genre, int limit);


    }
}
