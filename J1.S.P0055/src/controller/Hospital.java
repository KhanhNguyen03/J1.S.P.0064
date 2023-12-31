/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import model.Doctor;
import repository.DoctorHash;
import repository.IDoctorHash;
import view.Menu;


public class Hospital extends Menu {

    private Map<String, Doctor> doctorList;
    IDoctorHash mn;
    static String[] mc = {"Add doctor", "Update doctor", "Delete doctor", "Search doctor", "Exit"};

    public Hospital() {
        super("Doctor", mc);
        doctorList = new HashMap<>();
        mn = new DoctorHash();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:{
                mn.addDoctor(doctorList);
                break;}
            case 2 :{
                mn.updateDoctor(doctorList);
                break;
            }
            case 3 :{
                mn.deleteDoctor(doctorList);
                break;
            }
            case 4 :{
                mn.searchDoctor(doctorList);
                break;
            }
            case 5 :{
                System.exit(0);
                break;
            }
        }
    }
}
