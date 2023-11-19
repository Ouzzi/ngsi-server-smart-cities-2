package main.helpers;

import org.json.JSONObject;

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
}
