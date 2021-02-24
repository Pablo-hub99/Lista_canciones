package jesuitas.dam.lista_canciones;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tablename = "cancion_table")
public class Canciones {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Cancion")
    private final String mCancion;

    public Canciones(@NonNull String mCancion) { this.mCancion = mCancion;}


    public String getCancion() { return mCancion;}
}
