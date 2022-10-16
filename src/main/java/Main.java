package main.java;


import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class Main {
    public static String XML_PRUEBA ="<Comercio>\n" +
            "\t<lugar cp=\"41920\">San Juan de Aznalfarache</lugar>\n" +
            "\t<Compras>\n" +
            "\t\t<compra>\n" +
            "\t\t\t<fecha>16-08-2022</fecha>\n" +
            "\t\t\t\t\t\t<ticket>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Tomates</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,99</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Taboulé</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,95</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Tortilla</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>2,69</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t</ticket>\n" +
            "\t\t</compra>\n" +
            "\t\t<compra>\n" +
            "\t\t\t<fecha>29-08-2022</fecha>\n" +
            "\t\t\t<ticket>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Ensalada</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,09</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Pasta</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,65</precio_unidad>\n" +
            "\t\t\t\t\t<unidades>2</unidades>\n" +
            "\t\t\t\t\t<descuento>0,35</descuento>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Taboulé</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,95</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Huevos L</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,19</precio_unidad>\n" +
            "\t\t\t\t\t<descuento>0,12</descuento>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Frutos secos</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>2,69</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Hummus</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>0,95</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Zumo naranja</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,49</precio_unidad>\n" +
            "\t\t\t\t\t<unidades>2</unidades>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Ciruelas</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>2,99</precio_unidad>\n" +
            "\t\t\t\t\t<unidades>0,464</unidades>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t</ticket>\n" +
            "\t\t</compra>\n" +
            "\t\t<compra>\n" +
            "\t\t\t<fecha>12-09-2022</fecha>\n" +
            "\t\t\t\t\t\t<ticket>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Mozzarella</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>0,95</precio_unidad>\n" +
            "\t\t\t\t\t<unidades>2</unidades>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Margarina</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,49</precio_unidad>\n" +
            "\t\t\t\t\t<descuento>0,45</descuento>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t\t\t\t\t\t<producto>\n" +
            "\t\t\t\t\t<descripcion>Uva</descripcion>\n" +
            "\t\t\t\t\t<precio_unidad>1,79</precio_unidad>\n" +
            "\t\t\t\t</producto>\n" +
            "\t\t\t</ticket>\n" +
            "\t\t</compra>\n" +
            "\t</Compras>\n" +
            "</Comercio>";
    public static void main(String[] args) {

        try {
            //Creamos el objeto que nos ayudara a convertir el XML en JSON
            JSONObject json = XML.toJSONObject(XML_PRUEBA);
            //Identamos el json, le damos formato
            String jsonFormatado = json.toString();
            System.out.println(jsonFormatado);

            String xml  = XML.toString(json);

            System.out.println(xml);

        } catch (JSONException je) {
            System.out.println(je.toString());
        }

    }
}