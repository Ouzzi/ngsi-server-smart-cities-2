package server.helpers;

import org.json.JSONObject;
import org.json.XML;

public class Helpers {

    /**
     * Erzeugt ein NGSI-konformes JSON-Objekt aus einem zweidimensionalen String-Array.
     *
     * @param keyValuePairs Zweidimensionales String-Array, das Schlüssel-Wert-Paare enthält.
     * @return String Repräsentation des JSON-Objekts.
     */
    public static String createNgsiJsonToken(String[][] keyValuePairs) {
        // Erzeugt ein JSONObject
        JSONObject jsonObject = new JSONObject();

        // Iteriert über alle Schlüssel-Wert-Paare und fügt sie dem JSON-Objekt hinzu
        for (String[] pair : keyValuePairs) {
            if (pair != null && pair.length == 2) { // Stellt sicher, dass jedes Paar gültig ist
                jsonObject.put(pair[0], pair[1]);
            }
        }

        // Gibt die String-Repräsentation des JSON-Objekts zurück
        return jsonObject.toString();
    }

    public static String convertToXml(String jsonStr) {
        JSONObject json = new JSONObject(jsonStr);
        return XML.toString(json);
    }
}
