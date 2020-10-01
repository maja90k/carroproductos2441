package cl.inacap.foodtruck.dao;

import java.util.List;

import cl.inacap.foodtruck.dto.Producto;

public interface ProductosDAO {

    List<Producto> getAll();
    Producto save(Producto p);



}
