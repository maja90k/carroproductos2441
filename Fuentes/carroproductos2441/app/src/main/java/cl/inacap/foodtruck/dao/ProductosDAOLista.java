package cl.inacap.foodtruck.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.foodtruck.dto.Producto;

public class ProductosDAOLista implements ProductosDAO {
    private List<Producto> productos = new ArrayList<>();
    //2. como atributo de la misma clase debe existir una instancia
    //estatica de si misma

    private static ProductosDAOLista instancia;
    //implementar un patron singleton
    //1 .constructor de la clase privado.
    private ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Coca cola zero");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque gravida, lacus vel condimentum tristique, sapien magna lacinia purus, ut tempus quam sapie" +
                "n ut ligula. Nunc dolor dolor, tempor at arcu vitae, eleifend commodo neque.");
        p.setFoto("https://i5.walmartimages.com/asr/f77327f1-ebf6-4cf3-8e96-69063cb94281_1.ed17b3ae7d1bb3a6897cb4e6c019d29f.jpeg");
        productos.add(p);

        p = new Producto();
        p.setNombre("Centella ");
        p.setDescripcion("daskjladskjonsectetur adipiscing elit. Qonsectetur adipiscing elit. Qd Qonsectetur adipiscing elit. Qd ");
        p.setFoto("http://ventasatc.cl/wp-content/uploads/2016/12/Centella-Transparente-.png");
        productos.add(p);

        p = new Producto();
        p.setNombre("CACA");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elitLorem ipsum dolor sit amet, consectetur adipiscing elit");
        p.setFoto("https://http2.mlstatic.com/D_NQ_NP_823181-MCO31080148727_062019-O.jpg");
        productos.add(p);
    }
    public static ProductosDAOLista getInstance(){
        if(instancia==null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }

    @Override
    public List<Producto> getAll() {

        return productos;
    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return null;
    }
    //3. metodo estatico que permita el acceso de la unica instancia


}
