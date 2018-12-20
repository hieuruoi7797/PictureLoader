package com.example.kithuat88.pictrueloader.data.repository;

import android.os.IInterface;

import com.example.kithuat88.pictrueloader.data.model.ItemImage;
import com.example.kithuat88.pictrueloader.data.source.ImageDataSource;

import java.util.List;

public class AnimalRepository {
    private static AnimalRepository sInstance;
    private ImageDataSource.RemoteDataSource mRemoteDataSource;

    private AnimalRepository(ImageDataSource.RemoteDataSource remoteDataSource) {
        this.mRemoteDataSource = remoteDataSource;
    }

    public static AnimalRepository getInstance(ImageDataSource.RemoteDataSource remoteDataSource) {
        if (sInstance == null) {
            sInstance = new AnimalRepository(remoteDataSource);
        }
        return sInstance;
    }

    public List<ItemImage> getGenres() {
        return mRemoteDataSource.getImageRemote("animal",20);
    }
}
