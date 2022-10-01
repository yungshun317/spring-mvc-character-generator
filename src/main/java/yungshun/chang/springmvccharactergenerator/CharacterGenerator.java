package yungshun.chang.springmvccharactergenerator;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;

public class CharacterGenerator {

    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName;

    private String gender;

    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=120, message="must be less than or equal to 120")
    private int age;

    private String country;

    private LinkedHashMap<String, String> countryOptions;

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
    private String postalCode;

    private String[] positivePersonality;

    public CharacterGenerator() {

        // Populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "United States of America");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String[] getPositivePersonality() {
        return positivePersonality;
    }

    public void setPositivePersonality(String[] positivePersonality) {
        this.positivePersonality = positivePersonality;
    }
}
