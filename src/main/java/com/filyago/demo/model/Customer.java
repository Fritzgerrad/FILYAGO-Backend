package com.filyago.demo.model;

public class Customer {
    private Long id;
    private String firstname;
    private String lastname;
    private char gender;
    private String dateOfBirth;
    private double height;
    private double neckCircumference;
    private double armLength;
    private double upperArmCircumference;
    private double lowerArmCircumference;
    private double wristCircumference;
    private double chestCircumference;
    private double torsoLength;
    private double neckToKneeLength;
    private double bustSize;
    private double legLength;
    private double innerLegLength;
    private double waistCircumference;
    private double thighCircumference;
    private double lowerLegCircumference;
    private double feetSize;
    private String address;
    private String username;
    private String email;
    private String phoneNumber;
    private int noOfClothsSewn;

    public Customer(Long id,
                    String firstname,
                    String lastname,
                    char gender,
                    String dateOfBirth,
                    double height,
                    double neckCircumference,
                    double armLength,
                    double upperArmCircumference,
                    double lowerArmCircumference,
                    double wristCircumference,
                    double chestCircumference,
                    double torsoLength,
                    double neckToKneeLength,
                    double bustSize,
                    double legLength,
                    double innerLegLength,
                    double waistCircumference,
                    double thighCircumference,
                    double lowerLegCircumference,
                    double feetSize,
                    String address,
                    String username,
                    String email,
                    String phoneNumber,
                    int noOfClothsSewn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.neckCircumference = neckCircumference;
        this.armLength = armLength;
        this.upperArmCircumference = upperArmCircumference;
        this.lowerArmCircumference = lowerArmCircumference;
        this.wristCircumference = wristCircumference;
        this.chestCircumference = chestCircumference;
        this.torsoLength = torsoLength;
        this.neckToKneeLength = neckToKneeLength;
        this.bustSize = bustSize;
        this.legLength = legLength;
        this.innerLegLength = innerLegLength;
        this.waistCircumference = waistCircumference;
        this.thighCircumference = thighCircumference;
        this.lowerLegCircumference = lowerLegCircumference;
        this.feetSize = feetSize;
        this.address = address;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.noOfClothsSewn = noOfClothsSewn;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getNeckCircumference() {
        return neckCircumference;
    }

    public void setNeckCircumference(double neckCircumference) {
        this.neckCircumference = neckCircumference;
    }

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public double getUpperArmCircumference() {
        return upperArmCircumference;
    }

    public void setUpperArmCircumference(double upperArmCircumference) {
        this.upperArmCircumference = upperArmCircumference;
    }

    public double getLowerArmCircumference() {
        return lowerArmCircumference;
    }

    public void setLowerArmCircumference(double lowerArmCircumference) {
        this.lowerArmCircumference = lowerArmCircumference;
    }

    public double getWristCircumference() {
        return wristCircumference;
    }

    public void setWristCircumference(double wristCircumference) {
        this.wristCircumference = wristCircumference;
    }

    public double getChestCircumference() {
        return chestCircumference;
    }

    public void setChestCircumference(double chestCircumference) {
        this.chestCircumference = chestCircumference;
    }

    public double getTorsoLength() {
        return torsoLength;
    }

    public void setTorsoLength(double torsoLength) {
        this.torsoLength = torsoLength;
    }

    public double getNeckToKneeLength() {
        return neckToKneeLength;
    }

    public void setNeckToKneeLength(double neckToKneeLength) {
        this.neckToKneeLength = neckToKneeLength;
    }

    public double getBustSize() {
        return bustSize;
    }

    public void setBustSize(double bustSize) {
        this.bustSize = bustSize;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    public double getInnerLegLength() {
        return innerLegLength;
    }

    public void setInnerLegLength(double innerLegLength) {
        this.innerLegLength = innerLegLength;
    }

    public double getWaistCircumference() {
        return waistCircumference;
    }

    public void setWaistCircumference(double waistCircumference) {
        this.waistCircumference = waistCircumference;
    }

    public double getThighCircumference() {
        return thighCircumference;
    }

    public void setThighCircumference(double thighCircumference) {
        this.thighCircumference = thighCircumference;
    }

    public double getLowerLegCircumference() {
        return lowerLegCircumference;
    }

    public void setLowerLegCircumference(double lowerLegCircumference) {
        this.lowerLegCircumference = lowerLegCircumference;
    }

    public double getFeetSize() {
        return feetSize;
    }

    public void setFeetSize(double feetSize) {
        this.feetSize = feetSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNoOfClothsSewn() {
        return noOfClothsSewn;
    }

    public void setNoOfClothsSewn(int noOfClothsSewn) {
        this.noOfClothsSewn = noOfClothsSewn;
    }
}


