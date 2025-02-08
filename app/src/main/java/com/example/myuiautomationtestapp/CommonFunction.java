package com.example.myuiautomationtestapp;
import java.util.HashMap;
import java.util.Map;

public class CommonFunction {

    private final Map<String, String> countryCodeMap;

    public CommonFunction() {
        countryCodeMap = new HashMap<>();
        initializeCountryCodes();
    }

    private void initializeCountryCodes() {
        countryCodeMap.put("Egypt", "eg");
        countryCodeMap.put("United States", "us");
        countryCodeMap.put("Saudi Arabia", "sa");
        countryCodeMap.put("Israel", "il");
        countryCodeMap.put("Canada", "ca");
        countryCodeMap.put("United Kingdom", "gb");
        countryCodeMap.put("France", "fr");
        countryCodeMap.put("Germany", "de");
        countryCodeMap.put("Japan", "jp");
        countryCodeMap.put("China", "cn");
    }

    public String getCountryCode(String countryName) {
        String countryCode = countryCodeMap.get(countryName);
        if (countryCode == null) {
            throw new IllegalArgumentException("Unknown country: " + countryName);
        }
        return countryCode;
    }

    public Map<String, String> getAllCountries() {
        return new HashMap<>(countryCodeMap);
    }

    public void addOrUpdateCountryCode(String countryName, String countryCode) {
        countryCodeMap.put(countryName, countryCode);
    }

    public void removeCountryCode(String countryName) {
        countryCodeMap.remove(countryName);
    }
}
