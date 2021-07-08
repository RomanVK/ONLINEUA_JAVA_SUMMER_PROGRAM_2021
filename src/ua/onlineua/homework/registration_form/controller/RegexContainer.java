package ua.onlineua.homework.registration_form.controller;

/**
 * Interface {@code RegexContainer} has regular expressions for checking name and login values.
 */
public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЩЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}
