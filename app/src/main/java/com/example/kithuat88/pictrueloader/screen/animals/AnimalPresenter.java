package com.example.kithuat88.pictrueloader.screen.animals;

import com.example.kithuat88.pictrueloader.data.repository.AnimalRepository;

public class AnimalPresenter implements AnimalContract.Presenter {
    private AnimalContract.View mView;
    private AnimalRepository mAnimalRepository;

    public AnimalPresenter(AnimalContract.View view, AnimalRepository animalRepository) {
        mView = view;
        mAnimalRepository = animalRepository;
    }

    @Override
    public void loadImage() {
        mView.showImage(mAnimalRepository.getGenres());
    }
}
