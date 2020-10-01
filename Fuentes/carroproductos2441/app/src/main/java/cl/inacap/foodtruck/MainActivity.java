package cl.inacap.foodtruck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import cl.inacap.foodtruck.adapters.ProductosArrayAdapters;
import cl.inacap.foodtruck.dao.ProductosDAO;
import cl.inacap.foodtruck.dao.ProductosDAOLista;
import cl.inacap.foodtruck.dto.Producto;

public class MainActivity extends AppCompatActivity {

    private ListView productosLv;
    private List<Producto> productos;
    private ProductosArrayAdapters adaptador;
    private ProductosDAO productosDAO = ProductosDAOLista.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar)findViewById(R.id.toolBar));
        productos = productosDAO.getAll();
        adaptador = new ProductosArrayAdapters(this,
                R.layout.productos_list, productos);
        productosLv = findViewById(R.id.productos_lv);
        productosLv.setAdapter(adaptador);

    }
}