package cl.eme.pruebaperritos.model;

import java.util.List;

public class ImageBreed {

    private List<String> images;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "ImageBreed{" +
                "images=" + images +
                '}';
    }
}
