package co.edu.konradlorenz.myapplication.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static restaurant [] restaurantes = {
            new restaurant("EL TALLER","El mejor restaurante de bomberos")
            ,new restaurant("El FAUNO","el restaurante veneco que no da nada")
            ,new restaurant("DICALU","buena comida mal ambiente")
            ,new restaurant("KONRAD LORENZ","es caro muy mala calidad")
            ,new restaurant("NOTARIA","buena comida no se")
            ,new restaurant("La Fragata Giratorio","muy caro")
            ,new restaurant("Céntrico","muy del centro")
            ,new restaurant("La Puerta de Alcalá Bogotá","muy de la izquierda")
            ,new restaurant("Restaurante Daniel","buena daniel")
            ,new restaurant("La Provence de Andrei","andrie es re malo")
            ,new restaurant("Nazca","el que valla el que le nazca")
    };
    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 10;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), restaurantes[position].name ,restaurantes[position].detail);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}