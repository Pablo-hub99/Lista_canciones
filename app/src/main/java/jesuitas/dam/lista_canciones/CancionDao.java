package jesuitas.dam.lista_canciones;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CancionDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Canciones canciones);

    @Query("DELETE FROM cancion_table")
    void deleteAll();

    @Query("SELECT * FROM cancion_table ORDER BY Año des")
    LiveData<List<Canciones>> getAlphabetizedWords();


}
