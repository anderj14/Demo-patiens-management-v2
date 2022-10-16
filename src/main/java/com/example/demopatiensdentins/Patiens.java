package com.example.demopatiensdentins;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Patiens {
    @Id
    @SequenceGenerator(
            name = "patience_sequence",
            sequenceName = "patience_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patience_sequence"

    )

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    @Transient
    private Integer age;
    private Long cedula;
    private String sex;
    private Double altura;
    private Double peso;
    private String disease;
    private String treatment;
    private String historyDiseases;
    private String chronicDisease;
    private String medicineUse;
    private LocalDate medicalAppointment;

    public Patiens() {
    }

    public Patiens(String firstName, String lastName, LocalDate dob, Integer age, Long cedula, String sex, Double altura, Double peso, String disease, String treatment, String historyDiseases, String chronicDisease, String medicineUse, LocalDate medicalAppointment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.cedula = cedula;
        this.sex = sex;
        this.altura = altura;
        this.peso = peso;
        this.disease = disease;
        this.treatment = treatment;
        this.historyDiseases = historyDiseases;
        this.chronicDisease = chronicDisease;
        this.medicineUse = medicineUse;
        this.medicalAppointment = medicalAppointment;
    }

    public Patiens(Long id, String firstName, String lastName, LocalDate dob, Integer age, Long cedula, String sex, Double altura, Double peso, String disease, String treatment, String historyDiseases, String chronicDisease, String medicineUse, LocalDate medicalAppointment) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.cedula = cedula;
        this.sex = sex;
        this.altura = altura;
        this.peso = peso;
        this.disease = disease;
        this.treatment = treatment;
        this.historyDiseases = historyDiseases;
        this.chronicDisease = chronicDisease;
        this.medicineUse = medicineUse;
        this.medicalAppointment = medicalAppointment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getHistoryDiseases() {
        return historyDiseases;
    }

    public void setHistoryDiseases(String historyDiseases) {
        this.historyDiseases = historyDiseases;
    }

    public String getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(String chronicDisease) {
        this.chronicDisease = chronicDisease;
    }

    public String getMedicineUse() {
        return medicineUse;
    }

    public void setMedicineUse(String medicineUse) {
        this.medicineUse = medicineUse;
    }

    public LocalDate getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(LocalDate medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    @Override
    public String toString() {
        return "Patiens{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", cedula=" + cedula +
                ", sex='" + sex + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", disease='" + disease + '\'' +
                ", treatment='" + treatment + '\'' +
                ", historyDiseases='" + historyDiseases + '\'' +
                ", chronicDisease='" + chronicDisease + '\'' +
                ", medicineUse='" + medicineUse + '\'' +
                ", medicalAppointment=" + medicalAppointment +
                '}';
    }
}
