package cl.eme.pruebaperritos.presenter;

import android.util.Log;

import java.util.List;

import cl.eme.pruebaperritos.model.IPresenterRepository;
import cl.eme.pruebaperritos.model.Repository;

public class PresenterBreed implements IPresenterRepository {

    private static final String TAG = "InfoLog";
    private IPresenterBreedView viewBreed;
    private Repository repository;

    public PresenterBreed(IPresenterBreedView viewBreed, Repository repository) {
        this.viewBreed = viewBreed;
        this.repository = repository;
        Log.d(TAG, "PresenterBreed: seteando el presentador del repositorio");
        repository.setPresenterBreed(this);
        Log.d(TAG, "PresenterBreed: llamando al metodo LoadBreedList");
        repository.loadBreedList();
    }

    @Override
    public void showBreed(List<String> breeds) {
        Log.d(TAG, "showBreed: Llamando a ShowBreed en Presenter" +breeds);
        viewBreed.showBreed(breeds);

    }
}
