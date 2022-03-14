package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

import java.util.HashMap;

public class PreferenceMap {

    // static values
    public final HashMap<String, String> preferences;

    /**
     * Construct a {@code PreferenceMap}.
     */
    public PreferenceMap() {
        this.preferences = new HashMap<>();
    }

    /**
     * Adds the preference to the specified {@code Person}
     * @param key
     * @param value
     */
    public void addPreference(String key, String value) {
        requireNonNull(key, value);
        preferences.put(key, value);
    }

    public void addAllPreferences(PreferenceMap preferenceMap) {
        this.preferences.putAll(preferenceMap.preferences);
    }

    @Override
    public String toString() {
        String result = "";

        if (preferences.isEmpty()) {
            return "The client has no preferences.";
        }

        for (String str: preferences.keySet()) {
            result += String.format("%s: %s\n", str, preferences.get(str));
        }

        return result;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof PreferenceMap
            && preferences.equals(((PreferenceMap) other).preferences));
    }

    @Override
    public int hashCode() {
        return preferences.hashCode();
    }

    public int size() {
        return preferences.size();
    }
}